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
    public sealed class GetExternalDynamicListTypePredefinedIpResult
    {
        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
        /// </summary>
        public readonly ImmutableArray<string> ExceptionLists;
        /// <summary>
        /// The Url param.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetExternalDynamicListTypePredefinedIpResult(
            string description,

            ImmutableArray<string> exceptionLists,

            string url)
        {
            Description = description;
            ExceptionLists = exceptionLists;
            Url = url;
        }
    }
}
