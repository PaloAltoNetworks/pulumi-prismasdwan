// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetDecryptionRule
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
        ///     var example = Scm.GetDecryptionRule.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDecryptionRuleResult> InvokeAsync(GetDecryptionRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDecryptionRuleResult>("scm:index/getDecryptionRule:getDecryptionRule", args ?? new GetDecryptionRuleArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetDecryptionRule.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDecryptionRuleResult> Invoke(GetDecryptionRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDecryptionRuleResult>("scm:index/getDecryptionRule:getDecryptionRule", args ?? new GetDecryptionRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDecryptionRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetDecryptionRuleArgs()
        {
        }
        public static new GetDecryptionRuleArgs Empty => new GetDecryptionRuleArgs();
    }

    public sealed class GetDecryptionRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetDecryptionRuleInvokeArgs()
        {
        }
        public static new GetDecryptionRuleInvokeArgs Empty => new GetDecryptionRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetDecryptionRuleResult
    {
        /// <summary>
        /// The Action param. String must be one of these: `"decrypt"`, `"no-decrypt"`.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// The Categories param.
        /// </summary>
        public readonly ImmutableArray<string> Categories;
        /// <summary>
        /// The Description param.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The DestinationHips param.
        /// </summary>
        public readonly ImmutableArray<string> DestinationHips;
        /// <summary>
        /// The Destinations param.
        /// </summary>
        public readonly ImmutableArray<string> Destinations;
        /// <summary>
        /// The Disabled param.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// The Froms param.
        /// </summary>
        public readonly ImmutableArray<string> Froms;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The LogFail param.
        /// </summary>
        public readonly bool LogFail;
        /// <summary>
        /// The LogSetting param.
        /// </summary>
        public readonly string LogSetting;
        /// <summary>
        /// The LogSuccess param.
        /// </summary>
        public readonly bool LogSuccess;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The NegateDestination param.
        /// </summary>
        public readonly bool NegateDestination;
        /// <summary>
        /// The NegateSource param.
        /// </summary>
        public readonly bool NegateSource;
        /// <summary>
        /// The Profile param.
        /// </summary>
        public readonly string Profile;
        /// <summary>
        /// The Services param.
        /// </summary>
        public readonly ImmutableArray<string> Services;
        /// <summary>
        /// The SourceHips param.
        /// </summary>
        public readonly ImmutableArray<string> SourceHips;
        /// <summary>
        /// The SourceUsers param.
        /// </summary>
        public readonly ImmutableArray<string> SourceUsers;
        /// <summary>
        /// The Sources param.
        /// </summary>
        public readonly ImmutableArray<string> Sources;
        /// <summary>
        /// The Tags param.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        public readonly string Tfid;
        /// <summary>
        /// The Tos param.
        /// </summary>
        public readonly ImmutableArray<string> Tos;
        /// <summary>
        /// The Type param.
        /// </summary>
        public readonly Outputs.GetDecryptionRuleTypeResult Type;

        [OutputConstructor]
        private GetDecryptionRuleResult(
            string action,

            ImmutableArray<string> categories,

            string description,

            ImmutableArray<string> destinationHips,

            ImmutableArray<string> destinations,

            bool disabled,

            ImmutableArray<string> froms,

            string id,

            bool logFail,

            string logSetting,

            bool logSuccess,

            string name,

            bool negateDestination,

            bool negateSource,

            string profile,

            ImmutableArray<string> services,

            ImmutableArray<string> sourceHips,

            ImmutableArray<string> sourceUsers,

            ImmutableArray<string> sources,

            ImmutableArray<string> tags,

            string tfid,

            ImmutableArray<string> tos,

            Outputs.GetDecryptionRuleTypeResult type)
        {
            Action = action;
            Categories = categories;
            Description = description;
            DestinationHips = destinationHips;
            Destinations = destinations;
            Disabled = disabled;
            Froms = froms;
            Id = id;
            LogFail = logFail;
            LogSetting = logSetting;
            LogSuccess = logSuccess;
            Name = name;
            NegateDestination = negateDestination;
            NegateSource = negateSource;
            Profile = profile;
            Services = services;
            SourceHips = sourceHips;
            SourceUsers = sourceUsers;
            Sources = sources;
            Tags = tags;
            Tfid = tfid;
            Tos = tos;
            Type = type;
        }
    }
}
