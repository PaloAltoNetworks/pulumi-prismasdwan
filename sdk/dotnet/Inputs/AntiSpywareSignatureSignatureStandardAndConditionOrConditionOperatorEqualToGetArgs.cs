// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Context param.
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

        /// <summary>
        /// The Negate param. Default: `false`.
        /// </summary>
        [Input("negate")]
        public Input<bool>? Negate { get; set; }

        [Input("qualifiers")]
        private InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierGetArgs>? _qualifiers;

        /// <summary>
        /// The Qualifiers param.
        /// </summary>
        public InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierGetArgs> Qualifiers
        {
            get => _qualifiers ?? (_qualifiers = new InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierGetArgs>());
            set => _qualifiers = value;
        }

        /// <summary>
        /// The Value param. Value must be between 0 and 4294967295.
        /// </summary>
        [Input("value")]
        public Input<int>? Value { get; set; }

        public AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToGetArgs()
        {
        }
        public static new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToGetArgs Empty => new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToGetArgs();
    }
}
