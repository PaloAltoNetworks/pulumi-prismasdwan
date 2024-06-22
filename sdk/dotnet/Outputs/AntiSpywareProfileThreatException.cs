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
    public sealed class AntiSpywareProfileThreatException
    {
        /// <summary>
        /// The Action param.
        /// </summary>
        public readonly Outputs.AntiSpywareProfileThreatExceptionAction? Action;
        /// <summary>
        /// The ExemptIps param.
        /// </summary>
        public readonly ImmutableArray<Outputs.AntiSpywareProfileThreatExceptionExemptIp> ExemptIps;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Notes param.
        /// </summary>
        public readonly string? Notes;
        /// <summary>
        /// The PacketCapture param. String must be one of these: `"disable"`, `"single-packet"`, `"extended-capture"`.
        /// </summary>
        public readonly string? PacketCapture;

        [OutputConstructor]
        private AntiSpywareProfileThreatException(
            Outputs.AntiSpywareProfileThreatExceptionAction? action,

            ImmutableArray<Outputs.AntiSpywareProfileThreatExceptionExemptIp> exemptIps,

            string? name,

            string? notes,

            string? packetCapture)
        {
            Action = action;
            ExemptIps = exemptIps;
            Name = name;
            Notes = notes;
            PacketCapture = packetCapture;
        }
    }
}
