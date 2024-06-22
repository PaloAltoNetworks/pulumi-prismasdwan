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
    public sealed class GetHipObjectPatchManagementCriteriaMissingPatchesResult
    {
        /// <summary>
        /// The Check param. String must be one of these: `"has-any"`, `"has-none"`, `"has-all"`. Default: `"has-any"`.
        /// </summary>
        public readonly string Check;
        /// <summary>
        /// The Patches param. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
        /// </summary>
        public readonly ImmutableArray<string> Patches;
        /// <summary>
        /// The Severity param.
        /// </summary>
        public readonly Outputs.GetHipObjectPatchManagementCriteriaMissingPatchesSeverityResult Severity;

        [OutputConstructor]
        private GetHipObjectPatchManagementCriteriaMissingPatchesResult(
            string check,

            ImmutableArray<string> patches,

            Outputs.GetHipObjectPatchManagementCriteriaMissingPatchesSeverityResult severity)
        {
            Check = check;
            Patches = patches;
            Severity = severity;
        }
    }
}
