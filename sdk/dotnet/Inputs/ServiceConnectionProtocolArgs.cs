// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ServiceConnectionProtocolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Bgp param.
        /// </summary>
        [Input("bgp")]
        public Input<Inputs.ServiceConnectionProtocolBgpArgs>? Bgp { get; set; }

        public ServiceConnectionProtocolArgs()
        {
        }
        public static new ServiceConnectionProtocolArgs Empty => new ServiceConnectionProtocolArgs();
    }
}
