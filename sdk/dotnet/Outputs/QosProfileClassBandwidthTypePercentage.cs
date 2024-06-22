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
    public sealed class QosProfileClassBandwidthTypePercentage
    {
        /// <summary>
        /// QoS setting for traffic classes.
        /// </summary>
        public readonly ImmutableArray<Outputs.QosProfileClassBandwidthTypePercentageClass> Classes;

        [OutputConstructor]
        private QosProfileClassBandwidthTypePercentage(ImmutableArray<Outputs.QosProfileClassBandwidthTypePercentageClass> classes)
        {
            Classes = classes;
        }
    }
}
