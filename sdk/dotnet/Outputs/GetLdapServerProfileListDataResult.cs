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
    public sealed class GetLdapServerProfileListDataResult
    {
        /// <summary>
        /// The Base param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Base;
        /// <summary>
        /// The BindDn param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string BindDn;
        /// <summary>
        /// The BindPassword param. String length must not exceed 121 characters.
        /// </summary>
        public readonly string BindPassword;
        /// <summary>
        /// The BindTimelimit param.
        /// </summary>
        public readonly string BindTimelimit;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        /// </summary>
        public readonly string LdapType;
        /// <summary>
        /// The RetryInterval param.
        /// </summary>
        public readonly int RetryInterval;
        /// <summary>
        /// The Servers param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLdapServerProfileListDataServerResult> Servers;
        /// <summary>
        /// The Ssl param.
        /// </summary>
        public readonly bool Ssl;
        /// <summary>
        /// The Timelimit param.
        /// </summary>
        public readonly int Timelimit;
        /// <summary>
        /// The VerifyServerCertificate param.
        /// </summary>
        public readonly bool VerifyServerCertificate;

        [OutputConstructor]
        private GetLdapServerProfileListDataResult(
            string @base,

            string bindDn,

            string bindPassword,

            string bindTimelimit,

            string id,

            string ldapType,

            int retryInterval,

            ImmutableArray<Outputs.GetLdapServerProfileListDataServerResult> servers,

            bool ssl,

            int timelimit,

            bool verifyServerCertificate)
        {
            Base = @base;
            BindDn = bindDn;
            BindPassword = bindPassword;
            BindTimelimit = bindTimelimit;
            Id = id;
            LdapType = ldapType;
            RetryInterval = retryInterval;
            Servers = servers;
            Ssl = ssl;
            Timelimit = timelimit;
            VerifyServerCertificate = verifyServerCertificate;
        }
    }
}
