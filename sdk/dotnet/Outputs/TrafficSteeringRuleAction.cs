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
    public sealed class TrafficSteeringRuleAction
    {
        /// <summary>
        /// The Forward param. Ensure that only one of the following is specified: `forward`, `no-pbf`
        /// </summary>
        public readonly Outputs.TrafficSteeringRuleActionForward? Forward;
        /// <summary>
        /// The NoPbf param. Ensure that only one of the following is specified: `forward`, `no-pbf`
        /// </summary>
        public readonly bool? NoPbf;

        [OutputConstructor]
        private TrafficSteeringRuleAction(
            Outputs.TrafficSteeringRuleActionForward? forward,

            bool? noPbf)
        {
            Forward = forward;
            NoPbf = noPbf;
        }
    }
}
