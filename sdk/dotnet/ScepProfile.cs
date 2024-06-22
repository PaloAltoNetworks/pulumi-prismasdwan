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
    ///     var example = new Scm.ScepProfile("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/scepProfile:ScepProfile")]
    public partial class ScepProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Algorithm param.
        /// </summary>
        [Output("algorithm")]
        public Output<Outputs.ScepProfileAlgorithm?> Algorithm { get; private set; } = null!;

        /// <summary>
        /// The CaIdentityName param.
        /// </summary>
        [Output("caIdentityName")]
        public Output<string> CaIdentityName { get; private set; } = null!;

        /// <summary>
        /// The CertificateAttributes param.
        /// </summary>
        [Output("certificateAttributes")]
        public Output<Outputs.ScepProfileCertificateAttributes?> CertificateAttributes { get; private set; } = null!;

        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The Digest param.
        /// </summary>
        [Output("digest")]
        public Output<string> Digest { get; private set; } = null!;

        /// <summary>
        /// (Internal use) Encrypted values returned from the API.
        /// </summary>
        [Output("encryptedValues")]
        public Output<ImmutableDictionary<string, string>> EncryptedValues { get; private set; } = null!;

        /// <summary>
        /// The Fingerprint param.
        /// </summary>
        [Output("fingerprint")]
        public Output<string?> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ScepCaCert param.
        /// </summary>
        [Output("scepCaCert")]
        public Output<string?> ScepCaCert { get; private set; } = null!;

        /// <summary>
        /// The ScepChallenge param.
        /// </summary>
        [Output("scepChallenge")]
        public Output<Outputs.ScepProfileScepChallenge?> ScepChallenge { get; private set; } = null!;

        /// <summary>
        /// The ScepClientCert param.
        /// </summary>
        [Output("scepClientCert")]
        public Output<string?> ScepClientCert { get; private set; } = null!;

        /// <summary>
        /// The ScepUrl param.
        /// </summary>
        [Output("scepUrl")]
        public Output<string> ScepUrl { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        /// <summary>
        /// The Subject param.
        /// </summary>
        [Output("subject")]
        public Output<string?> Subject { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;

        /// <summary>
        /// The UseAsDigitalSignature param.
        /// </summary>
        [Output("useAsDigitalSignature")]
        public Output<bool?> UseAsDigitalSignature { get; private set; } = null!;

        /// <summary>
        /// The UseForKeyEncipherment param.
        /// </summary>
        [Output("useForKeyEncipherment")]
        public Output<bool?> UseForKeyEncipherment { get; private set; } = null!;


        /// <summary>
        /// Create a ScepProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScepProfile(string name, ScepProfileArgs args, CustomResourceOptions? options = null)
            : base("scm:index/scepProfile:ScepProfile", name, args ?? new ScepProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScepProfile(string name, Input<string> id, ScepProfileState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/scepProfile:ScepProfile", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "encryptedValues",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ScepProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScepProfile Get(string name, Input<string> id, ScepProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new ScepProfile(name, id, state, options);
        }
    }

    public sealed class ScepProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Algorithm param.
        /// </summary>
        [Input("algorithm")]
        public Input<Inputs.ScepProfileAlgorithmArgs>? Algorithm { get; set; }

        /// <summary>
        /// The CaIdentityName param.
        /// </summary>
        [Input("caIdentityName", required: true)]
        public Input<string> CaIdentityName { get; set; } = null!;

        /// <summary>
        /// The CertificateAttributes param.
        /// </summary>
        [Input("certificateAttributes")]
        public Input<Inputs.ScepProfileCertificateAttributesArgs>? CertificateAttributes { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Digest param.
        /// </summary>
        [Input("digest", required: true)]
        public Input<string> Digest { get; set; } = null!;

        /// <summary>
        /// The Fingerprint param.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ScepCaCert param.
        /// </summary>
        [Input("scepCaCert")]
        public Input<string>? ScepCaCert { get; set; }

        /// <summary>
        /// The ScepChallenge param.
        /// </summary>
        [Input("scepChallenge")]
        public Input<Inputs.ScepProfileScepChallengeArgs>? ScepChallenge { get; set; }

        /// <summary>
        /// The ScepClientCert param.
        /// </summary>
        [Input("scepClientCert")]
        public Input<string>? ScepClientCert { get; set; }

        /// <summary>
        /// The ScepUrl param.
        /// </summary>
        [Input("scepUrl", required: true)]
        public Input<string> ScepUrl { get; set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The Subject param.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        /// <summary>
        /// The UseAsDigitalSignature param.
        /// </summary>
        [Input("useAsDigitalSignature")]
        public Input<bool>? UseAsDigitalSignature { get; set; }

        /// <summary>
        /// The UseForKeyEncipherment param.
        /// </summary>
        [Input("useForKeyEncipherment")]
        public Input<bool>? UseForKeyEncipherment { get; set; }

        public ScepProfileArgs()
        {
        }
        public static new ScepProfileArgs Empty => new ScepProfileArgs();
    }

    public sealed class ScepProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Algorithm param.
        /// </summary>
        [Input("algorithm")]
        public Input<Inputs.ScepProfileAlgorithmGetArgs>? Algorithm { get; set; }

        /// <summary>
        /// The CaIdentityName param.
        /// </summary>
        [Input("caIdentityName")]
        public Input<string>? CaIdentityName { get; set; }

        /// <summary>
        /// The CertificateAttributes param.
        /// </summary>
        [Input("certificateAttributes")]
        public Input<Inputs.ScepProfileCertificateAttributesGetArgs>? CertificateAttributes { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Digest param.
        /// </summary>
        [Input("digest")]
        public Input<string>? Digest { get; set; }

        [Input("encryptedValues")]
        private InputMap<string>? _encryptedValues;

        /// <summary>
        /// (Internal use) Encrypted values returned from the API.
        /// </summary>
        public InputMap<string> EncryptedValues
        {
            get => _encryptedValues ?? (_encryptedValues = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _encryptedValues = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The Fingerprint param.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ScepCaCert param.
        /// </summary>
        [Input("scepCaCert")]
        public Input<string>? ScepCaCert { get; set; }

        /// <summary>
        /// The ScepChallenge param.
        /// </summary>
        [Input("scepChallenge")]
        public Input<Inputs.ScepProfileScepChallengeGetArgs>? ScepChallenge { get; set; }

        /// <summary>
        /// The ScepClientCert param.
        /// </summary>
        [Input("scepClientCert")]
        public Input<string>? ScepClientCert { get; set; }

        /// <summary>
        /// The ScepUrl param.
        /// </summary>
        [Input("scepUrl")]
        public Input<string>? ScepUrl { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The Subject param.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        /// <summary>
        /// The UseAsDigitalSignature param.
        /// </summary>
        [Input("useAsDigitalSignature")]
        public Input<bool>? UseAsDigitalSignature { get; set; }

        /// <summary>
        /// The UseForKeyEncipherment param.
        /// </summary>
        [Input("useForKeyEncipherment")]
        public Input<bool>? UseForKeyEncipherment { get; set; }

        public ScepProfileState()
        {
        }
        public static new ScepProfileState Empty => new ScepProfileState();
    }
}
