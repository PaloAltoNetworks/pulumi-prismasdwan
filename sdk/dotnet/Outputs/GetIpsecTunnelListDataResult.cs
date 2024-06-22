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
    public sealed class GetIpsecTunnelListDataResult
    {
        /// <summary>
        /// Enable Anti-Replay check on this tunnel.
        /// </summary>
        public readonly bool AntiReplay;
        /// <summary>
        /// The AutoKey param.
        /// </summary>
        public readonly Outputs.GetIpsecTunnelListDataAutoKeyResult AutoKey;
        /// <summary>
        /// Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
        /// </summary>
        public readonly bool CopyTos;
        /// <summary>
        /// allow GRE over IPSec. Default: `false`.
        /// </summary>
        public readonly bool EnableGreEncapsulation;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The TunnelMonitor param.
        /// </summary>
        public readonly Outputs.GetIpsecTunnelListDataTunnelMonitorResult TunnelMonitor;

        [OutputConstructor]
        private GetIpsecTunnelListDataResult(
            bool antiReplay,

            Outputs.GetIpsecTunnelListDataAutoKeyResult autoKey,

            bool copyTos,

            bool enableGreEncapsulation,

            string id,

            string name,

            Outputs.GetIpsecTunnelListDataTunnelMonitorResult tunnelMonitor)
        {
            AntiReplay = antiReplay;
            AutoKey = autoKey;
            CopyTos = copyTos;
            EnableGreEncapsulation = enableGreEncapsulation;
            Id = id;
            Name = name;
            TunnelMonitor = tunnelMonitor;
        }
    }
}
