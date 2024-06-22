// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetExternalDynamicList
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
        ///     var example = Scm.GetExternalDynamicList.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetExternalDynamicListResult> InvokeAsync(GetExternalDynamicListArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetExternalDynamicListResult>("scm:index/getExternalDynamicList:getExternalDynamicList", args ?? new GetExternalDynamicListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetExternalDynamicList.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetExternalDynamicListResult> Invoke(GetExternalDynamicListInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetExternalDynamicListResult>("scm:index/getExternalDynamicList:getExternalDynamicList", args ?? new GetExternalDynamicListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetExternalDynamicListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetExternalDynamicListArgs()
        {
        }
        public static new GetExternalDynamicListArgs Empty => new GetExternalDynamicListArgs();
    }

    public sealed class GetExternalDynamicListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetExternalDynamicListInvokeArgs()
        {
        }
        public static new GetExternalDynamicListInvokeArgs Empty => new GetExternalDynamicListInvokeArgs();
    }


    [OutputType]
    public sealed class GetExternalDynamicListResult
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        public readonly string Name;
        public readonly string Tfid;
        /// <summary>
        /// The Type param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListTypeResult Type;

        [OutputConstructor]
        private GetExternalDynamicListResult(
            string id,

            string name,

            string tfid,

            Outputs.GetExternalDynamicListTypeResult type)
        {
            Id = id;
            Name = name;
            Tfid = tfid;
            Type = type;
        }
    }
}
