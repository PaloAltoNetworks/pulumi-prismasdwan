// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectMobileDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.HipObjectMobileDeviceCriteriaGetArgs>? Criteria { get; set; }

        public HipObjectMobileDeviceGetArgs()
        {
        }
        public static new HipObjectMobileDeviceGetArgs Empty => new HipObjectMobileDeviceGetArgs();
    }
}
