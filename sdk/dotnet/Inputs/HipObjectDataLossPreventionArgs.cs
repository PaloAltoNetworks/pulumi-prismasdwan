// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectDataLossPreventionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.HipObjectDataLossPreventionCriteriaArgs>? Criteria { get; set; }

        /// <summary>
        /// The ExcludeVendor param. Default: `false`.
        /// </summary>
        [Input("excludeVendor")]
        public Input<bool>? ExcludeVendor { get; set; }

        [Input("vendors")]
        private InputList<Inputs.HipObjectDataLossPreventionVendorArgs>? _vendors;

        /// <summary>
        /// Vendor name.
        /// </summary>
        public InputList<Inputs.HipObjectDataLossPreventionVendorArgs> Vendors
        {
            get => _vendors ?? (_vendors = new InputList<Inputs.HipObjectDataLossPreventionVendorArgs>());
            set => _vendors = value;
        }

        public HipObjectDataLossPreventionArgs()
        {
        }
        public static new HipObjectDataLossPreventionArgs Empty => new HipObjectDataLossPreventionArgs();
    }
}
