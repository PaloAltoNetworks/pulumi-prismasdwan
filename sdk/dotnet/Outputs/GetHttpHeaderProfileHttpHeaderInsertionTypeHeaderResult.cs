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
    public sealed class GetHttpHeaderProfileHttpHeaderInsertionTypeHeaderResult
    {
        /// <summary>
        /// The Header param.
        /// </summary>
        public readonly string Header;
        /// <summary>
        /// The Log param. Default: `false`.
        /// </summary>
        public readonly bool Log;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Value param.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetHttpHeaderProfileHttpHeaderInsertionTypeHeaderResult(
            string header,

            bool log,

            string name,

            string value)
        {
            Header = header;
            Log = log;
            Name = name;
            Value = value;
        }
    }
}
