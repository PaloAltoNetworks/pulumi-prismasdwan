import * as pulumi from "@pulumi/pulumi";
import * as prismasdwan from "@pulumi/prismasdwan";

// Script needs the following pulumi config items set prior to running
// pulumi config set prismasdwan:clientId "your-client-id-here"
// pulumi config set --secret prismasdwan:clientSecret "your-client-secret-here"
// pulumi config set prismasdwan:scope "tsg_id:your-tsg-id-here"

// Set name of site you would like to use as the "golden template"
let templateSiteName: string = "my-template-site-name";

// Set name of the site you would like to create/modify using the template.
let destinationSiteName: string = "my-destination-site-name";

// *** Change the properties of the template site to the destination site. ***
async function ModifyTemplateSiteConfig(getSitePromise: Promise<prismasdwan.GetSiteResult>): Promise<string> {
    // get the config from the template site, marshall it to an object.
    let value = await getSitePromise;
    let destinationSiteConfig = JSON.parse(value.config)

    // Modify site name to destination
    destinationSiteConfig['sites v4.9'][destinationSiteName] = destinationSiteConfig['sites v4.9'][templateSiteName]
    delete destinationSiteConfig['sites v4.9'][templateSiteName]

    // Give the site a random description
    destinationSiteConfig['sites v4.9'][destinationSiteName]['description'] = "Desc with Random: " + String(Math.floor(Math.random() * 1000));

    // Update address & lat/long of site
    destinationSiteConfig['sites v4.9'][destinationSiteName]['address']['street'] = "500 W. Madison Street";
    destinationSiteConfig['sites v4.9'][destinationSiteName]['address']['city'] = "New York";
    destinationSiteConfig['sites v4.9'][destinationSiteName]['address']['state'] = "NY";
    destinationSiteConfig['sites v4.9'][destinationSiteName]['address']['post_code'] = "10022";
    destinationSiteConfig['sites v4.9'][destinationSiteName]['address']['country'] = "US";
    destinationSiteConfig['sites v4.9'][destinationSiteName]['location']['latitude'] = 40.7593112;
    destinationSiteConfig['sites v4.9'][destinationSiteName]['location']['longitude'] = -73.9747456;

    // select new devices for the site
    let newDeviceArray = [destinationSiteName+"-primary", destinationSiteName+"-secondary"]
    let oldDeviceArray = Object.keys(destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'])
    // check number of devices
    if (oldDeviceArray.length == newDeviceArray.length) {
        // rename first device
        destinationSiteConfig['sites v4.9'][destinationSiteName]["elements v3.1"][newDeviceArray[0]] = destinationSiteConfig['sites v4.9'][destinationSiteName]["elements v3.1"][oldDeviceArray[0]]
        delete destinationSiteConfig['sites v4.9'][destinationSiteName]["elements v3.1"][oldDeviceArray[0]]

        // set code version, serial, and device type on first device
        destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][newDeviceArray[0]]['software_version'] = "6.3.1-b8";
        destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][newDeviceArray[0]]['serial_number'] = "027301-005973-3946";
        //destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][newDeviceArray[0]]['model_name'] = "ion 3200";

        // rename first device
        destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][newDeviceArray[1]] = destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][oldDeviceArray[1]]
        delete destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][oldDeviceArray[1]]

        // set code version, serial, and device type on first device
        destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][newDeviceArray[1]]['software_version'] = "6.3.1-b8";
        destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][newDeviceArray[1]]['serial_number'] = "027301-005967-8597";
        //destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1'][newDeviceArray[1]]['model_name'] = "ion 3200";


        // If you want to create a site without any elements, just delete the elements key.
        // This can also be done as an update to an existing site to remove all devices/elements.
        // delete destinationSiteConfig['sites v4.9'][destinationSiteName]['elements v3.1']
    }
    return JSON.stringify(destinationSiteConfig)
}


// Rest of script below.
// Ensure required config items are set
let prismaSdwanConfig = new pulumi.Config("prismasdwan")
let myClientID = prismaSdwanConfig.require("clientId")
let myClientSecret = prismaSdwanConfig.requireSecret("clientSecret")
let myScope = prismaSdwanConfig.require("scope")

let getSitePromise = prismasdwan.getSite({
    siteName: templateSiteName,
});

async function GetSite(getSitePromise: Promise<prismasdwan.GetSiteResult>): Promise<string> {
    let value = await getSitePromise;
    return value.config;
}

async function ApplySiteChanges(newSiteConfig: Promise<string>) {
    let fulfilledNewConfig = await newSiteConfig;
    let SiteObj = new prismasdwan.Site(destinationSiteName, {config: fulfilledNewConfig});
    return SiteObj.isDeployed
}

export const TemplateSiteName = templateSiteName;
export const TemplateSiteConfig = GetSite(getSitePromise);
export const DestinationSiteName = destinationSiteName;
export const DestinationSiteConfig = ModifyTemplateSiteConfig(getSitePromise);
export const DestinationSiteDeploySuccess = ApplySiteChanges(DestinationSiteConfig);
