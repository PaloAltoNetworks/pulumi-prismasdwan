// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class SnippetFolderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SnippetFolderGetArgs()
        {
        }
        public static new SnippetFolderGetArgs Empty => new SnippetFolderGetArgs();
    }
}
