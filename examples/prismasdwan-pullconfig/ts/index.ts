import * as pulumi from "@pulumi/pulumi";
import * as prismasdwan from "@pulumi/prismasdwan";
let fs = require('fs');

// Script needs the following pulumi config items set prior to running
// pulumi config set prismasdwan:clientId "your-client-id-here"
// pulumi config set --secret prismasdwan:clientSecret "your-client-secret-here"
// pulumi config set prismasdwan:scope "tsg_id:your-tsg-id-here"

// Set name of site you would like to download/export configuration of.
let siteName: string = "my-site-name";

// After this script completes, JSON config for the site will be available in output.
// To save to file, use the pulumi stack output:
// pulumi stack output SiteConfig > my-site-name-config.json
// Or, if you want to write directly to a file, set the variable below from 'undefined' to a file path
// let saveJsonToFile: string = "./my-site-name-config.json";
let saveJsonToFile: string; // = "./my-site-name-config.json";


// Full script below.
// Ensure required config items are set
let prismaSdwanConfig = new pulumi.Config("prismasdwan")
let myClientID = prismaSdwanConfig.require("clientId")
let myClientSecret = prismaSdwanConfig.requireSecret("clientSecret")
let myScope = prismaSdwanConfig.require("scope")

let getSitePromise = prismasdwan.getSite({
    siteName: siteName,
});

async function GetSite(getSitePromise: Promise<prismasdwan.GetSiteResult>) {
    let value = await getSitePromise;
    if (saveJsonToFile != undefined ) {
        // we will pretty print (indent = 4) the file when directly writing.
        fs.writeFile(saveJsonToFile, JSON.stringify(JSON.parse(value.config), undefined, 4), function (err: Error) {
                    if (err) {
                        console.log(err);
                    }
        });
    }
    return value.config;
}
export const SiteName = siteName;
export const SiteConfig = GetSite(getSitePromise);
