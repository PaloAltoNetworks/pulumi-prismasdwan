// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AntiSpywareProfileThreatExceptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Action param.
        /// </summary>
        [Input("action")]
        public Input<Inputs.AntiSpywareProfileThreatExceptionActionArgs>? Action { get; set; }

        [Input("exemptIps")]
        private InputList<Inputs.AntiSpywareProfileThreatExceptionExemptIpArgs>? _exemptIps;

        /// <summary>
        /// The ExemptIps param.
        /// </summary>
        public InputList<Inputs.AntiSpywareProfileThreatExceptionExemptIpArgs> ExemptIps
        {
            get => _exemptIps ?? (_exemptIps = new InputList<Inputs.AntiSpywareProfileThreatExceptionExemptIpArgs>());
            set => _exemptIps = value;
        }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Notes param.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// The PacketCapture param. String must be one of these: `"disable"`, `"single-packet"`, `"extended-capture"`.
        /// </summary>
        [Input("packetCapture")]
        public Input<string>? PacketCapture { get; set; }

        public AntiSpywareProfileThreatExceptionArgs()
        {
        }
        public static new AntiSpywareProfileThreatExceptionArgs Empty => new AntiSpywareProfileThreatExceptionArgs();
    }
}
