// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AntiSpywareProfileMicaEngineSpywareEnabledListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The InlinePolicyAction param. String must be one of these: `"alert"`, `"allow"`, `"drop"`, `"reset-both"`, `"reset-client"`, `"reset-server"`. Default: `"alert"`.
        /// </summary>
        [Input("inlinePolicyAction")]
        public Input<string>? InlinePolicyAction { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AntiSpywareProfileMicaEngineSpywareEnabledListArgs()
        {
        }
        public static new AntiSpywareProfileMicaEngineSpywareEnabledListArgs Empty => new AntiSpywareProfileMicaEngineSpywareEnabledListArgs();
    }
}
