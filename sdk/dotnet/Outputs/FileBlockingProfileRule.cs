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
    public sealed class FileBlockingProfileRule
    {
        /// <summary>
        /// The Action param. String must be one of these: `"alert"`, `"block"`, `"continue"`. Default: `"alert"`.
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// The Applications param. List must contain at least 1 elements.
        /// </summary>
        public readonly ImmutableArray<string> Applications;
        /// <summary>
        /// The Direction param. String must be one of these: `"download"`, `"upload"`, `"both"`. Default: `"both"`.
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// The FileTypes param. List must contain at least 1 elements.
        /// </summary>
        public readonly ImmutableArray<string> FileTypes;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private FileBlockingProfileRule(
            string? action,

            ImmutableArray<string> applications,

            string? direction,

            ImmutableArray<string> fileTypes,

            string name)
        {
            Action = action;
            Applications = applications;
            Direction = direction;
            FileTypes = fileTypes;
            Name = name;
        }
    }
}
