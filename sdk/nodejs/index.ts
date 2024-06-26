// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { GetSiteArgs, GetSiteResult, GetSiteOutputArgs } from "./getSite";
export const getSite: typeof import("./getSite").getSite = null as any;
export const getSiteOutput: typeof import("./getSite").getSiteOutput = null as any;
utilities.lazyLoad(exports, ["getSite","getSiteOutput"], () => require("./getSite"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { SiteArgs, SiteState } from "./site";
export type Site = import("./site").Site;
export const Site: typeof import("./site").Site = null as any;
utilities.lazyLoad(exports, ["Site"], () => require("./site"));


// Export sub-modules:
import * as config from "./config";

export {
    config,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "prismasdwan:index/site:Site":
                return new Site(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("prismasdwan", "index/site", _module)
pulumi.runtime.registerResourcePackage("prismasdwan", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:prismasdwan") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});