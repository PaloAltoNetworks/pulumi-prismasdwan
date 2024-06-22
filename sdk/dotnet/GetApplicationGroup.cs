// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetApplicationGroup
    {
        /// <summary>
        /// Retrieves a config item.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Scm = Pulumi.Scm;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Scm.GetApplicationGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplicationGroupResult> InvokeAsync(GetApplicationGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationGroupResult>("scm:index/getApplicationGroup:getApplicationGroup", args ?? new GetApplicationGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves a config item.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Scm = Pulumi.Scm;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Scm.GetApplicationGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationGroupResult> Invoke(GetApplicationGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationGroupResult>("scm:index/getApplicationGroup:getApplicationGroup", args ?? new GetApplicationGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetApplicationGroupArgs()
        {
        }
        public static new GetApplicationGroupArgs Empty => new GetApplicationGroupArgs();
    }

    public sealed class GetApplicationGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetApplicationGroupInvokeArgs()
        {
        }
        public static new GetApplicationGroupInvokeArgs Empty => new GetApplicationGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationGroupResult
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        /// </summary>
        public readonly ImmutableArray<string> Members;
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;
        public readonly string Tfid;

        [OutputConstructor]
        private GetApplicationGroupResult(
            string id,

            ImmutableArray<string> members,

            string name,

            string tfid)
        {
            Id = id;
            Members = members;
            Name = name;
            Tfid = tfid;
        }
    }
}
