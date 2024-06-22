// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IkeGatewayProtocolIkev1GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Dpd param.
        /// </summary>
        [Input("dpd")]
        public Input<Inputs.IkeGatewayProtocolIkev1DpdGetArgs>? Dpd { get; set; }

        /// <summary>
        /// The IkeCryptoProfile param.
        /// </summary>
        [Input("ikeCryptoProfile")]
        public Input<string>? IkeCryptoProfile { get; set; }

        public IkeGatewayProtocolIkev1GetArgs()
        {
        }
        public static new IkeGatewayProtocolIkev1GetArgs Empty => new IkeGatewayProtocolIkev1GetArgs();
    }
}
