// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieves a config item.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scm from "@pulumi/scm";
 *
 * const example = scm.getInternalDnsServer({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getInternalDnsServer(args: GetInternalDnsServerArgs, opts?: pulumi.InvokeOptions): Promise<GetInternalDnsServerResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getInternalDnsServer:getInternalDnsServer", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getInternalDnsServer.
 */
export interface GetInternalDnsServerArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getInternalDnsServer.
 */
export interface GetInternalDnsServerResult {
    /**
     * The DomainNames param.
     */
    readonly domainNames: string[];
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Name param.
     */
    readonly name: string;
    /**
     * The Primary param.
     */
    readonly primary: string;
    /**
     * The Secondary param.
     */
    readonly secondary: string;
    readonly tfid: string;
}
/**
 * Retrieves a config item.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scm from "@pulumi/scm";
 *
 * const example = scm.getInternalDnsServer({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getInternalDnsServerOutput(args: GetInternalDnsServerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInternalDnsServerResult> {
    return pulumi.output(args).apply((a: any) => getInternalDnsServer(a, opts))
}

/**
 * A collection of arguments for invoking getInternalDnsServer.
 */
export interface GetInternalDnsServerOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
