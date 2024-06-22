// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.IkeGatewayAuthenticationCertificateLocalCertificateArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IkeGatewayAuthenticationCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final IkeGatewayAuthenticationCertificateArgs Empty = new IkeGatewayAuthenticationCertificateArgs();

    /**
     * The AllowIdPayloadMismatch param.
     * 
     */
    @Import(name="allowIdPayloadMismatch")
    private @Nullable Output<Boolean> allowIdPayloadMismatch;

    /**
     * @return The AllowIdPayloadMismatch param.
     * 
     */
    public Optional<Output<Boolean>> allowIdPayloadMismatch() {
        return Optional.ofNullable(this.allowIdPayloadMismatch);
    }

    /**
     * The CertificateProfile param.
     * 
     */
    @Import(name="certificateProfile")
    private @Nullable Output<String> certificateProfile;

    /**
     * @return The CertificateProfile param.
     * 
     */
    public Optional<Output<String>> certificateProfile() {
        return Optional.ofNullable(this.certificateProfile);
    }

    /**
     * The LocalCertificate param.
     * 
     */
    @Import(name="localCertificate")
    private @Nullable Output<IkeGatewayAuthenticationCertificateLocalCertificateArgs> localCertificate;

    /**
     * @return The LocalCertificate param.
     * 
     */
    public Optional<Output<IkeGatewayAuthenticationCertificateLocalCertificateArgs>> localCertificate() {
        return Optional.ofNullable(this.localCertificate);
    }

    /**
     * The StrictValidationRevocation param.
     * 
     */
    @Import(name="strictValidationRevocation")
    private @Nullable Output<Boolean> strictValidationRevocation;

    /**
     * @return The StrictValidationRevocation param.
     * 
     */
    public Optional<Output<Boolean>> strictValidationRevocation() {
        return Optional.ofNullable(this.strictValidationRevocation);
    }

    /**
     * The UseManagementAsSource param.
     * 
     */
    @Import(name="useManagementAsSource")
    private @Nullable Output<Boolean> useManagementAsSource;

    /**
     * @return The UseManagementAsSource param.
     * 
     */
    public Optional<Output<Boolean>> useManagementAsSource() {
        return Optional.ofNullable(this.useManagementAsSource);
    }

    private IkeGatewayAuthenticationCertificateArgs() {}

    private IkeGatewayAuthenticationCertificateArgs(IkeGatewayAuthenticationCertificateArgs $) {
        this.allowIdPayloadMismatch = $.allowIdPayloadMismatch;
        this.certificateProfile = $.certificateProfile;
        this.localCertificate = $.localCertificate;
        this.strictValidationRevocation = $.strictValidationRevocation;
        this.useManagementAsSource = $.useManagementAsSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IkeGatewayAuthenticationCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IkeGatewayAuthenticationCertificateArgs $;

        public Builder() {
            $ = new IkeGatewayAuthenticationCertificateArgs();
        }

        public Builder(IkeGatewayAuthenticationCertificateArgs defaults) {
            $ = new IkeGatewayAuthenticationCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowIdPayloadMismatch The AllowIdPayloadMismatch param.
         * 
         * @return builder
         * 
         */
        public Builder allowIdPayloadMismatch(@Nullable Output<Boolean> allowIdPayloadMismatch) {
            $.allowIdPayloadMismatch = allowIdPayloadMismatch;
            return this;
        }

        /**
         * @param allowIdPayloadMismatch The AllowIdPayloadMismatch param.
         * 
         * @return builder
         * 
         */
        public Builder allowIdPayloadMismatch(Boolean allowIdPayloadMismatch) {
            return allowIdPayloadMismatch(Output.of(allowIdPayloadMismatch));
        }

        /**
         * @param certificateProfile The CertificateProfile param.
         * 
         * @return builder
         * 
         */
        public Builder certificateProfile(@Nullable Output<String> certificateProfile) {
            $.certificateProfile = certificateProfile;
            return this;
        }

        /**
         * @param certificateProfile The CertificateProfile param.
         * 
         * @return builder
         * 
         */
        public Builder certificateProfile(String certificateProfile) {
            return certificateProfile(Output.of(certificateProfile));
        }

        /**
         * @param localCertificate The LocalCertificate param.
         * 
         * @return builder
         * 
         */
        public Builder localCertificate(@Nullable Output<IkeGatewayAuthenticationCertificateLocalCertificateArgs> localCertificate) {
            $.localCertificate = localCertificate;
            return this;
        }

        /**
         * @param localCertificate The LocalCertificate param.
         * 
         * @return builder
         * 
         */
        public Builder localCertificate(IkeGatewayAuthenticationCertificateLocalCertificateArgs localCertificate) {
            return localCertificate(Output.of(localCertificate));
        }

        /**
         * @param strictValidationRevocation The StrictValidationRevocation param.
         * 
         * @return builder
         * 
         */
        public Builder strictValidationRevocation(@Nullable Output<Boolean> strictValidationRevocation) {
            $.strictValidationRevocation = strictValidationRevocation;
            return this;
        }

        /**
         * @param strictValidationRevocation The StrictValidationRevocation param.
         * 
         * @return builder
         * 
         */
        public Builder strictValidationRevocation(Boolean strictValidationRevocation) {
            return strictValidationRevocation(Output.of(strictValidationRevocation));
        }

        /**
         * @param useManagementAsSource The UseManagementAsSource param.
         * 
         * @return builder
         * 
         */
        public Builder useManagementAsSource(@Nullable Output<Boolean> useManagementAsSource) {
            $.useManagementAsSource = useManagementAsSource;
            return this;
        }

        /**
         * @param useManagementAsSource The UseManagementAsSource param.
         * 
         * @return builder
         * 
         */
        public Builder useManagementAsSource(Boolean useManagementAsSource) {
            return useManagementAsSource(Output.of(useManagementAsSource));
        }

        public IkeGatewayAuthenticationCertificateArgs build() {
            return $;
        }
    }

}
