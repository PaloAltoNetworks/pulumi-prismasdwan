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
    public sealed class GetHipObjectHostInfoCriteriaResult
    {
        /// <summary>
        /// The ClientVersion param.
        /// </summary>
        public readonly Outputs.GetHipObjectHostInfoCriteriaClientVersionResult ClientVersion;
        /// <summary>
        /// The Domain param.
        /// </summary>
        public readonly Outputs.GetHipObjectHostInfoCriteriaDomainResult Domain;
        /// <summary>
        /// The HostId param.
        /// </summary>
        public readonly Outputs.GetHipObjectHostInfoCriteriaHostIdResult HostId;
        /// <summary>
        /// The HostName param.
        /// </summary>
        public readonly Outputs.GetHipObjectHostInfoCriteriaHostNameResult HostName;
        /// <summary>
        /// If device is managed.
        /// </summary>
        public readonly bool Managed;
        /// <summary>
        /// The Os param.
        /// </summary>
        public readonly Outputs.GetHipObjectHostInfoCriteriaOsResult Os;
        /// <summary>
        /// The SerialNumber param.
        /// </summary>
        public readonly Outputs.GetHipObjectHostInfoCriteriaSerialNumberResult SerialNumber;

        [OutputConstructor]
        private GetHipObjectHostInfoCriteriaResult(
            Outputs.GetHipObjectHostInfoCriteriaClientVersionResult clientVersion,

            Outputs.GetHipObjectHostInfoCriteriaDomainResult domain,

            Outputs.GetHipObjectHostInfoCriteriaHostIdResult hostId,

            Outputs.GetHipObjectHostInfoCriteriaHostNameResult hostName,

            bool managed,

            Outputs.GetHipObjectHostInfoCriteriaOsResult os,

            Outputs.GetHipObjectHostInfoCriteriaSerialNumberResult serialNumber)
        {
            ClientVersion = clientVersion;
            Domain = domain;
            HostId = hostId;
            HostName = hostName;
            Managed = managed;
            Os = os;
            SerialNumber = serialNumber;
        }
    }
}
