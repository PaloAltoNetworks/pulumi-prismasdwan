// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetIpsecTunnel
    {
        /// <summary>
        /// Retrieves a config item.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Scm = Pulumi.Scm;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Scm.GetIpsecTunnel.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIpsecTunnelResult> InvokeAsync(GetIpsecTunnelArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpsecTunnelResult>("scm:index/getIpsecTunnel:getIpsecTunnel", args ?? new GetIpsecTunnelArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves a config item.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Scm = Pulumi.Scm;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Scm.GetIpsecTunnel.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpsecTunnelResult> Invoke(GetIpsecTunnelInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpsecTunnelResult>("scm:index/getIpsecTunnel:getIpsecTunnel", args ?? new GetIpsecTunnelInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpsecTunnelArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public string? Folder { get; set; }

        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetIpsecTunnelArgs()
        {
        }
        public static new GetIpsecTunnelArgs Empty => new GetIpsecTunnelArgs();
    }

    public sealed class GetIpsecTunnelInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetIpsecTunnelInvokeArgs()
        {
        }
        public static new GetIpsecTunnelInvokeArgs Empty => new GetIpsecTunnelInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpsecTunnelResult
    {
        /// <summary>
        /// Enable Anti-Replay check on this tunnel.
        /// </summary>
        public readonly bool AntiReplay;
        /// <summary>
        /// The AutoKey param.
        /// </summary>
        public readonly Outputs.GetIpsecTunnelAutoKeyResult AutoKey;
        /// <summary>
        /// Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
        /// </summary>
        public readonly bool CopyTos;
        /// <summary>
        /// allow GRE over IPSec. Default: `false`.
        /// </summary>
        public readonly bool EnableGreEncapsulation;
        /// <summary>
        /// The Folder param.
        /// </summary>
        public readonly string? Folder;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        public readonly string Name;
        public readonly string Tfid;
        /// <summary>
        /// The TunnelMonitor param.
        /// </summary>
        public readonly Outputs.GetIpsecTunnelTunnelMonitorResult TunnelMonitor;

        [OutputConstructor]
        private GetIpsecTunnelResult(
            bool antiReplay,

            Outputs.GetIpsecTunnelAutoKeyResult autoKey,

            bool copyTos,

            bool enableGreEncapsulation,

            string? folder,

            string id,

            string name,

            string tfid,

            Outputs.GetIpsecTunnelTunnelMonitorResult tunnelMonitor)
        {
            AntiReplay = antiReplay;
            AutoKey = autoKey;
            CopyTos = copyTos;
            EnableGreEncapsulation = enableGreEncapsulation;
            Folder = folder;
            Id = id;
            Name = name;
            Tfid = tfid;
            TunnelMonitor = tunnelMonitor;
        }
    }
}
