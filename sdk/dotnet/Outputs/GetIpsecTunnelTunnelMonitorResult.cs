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
    public sealed class GetIpsecTunnelTunnelMonitorResult
    {
        /// <summary>
        /// Destination IP to send ICMP probe.
        /// </summary>
        public readonly string DestinationIp;
        /// <summary>
        /// Enable tunnel monitoring on this tunnel. Default: `true`.
        /// </summary>
        public readonly bool Enable;
        /// <summary>
        /// Which proxy-id (or proxy-id-v6) the monitoring traffic will use.
        /// </summary>
        public readonly string ProxyId;

        [OutputConstructor]
        private GetIpsecTunnelTunnelMonitorResult(
            string destinationIp,

            bool enable,

            string proxyId)
        {
            DestinationIp = destinationIp;
            Enable = enable;
            ProxyId = proxyId;
        }
    }
}
