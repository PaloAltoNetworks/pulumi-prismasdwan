// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class MfaServerMfaVendorTypeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DuoSecurityV2 param. Ensure that only one of the following is specified: `duo_security_v2`, `okta_adaptive_v1`, `ping_identity_v1`, `rsa_securid_access_v1`
        /// </summary>
        [Input("duoSecurityV2")]
        public Input<Inputs.MfaServerMfaVendorTypeDuoSecurityV2Args>? DuoSecurityV2 { get; set; }

        /// <summary>
        /// The OktaAdaptiveV1 param. Ensure that only one of the following is specified: `duo_security_v2`, `okta_adaptive_v1`, `ping_identity_v1`, `rsa_securid_access_v1`
        /// </summary>
        [Input("oktaAdaptiveV1")]
        public Input<Inputs.MfaServerMfaVendorTypeOktaAdaptiveV1Args>? OktaAdaptiveV1 { get; set; }

        /// <summary>
        /// The PingIdentityV1 param. Ensure that only one of the following is specified: `duo_security_v2`, `okta_adaptive_v1`, `ping_identity_v1`, `rsa_securid_access_v1`
        /// </summary>
        [Input("pingIdentityV1")]
        public Input<Inputs.MfaServerMfaVendorTypePingIdentityV1Args>? PingIdentityV1 { get; set; }

        /// <summary>
        /// The RsaSecuridAccessV1 param. Ensure that only one of the following is specified: `duo_security_v2`, `okta_adaptive_v1`, `ping_identity_v1`, `rsa_securid_access_v1`
        /// </summary>
        [Input("rsaSecuridAccessV1")]
        public Input<Inputs.MfaServerMfaVendorTypeRsaSecuridAccessV1Args>? RsaSecuridAccessV1 { get; set; }

        public MfaServerMfaVendorTypeArgs()
        {
        }
        public static new MfaServerMfaVendorTypeArgs Empty => new MfaServerMfaVendorTypeArgs();
    }
}
