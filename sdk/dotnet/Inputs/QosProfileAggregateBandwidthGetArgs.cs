// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class QosProfileAggregateBandwidthGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// guaranteed sending bandwidth in mbps. Value must be between 0 and 16000.
        /// </summary>
        [Input("egressGuaranteed")]
        public Input<int>? EgressGuaranteed { get; set; }

        /// <summary>
        /// max sending bandwidth in mbps. Value must be between 0 and 60000.
        /// </summary>
        [Input("egressMax")]
        public Input<int>? EgressMax { get; set; }

        public QosProfileAggregateBandwidthGetArgs()
        {
        }
        public static new QosProfileAggregateBandwidthGetArgs Empty => new QosProfileAggregateBandwidthGetArgs();
    }
}
