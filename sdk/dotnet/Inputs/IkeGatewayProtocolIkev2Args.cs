// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IkeGatewayProtocolIkev2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Dpd param.
        /// </summary>
        [Input("dpd")]
        public Input<Inputs.IkeGatewayProtocolIkev2DpdArgs>? Dpd { get; set; }

        /// <summary>
        /// The IkeCryptoProfile param.
        /// </summary>
        [Input("ikeCryptoProfile")]
        public Input<string>? IkeCryptoProfile { get; set; }

        public IkeGatewayProtocolIkev2Args()
        {
        }
        public static new IkeGatewayProtocolIkev2Args Empty => new IkeGatewayProtocolIkev2Args();
    }
}
