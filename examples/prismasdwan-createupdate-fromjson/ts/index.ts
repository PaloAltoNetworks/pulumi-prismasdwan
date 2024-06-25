import * as pulumi from "@pulumi/pulumi";
import * as prismasdwan from "@pulumi/prismasdwan";
import {SiteConfigJSON} from "./json_data";

// Script needs the following pulumi config items set prior to running
// pulumi config set prismasdwan:clientId "your-client-id-here"
// pulumi config set --secret prismasdwan:clientSecret "your-client-secret-here"
// pulumi config set prismasdwan:scope "tsg_id:your-tsg-id-here"

// Raw JSON template for a site with dual ION devices. This can be modified multiple ways:
// - Raw text editing of the JSON in the "json_data.ts" file.
// - Programmatically prior to use by code or function.

// Site name to create/modify is extracted from the JSON.
let destinationSiteName: string = extractSiteNameFromJSON(SiteConfigJSON);

// *** Change the properties of the template site to the destination site. ***
function ModifyDestinationSite(siteConfigJSON: any, siteName: string): string {
    // modify JSON object values programmatically as desired.

    // Give the site a random description
    siteConfigJSON['sites v4.9'][siteName]['description'] = "Desc with Random: " + String(Math.floor(Math.random() * 1000));

    return JSON.stringify(siteConfigJSON)
}


// Rest of script below.
// Ensure required config items are set
let prismaSdwanConfig = new pulumi.Config("prismasdwan")
let myClientID = prismaSdwanConfig.require("clientId")
let myClientSecret = prismaSdwanConfig.requireSecret("clientSecret")
let myScope = prismaSdwanConfig.require("scope")


function ApplySiteChanges(newSiteConfig: string, siteName: string): [pulumi.Output<boolean>, pulumi.Output<string>] {
    // check for undefined site name or config
    console.log("Site Name: ", siteName);
    console.log("Site Config: ", newSiteConfig);
    let siteObj = new prismasdwan.Site(siteName, {config: newSiteConfig})
    return [siteObj.isDeployed, siteObj.config]
}

// Extract site name from JSON
function extractSiteNameFromJSON(siteConfig: any): string {
    let siteArray = Object.keys(siteConfig['sites v4.9']);
    // check number of devices
    if (siteArray.length == 1) {
        // extract site name
        return siteArray[0]
    } else {
        throw new TypeError('Needed exactly "1" site in site config JSON, got: ' + siteArray.length);
    }
}

const [siteIsDeployed, siteConfigResult] = ApplySiteChanges(ModifyDestinationSite(SiteConfigJSON, destinationSiteName), destinationSiteName);

export const DestinationSiteName = destinationSiteName;
export const DestinationSiteConfig = siteConfigResult;
export const DestinationSiteDeploySuccess = siteIsDeployed;
