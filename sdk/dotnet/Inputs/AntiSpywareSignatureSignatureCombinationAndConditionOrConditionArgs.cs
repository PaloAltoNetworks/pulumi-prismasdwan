// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AntiSpywareSignatureSignatureCombinationAndConditionOrConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ThreatId param.
        /// </summary>
        [Input("threatId")]
        public Input<string>? ThreatId { get; set; }

        public AntiSpywareSignatureSignatureCombinationAndConditionOrConditionArgs()
        {
        }
        public static new AntiSpywareSignatureSignatureCombinationAndConditionOrConditionArgs Empty => new AntiSpywareSignatureSignatureCombinationAndConditionOrConditionArgs();
    }
}
