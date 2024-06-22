// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class HipObjectNetworkInfoCriteriaNetworkIs
    {
        /// <summary>
        /// The Mobile param. Ensure that only one of the following is specified: `mobile`, `unknown`, `wifi`
        /// </summary>
        public readonly Outputs.HipObjectNetworkInfoCriteriaNetworkIsMobile? Mobile;
        /// <summary>
        /// The Unknown param. Ensure that only one of the following is specified: `mobile`, `unknown`, `wifi`
        /// </summary>
        public readonly bool? Unknown;
        /// <summary>
        /// The Wifi param. Ensure that only one of the following is specified: `mobile`, `unknown`, `wifi`
        /// </summary>
        public readonly Outputs.HipObjectNetworkInfoCriteriaNetworkIsWifi? Wifi;

        [OutputConstructor]
        private HipObjectNetworkInfoCriteriaNetworkIs(
            Outputs.HipObjectNetworkInfoCriteriaNetworkIsMobile? mobile,

            bool? unknown,

            Outputs.HipObjectNetworkInfoCriteriaNetworkIsWifi? wifi)
        {
            Mobile = mobile;
            Unknown = unknown;
            Wifi = wifi;
        }
    }
}
