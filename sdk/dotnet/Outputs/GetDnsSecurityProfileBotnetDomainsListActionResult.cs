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
    public sealed class GetDnsSecurityProfileBotnetDomainsListActionResult
    {
        /// <summary>
        /// The Alert param.
        /// </summary>
        public readonly bool Alert;
        /// <summary>
        /// The Allow param.
        /// </summary>
        public readonly bool Allow;
        /// <summary>
        /// The Block param.
        /// </summary>
        public readonly bool Block;
        /// <summary>
        /// The Sinkhole param.
        /// </summary>
        public readonly bool Sinkhole;

        [OutputConstructor]
        private GetDnsSecurityProfileBotnetDomainsListActionResult(
            bool alert,

            bool allow,

            bool block,

            bool sinkhole)
        {
            Alert = alert;
            Allow = allow;
            Block = block;
            Sinkhole = sinkhole;
        }
    }
}
