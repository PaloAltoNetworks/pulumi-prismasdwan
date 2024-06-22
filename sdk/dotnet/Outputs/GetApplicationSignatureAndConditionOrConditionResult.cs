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
    public sealed class GetApplicationSignatureAndConditionOrConditionResult
    {
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Operator param.
        /// </summary>
        public readonly Outputs.GetApplicationSignatureAndConditionOrConditionOperatorResult Operator;

        [OutputConstructor]
        private GetApplicationSignatureAndConditionOrConditionResult(
            string name,

            Outputs.GetApplicationSignatureAndConditionOrConditionOperatorResult @operator)
        {
            Name = name;
            Operator = @operator;
        }
    }
}
