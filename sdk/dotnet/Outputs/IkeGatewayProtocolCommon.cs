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
    public sealed class IkeGatewayProtocolCommon
    {
        /// <summary>
        /// The Fragmentation param.
        /// </summary>
        public readonly Outputs.IkeGatewayProtocolCommonFragmentation? Fragmentation;
        /// <summary>
        /// The NatTraversal param.
        /// </summary>
        public readonly Outputs.IkeGatewayProtocolCommonNatTraversal? NatTraversal;
        /// <summary>
        /// The PassiveMode param.
        /// </summary>
        public readonly bool? PassiveMode;

        [OutputConstructor]
        private IkeGatewayProtocolCommon(
            Outputs.IkeGatewayProtocolCommonFragmentation? fragmentation,

            Outputs.IkeGatewayProtocolCommonNatTraversal? natTraversal,

            bool? passiveMode)
        {
            Fragmentation = fragmentation;
            NatTraversal = natTraversal;
            PassiveMode = passiveMode;
        }
    }
}
