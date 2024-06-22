// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
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
    ///     var example = new Scm.SecurityRule("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/securityRule:SecurityRule")]
    public partial class SecurityRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// The application(s) being accessed.
        /// </summary>
        [Output("applications")]
        public Output<ImmutableArray<string>> Applications { get; private set; } = null!;

        /// <summary>
        /// The URL categories being accessed.
        /// </summary>
        [Output("categories")]
        public Output<ImmutableArray<string>> Categories { get; private set; } = null!;

        /// <summary>
        /// The description of the security rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The destination Host Integrity Profile(s).
        /// </summary>
        [Output("destinationHips")]
        public Output<ImmutableArray<string>> DestinationHips { get; private set; } = null!;

        /// <summary>
        /// The destination address(es).
        /// </summary>
        [Output("destinations")]
        public Output<ImmutableArray<string>> Destinations { get; private set; } = null!;

        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The state of the security rule. Default: `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The source security zone(s).
        /// </summary>
        [Output("froms")]
        public Output<ImmutableArray<string>> Froms { get; private set; } = null!;

        /// <summary>
        /// The external log forwarding profile.
        /// </summary>
        [Output("logSetting")]
        public Output<string?> LogSetting { get; private set; } = null!;

        /// <summary>
        /// The name of the security rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Negate the destination addresses(es). Default: `false`.
        /// </summary>
        [Output("negateDestination")]
        public Output<bool> NegateDestination { get; private set; } = null!;

        /// <summary>
        /// Negate the source address(es). Default: `false`.
        /// </summary>
        [Output("negateSource")]
        public Output<bool> NegateSource { get; private set; } = null!;

        /// <summary>
        /// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        /// </summary>
        [Output("position")]
        public Output<string> Position { get; private set; } = null!;

        /// <summary>
        /// The security profile object.
        /// </summary>
        [Output("profileSetting")]
        public Output<Outputs.SecurityRuleProfileSetting?> ProfileSetting { get; private set; } = null!;

        /// <summary>
        /// The service(s) being accessed.
        /// </summary>
        [Output("services")]
        public Output<ImmutableArray<string>> Services { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        /// <summary>
        /// The source Host Integrity Profile(s).
        /// </summary>
        [Output("sourceHips")]
        public Output<ImmutableArray<string>> SourceHips { get; private set; } = null!;

        /// <summary>
        /// The source user(s) or group(s).
        /// </summary>
        [Output("sourceUsers")]
        public Output<ImmutableArray<string>> SourceUsers { get; private set; } = null!;

        /// <summary>
        /// The source address(es).
        /// </summary>
        [Output("sources")]
        public Output<ImmutableArray<string>> Sources { get; private set; } = null!;

        /// <summary>
        /// The tags associated with the security rule.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;

        /// <summary>
        /// The destination security zone(s).
        /// </summary>
        [Output("tos")]
        public Output<ImmutableArray<string>> Tos { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityRule(string name, SecurityRuleArgs args, CustomResourceOptions? options = null)
            : base("scm:index/securityRule:SecurityRule", name, args ?? new SecurityRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityRule(string name, Input<string> id, SecurityRuleState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/securityRule:SecurityRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecurityRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityRule Get(string name, Input<string> id, SecurityRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityRule(name, id, state, options);
        }
    }

    public sealed class SecurityRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("applications", required: true)]
        private InputList<string>? _applications;

        /// <summary>
        /// The application(s) being accessed.
        /// </summary>
        public InputList<string> Applications
        {
            get => _applications ?? (_applications = new InputList<string>());
            set => _applications = value;
        }

        [Input("categories", required: true)]
        private InputList<string>? _categories;

        /// <summary>
        /// The URL categories being accessed.
        /// </summary>
        public InputList<string> Categories
        {
            get => _categories ?? (_categories = new InputList<string>());
            set => _categories = value;
        }

        /// <summary>
        /// The description of the security rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationHips")]
        private InputList<string>? _destinationHips;

        /// <summary>
        /// The destination Host Integrity Profile(s).
        /// </summary>
        public InputList<string> DestinationHips
        {
            get => _destinationHips ?? (_destinationHips = new InputList<string>());
            set => _destinationHips = value;
        }

        [Input("destinations", required: true)]
        private InputList<string>? _destinations;

        /// <summary>
        /// The destination address(es).
        /// </summary>
        public InputList<string> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<string>());
            set => _destinations = value;
        }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The state of the security rule. Default: `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("froms", required: true)]
        private InputList<string>? _froms;

        /// <summary>
        /// The source security zone(s).
        /// </summary>
        public InputList<string> Froms
        {
            get => _froms ?? (_froms = new InputList<string>());
            set => _froms = value;
        }

        /// <summary>
        /// The external log forwarding profile.
        /// </summary>
        [Input("logSetting")]
        public Input<string>? LogSetting { get; set; }

        /// <summary>
        /// The name of the security rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Negate the destination addresses(es). Default: `false`.
        /// </summary>
        [Input("negateDestination")]
        public Input<bool>? NegateDestination { get; set; }

        /// <summary>
        /// Negate the source address(es). Default: `false`.
        /// </summary>
        [Input("negateSource")]
        public Input<bool>? NegateSource { get; set; }

        /// <summary>
        /// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        /// </summary>
        [Input("position")]
        public Input<string>? Position { get; set; }

        /// <summary>
        /// The security profile object.
        /// </summary>
        [Input("profileSetting")]
        public Input<Inputs.SecurityRuleProfileSettingArgs>? ProfileSetting { get; set; }

        [Input("services", required: true)]
        private InputList<string>? _services;

        /// <summary>
        /// The service(s) being accessed.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("sourceHips")]
        private InputList<string>? _sourceHips;

        /// <summary>
        /// The source Host Integrity Profile(s).
        /// </summary>
        public InputList<string> SourceHips
        {
            get => _sourceHips ?? (_sourceHips = new InputList<string>());
            set => _sourceHips = value;
        }

        [Input("sourceUsers", required: true)]
        private InputList<string>? _sourceUsers;

        /// <summary>
        /// The source user(s) or group(s).
        /// </summary>
        public InputList<string> SourceUsers
        {
            get => _sourceUsers ?? (_sourceUsers = new InputList<string>());
            set => _sourceUsers = value;
        }

        [Input("sources", required: true)]
        private InputList<string>? _sources;

        /// <summary>
        /// The source address(es).
        /// </summary>
        public InputList<string> Sources
        {
            get => _sources ?? (_sources = new InputList<string>());
            set => _sources = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the security rule.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("tos", required: true)]
        private InputList<string>? _tos;

        /// <summary>
        /// The destination security zone(s).
        /// </summary>
        public InputList<string> Tos
        {
            get => _tos ?? (_tos = new InputList<string>());
            set => _tos = value;
        }

        public SecurityRuleArgs()
        {
        }
        public static new SecurityRuleArgs Empty => new SecurityRuleArgs();
    }

    public sealed class SecurityRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("applications")]
        private InputList<string>? _applications;

        /// <summary>
        /// The application(s) being accessed.
        /// </summary>
        public InputList<string> Applications
        {
            get => _applications ?? (_applications = new InputList<string>());
            set => _applications = value;
        }

        [Input("categories")]
        private InputList<string>? _categories;

        /// <summary>
        /// The URL categories being accessed.
        /// </summary>
        public InputList<string> Categories
        {
            get => _categories ?? (_categories = new InputList<string>());
            set => _categories = value;
        }

        /// <summary>
        /// The description of the security rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationHips")]
        private InputList<string>? _destinationHips;

        /// <summary>
        /// The destination Host Integrity Profile(s).
        /// </summary>
        public InputList<string> DestinationHips
        {
            get => _destinationHips ?? (_destinationHips = new InputList<string>());
            set => _destinationHips = value;
        }

        [Input("destinations")]
        private InputList<string>? _destinations;

        /// <summary>
        /// The destination address(es).
        /// </summary>
        public InputList<string> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<string>());
            set => _destinations = value;
        }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The state of the security rule. Default: `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("froms")]
        private InputList<string>? _froms;

        /// <summary>
        /// The source security zone(s).
        /// </summary>
        public InputList<string> Froms
        {
            get => _froms ?? (_froms = new InputList<string>());
            set => _froms = value;
        }

        /// <summary>
        /// The external log forwarding profile.
        /// </summary>
        [Input("logSetting")]
        public Input<string>? LogSetting { get; set; }

        /// <summary>
        /// The name of the security rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Negate the destination addresses(es). Default: `false`.
        /// </summary>
        [Input("negateDestination")]
        public Input<bool>? NegateDestination { get; set; }

        /// <summary>
        /// Negate the source address(es). Default: `false`.
        /// </summary>
        [Input("negateSource")]
        public Input<bool>? NegateSource { get; set; }

        /// <summary>
        /// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        /// </summary>
        [Input("position")]
        public Input<string>? Position { get; set; }

        /// <summary>
        /// The security profile object.
        /// </summary>
        [Input("profileSetting")]
        public Input<Inputs.SecurityRuleProfileSettingGetArgs>? ProfileSetting { get; set; }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// The service(s) being accessed.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("sourceHips")]
        private InputList<string>? _sourceHips;

        /// <summary>
        /// The source Host Integrity Profile(s).
        /// </summary>
        public InputList<string> SourceHips
        {
            get => _sourceHips ?? (_sourceHips = new InputList<string>());
            set => _sourceHips = value;
        }

        [Input("sourceUsers")]
        private InputList<string>? _sourceUsers;

        /// <summary>
        /// The source user(s) or group(s).
        /// </summary>
        public InputList<string> SourceUsers
        {
            get => _sourceUsers ?? (_sourceUsers = new InputList<string>());
            set => _sourceUsers = value;
        }

        [Input("sources")]
        private InputList<string>? _sources;

        /// <summary>
        /// The source address(es).
        /// </summary>
        public InputList<string> Sources
        {
            get => _sources ?? (_sources = new InputList<string>());
            set => _sources = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the security rule.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        [Input("tos")]
        private InputList<string>? _tos;

        /// <summary>
        /// The destination security zone(s).
        /// </summary>
        public InputList<string> Tos
        {
            get => _tos ?? (_tos = new InputList<string>());
            set => _tos = value;
        }

        public SecurityRuleState()
        {
        }
        public static new SecurityRuleState Empty => new SecurityRuleState();
    }
}
