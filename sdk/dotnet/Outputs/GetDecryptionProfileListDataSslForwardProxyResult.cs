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
    public sealed class GetDecryptionProfileListDataSslForwardProxyResult
    {
        /// <summary>
        /// The AutoIncludeAltname param. Default: `false`.
        /// </summary>
        public readonly bool AutoIncludeAltname;
        /// <summary>
        /// The BlockClientCert param. Default: `false`.
        /// </summary>
        public readonly bool BlockClientCert;
        /// <summary>
        /// The BlockExpiredCertificate param. Default: `false`.
        /// </summary>
        public readonly bool BlockExpiredCertificate;
        /// <summary>
        /// The BlockTimeoutCert param. Default: `false`.
        /// </summary>
        public readonly bool BlockTimeoutCert;
        /// <summary>
        /// The BlockTls13DowngradeNoResource param. Default: `false`.
        /// </summary>
        public readonly bool BlockTls13DowngradeNoResource;
        /// <summary>
        /// The BlockUnknownCert param. Default: `false`.
        /// </summary>
        public readonly bool BlockUnknownCert;
        /// <summary>
        /// The BlockUnsupportedCipher param. Default: `false`.
        /// </summary>
        public readonly bool BlockUnsupportedCipher;
        /// <summary>
        /// The BlockUnsupportedVersion param. Default: `false`.
        /// </summary>
        public readonly bool BlockUnsupportedVersion;
        /// <summary>
        /// The BlockUntrustedIssuer param. Default: `false`.
        /// </summary>
        public readonly bool BlockUntrustedIssuer;
        /// <summary>
        /// The RestrictCertExts param. Default: `false`.
        /// </summary>
        public readonly bool RestrictCertExts;
        /// <summary>
        /// The StripAlpn param. Default: `false`.
        /// </summary>
        public readonly bool StripAlpn;

        [OutputConstructor]
        private GetDecryptionProfileListDataSslForwardProxyResult(
            bool autoIncludeAltname,

            bool blockClientCert,

            bool blockExpiredCertificate,

            bool blockTimeoutCert,

            bool blockTls13DowngradeNoResource,

            bool blockUnknownCert,

            bool blockUnsupportedCipher,

            bool blockUnsupportedVersion,

            bool blockUntrustedIssuer,

            bool restrictCertExts,

            bool stripAlpn)
        {
            AutoIncludeAltname = autoIncludeAltname;
            BlockClientCert = blockClientCert;
            BlockExpiredCertificate = blockExpiredCertificate;
            BlockTimeoutCert = blockTimeoutCert;
            BlockTls13DowngradeNoResource = blockTls13DowngradeNoResource;
            BlockUnknownCert = blockUnknownCert;
            BlockUnsupportedCipher = blockUnsupportedCipher;
            BlockUnsupportedVersion = blockUnsupportedVersion;
            BlockUntrustedIssuer = blockUntrustedIssuer;
            RestrictCertExts = restrictCertExts;
            StripAlpn = stripAlpn;
        }
    }
}
