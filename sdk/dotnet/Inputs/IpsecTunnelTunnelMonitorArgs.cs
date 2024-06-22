// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IpsecTunnelTunnelMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination IP to send ICMP probe.
        /// </summary>
        [Input("destinationIp", required: true)]
        public Input<string> DestinationIp { get; set; } = null!;

        /// <summary>
        /// Enable tunnel monitoring on this tunnel. Default: `true`.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Which proxy-id (or proxy-id-v6) the monitoring traffic will use.
        /// </summary>
        [Input("proxyId")]
        public Input<string>? ProxyId { get; set; }

        public IpsecTunnelTunnelMonitorArgs()
        {
        }
        public static new IpsecTunnelTunnelMonitorArgs Empty => new IpsecTunnelTunnelMonitorArgs();
    }
}
