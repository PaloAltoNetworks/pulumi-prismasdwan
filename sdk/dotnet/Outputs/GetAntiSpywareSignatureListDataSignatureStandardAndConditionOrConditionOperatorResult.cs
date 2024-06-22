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
    public sealed class GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorResult
    {
        /// <summary>
        /// The EqualTo param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorEqualToResult EqualTo;
        /// <summary>
        /// The GreaterThan param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorGreaterThanResult GreaterThan;
        /// <summary>
        /// The LessThan param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanResult LessThan;
        /// <summary>
        /// The PatternMatch param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorPatternMatchResult PatternMatch;

        [OutputConstructor]
        private GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorResult(
            Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorEqualToResult equalTo,

            Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorGreaterThanResult greaterThan,

            Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanResult lessThan,

            Outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorPatternMatchResult patternMatch)
        {
            EqualTo = equalTo;
            GreaterThan = greaterThan;
            LessThan = lessThan;
            PatternMatch = patternMatch;
        }
    }
}
