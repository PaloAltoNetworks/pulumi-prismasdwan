// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ScepProfileAlgorithmRsaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The RsaNbits param.
        /// </summary>
        [Input("rsaNbits")]
        public Input<string>? RsaNbits { get; set; }

        public ScepProfileAlgorithmRsaGetArgs()
        {
        }
        public static new ScepProfileAlgorithmRsaGetArgs Empty => new ScepProfileAlgorithmRsaGetArgs();
    }
}
