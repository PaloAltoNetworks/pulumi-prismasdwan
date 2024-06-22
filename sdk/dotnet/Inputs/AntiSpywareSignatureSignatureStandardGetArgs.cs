// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AntiSpywareSignatureSignatureStandardGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("andConditions")]
        private InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionGetArgs>? _andConditions;

        /// <summary>
        /// The AndConditions param.
        /// </summary>
        public InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionGetArgs> AndConditions
        {
            get => _andConditions ?? (_andConditions = new InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionGetArgs>());
            set => _andConditions = value;
        }

        /// <summary>
        /// The Comment param. String length must not exceed 256 characters.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The OrderFree param. Default: `false`.
        /// </summary>
        [Input("orderFree")]
        public Input<bool>? OrderFree { get; set; }

        /// <summary>
        /// The Scope param. String must be one of these: `"protocol-data-unit"`, `"session"`.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public AntiSpywareSignatureSignatureStandardGetArgs()
        {
        }
        public static new AntiSpywareSignatureSignatureStandardGetArgs Empty => new AntiSpywareSignatureSignatureStandardGetArgs();
    }
}
