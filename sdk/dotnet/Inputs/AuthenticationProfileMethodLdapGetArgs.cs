// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AuthenticationProfileMethodLdapGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The LoginAttribute param.
        /// </summary>
        [Input("loginAttribute")]
        public Input<string>? LoginAttribute { get; set; }

        /// <summary>
        /// The PasswdExpDays param.
        /// </summary>
        [Input("passwdExpDays")]
        public Input<int>? PasswdExpDays { get; set; }

        /// <summary>
        /// The ServerProfile param.
        /// </summary>
        [Input("serverProfile")]
        public Input<string>? ServerProfile { get; set; }

        public AuthenticationProfileMethodLdapGetArgs()
        {
        }
        public static new AuthenticationProfileMethodLdapGetArgs Empty => new AuthenticationProfileMethodLdapGetArgs();
    }
}
