// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ServiceProtocolUdpOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// udp session timeout value (in second). Value must be between 1 and 604800. Default: `30`.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ServiceProtocolUdpOverrideGetArgs()
        {
        }
        public static new ServiceProtocolUdpOverrideGetArgs Empty => new ServiceProtocolUdpOverrideGetArgs();
    }
}
