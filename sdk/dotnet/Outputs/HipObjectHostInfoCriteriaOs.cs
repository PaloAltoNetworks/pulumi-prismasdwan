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
    public sealed class HipObjectHostInfoCriteriaOs
    {
        /// <summary>
        /// The Contains param. Ensure that only one of the following is specified: `contains`
        /// </summary>
        public readonly Outputs.HipObjectHostInfoCriteriaOsContains? Contains;

        [OutputConstructor]
        private HipObjectHostInfoCriteriaOs(Outputs.HipObjectHostInfoCriteriaOsContains? contains)
        {
            Contains = contains;
        }
    }
}
