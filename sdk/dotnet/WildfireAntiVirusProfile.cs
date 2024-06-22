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
    ///     var example = new Scm.WildfireAntiVirusProfile("example", new()
    ///     {
    ///         Folder = "Shared",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/wildfireAntiVirusProfile:WildfireAntiVirusProfile")]
    public partial class WildfireAntiVirusProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Description param.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The MlavExceptions param.
        /// </summary>
        [Output("mlavExceptions")]
        public Output<ImmutableArray<Outputs.WildfireAntiVirusProfileMlavException>> MlavExceptions { get; private set; } = null!;

        /// <summary>
        /// The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The PacketCapture param.
        /// </summary>
        [Output("packetCapture")]
        public Output<bool?> PacketCapture { get; private set; } = null!;

        /// <summary>
        /// The Rules param.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.WildfireAntiVirusProfileRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;

        /// <summary>
        /// The ThreatExceptions param.
        /// </summary>
        [Output("threatExceptions")]
        public Output<ImmutableArray<Outputs.WildfireAntiVirusProfileThreatException>> ThreatExceptions { get; private set; } = null!;


        /// <summary>
        /// Create a WildfireAntiVirusProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WildfireAntiVirusProfile(string name, WildfireAntiVirusProfileArgs? args = null, CustomResourceOptions? options = null)
            : base("scm:index/wildfireAntiVirusProfile:WildfireAntiVirusProfile", name, args ?? new WildfireAntiVirusProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WildfireAntiVirusProfile(string name, Input<string> id, WildfireAntiVirusProfileState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/wildfireAntiVirusProfile:WildfireAntiVirusProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WildfireAntiVirusProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WildfireAntiVirusProfile Get(string name, Input<string> id, WildfireAntiVirusProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new WildfireAntiVirusProfile(name, id, state, options);
        }
    }

    public sealed class WildfireAntiVirusProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Description param.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("mlavExceptions")]
        private InputList<Inputs.WildfireAntiVirusProfileMlavExceptionArgs>? _mlavExceptions;

        /// <summary>
        /// The MlavExceptions param.
        /// </summary>
        public InputList<Inputs.WildfireAntiVirusProfileMlavExceptionArgs> MlavExceptions
        {
            get => _mlavExceptions ?? (_mlavExceptions = new InputList<Inputs.WildfireAntiVirusProfileMlavExceptionArgs>());
            set => _mlavExceptions = value;
        }

        /// <summary>
        /// The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The PacketCapture param.
        /// </summary>
        [Input("packetCapture")]
        public Input<bool>? PacketCapture { get; set; }

        [Input("rules")]
        private InputList<Inputs.WildfireAntiVirusProfileRuleArgs>? _rules;

        /// <summary>
        /// The Rules param.
        /// </summary>
        public InputList<Inputs.WildfireAntiVirusProfileRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.WildfireAntiVirusProfileRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("threatExceptions")]
        private InputList<Inputs.WildfireAntiVirusProfileThreatExceptionArgs>? _threatExceptions;

        /// <summary>
        /// The ThreatExceptions param.
        /// </summary>
        public InputList<Inputs.WildfireAntiVirusProfileThreatExceptionArgs> ThreatExceptions
        {
            get => _threatExceptions ?? (_threatExceptions = new InputList<Inputs.WildfireAntiVirusProfileThreatExceptionArgs>());
            set => _threatExceptions = value;
        }

        public WildfireAntiVirusProfileArgs()
        {
        }
        public static new WildfireAntiVirusProfileArgs Empty => new WildfireAntiVirusProfileArgs();
    }

    public sealed class WildfireAntiVirusProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Description param.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("mlavExceptions")]
        private InputList<Inputs.WildfireAntiVirusProfileMlavExceptionGetArgs>? _mlavExceptions;

        /// <summary>
        /// The MlavExceptions param.
        /// </summary>
        public InputList<Inputs.WildfireAntiVirusProfileMlavExceptionGetArgs> MlavExceptions
        {
            get => _mlavExceptions ?? (_mlavExceptions = new InputList<Inputs.WildfireAntiVirusProfileMlavExceptionGetArgs>());
            set => _mlavExceptions = value;
        }

        /// <summary>
        /// The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The PacketCapture param.
        /// </summary>
        [Input("packetCapture")]
        public Input<bool>? PacketCapture { get; set; }

        [Input("rules")]
        private InputList<Inputs.WildfireAntiVirusProfileRuleGetArgs>? _rules;

        /// <summary>
        /// The Rules param.
        /// </summary>
        public InputList<Inputs.WildfireAntiVirusProfileRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.WildfireAntiVirusProfileRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        [Input("threatExceptions")]
        private InputList<Inputs.WildfireAntiVirusProfileThreatExceptionGetArgs>? _threatExceptions;

        /// <summary>
        /// The ThreatExceptions param.
        /// </summary>
        public InputList<Inputs.WildfireAntiVirusProfileThreatExceptionGetArgs> ThreatExceptions
        {
            get => _threatExceptions ?? (_threatExceptions = new InputList<Inputs.WildfireAntiVirusProfileThreatExceptionGetArgs>());
            set => _threatExceptions = value;
        }

        public WildfireAntiVirusProfileState()
        {
        }
        public static new WildfireAntiVirusProfileState Empty => new WildfireAntiVirusProfileState();
    }
}
