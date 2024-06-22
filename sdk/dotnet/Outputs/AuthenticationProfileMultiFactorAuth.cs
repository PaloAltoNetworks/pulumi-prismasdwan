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
    public sealed class AuthenticationProfileMultiFactorAuth
    {
        /// <summary>
        /// The Factors param.
        /// </summary>
        public readonly ImmutableArray<string> Factors;
        /// <summary>
        /// The MfaEnable param.
        /// </summary>
        public readonly bool? MfaEnable;

        [OutputConstructor]
        private AuthenticationProfileMultiFactorAuth(
            ImmutableArray<string> factors,

            bool? mfaEnable)
        {
            Factors = factors;
            MfaEnable = mfaEnable;
        }
    }
}
