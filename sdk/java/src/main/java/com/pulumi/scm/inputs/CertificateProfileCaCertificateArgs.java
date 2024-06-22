// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateProfileCaCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateProfileCaCertificateArgs Empty = new CertificateProfileCaCertificateArgs();

    /**
     * The DefaultOcspUrl param.
     * 
     */
    @Import(name="defaultOcspUrl")
    private @Nullable Output<String> defaultOcspUrl;

    /**
     * @return The DefaultOcspUrl param.
     * 
     */
    public Optional<Output<String>> defaultOcspUrl() {
        return Optional.ofNullable(this.defaultOcspUrl);
    }

    /**
     * The Name param.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The OcspVerifyCert param.
     * 
     */
    @Import(name="ocspVerifyCert")
    private @Nullable Output<String> ocspVerifyCert;

    /**
     * @return The OcspVerifyCert param.
     * 
     */
    public Optional<Output<String>> ocspVerifyCert() {
        return Optional.ofNullable(this.ocspVerifyCert);
    }

    /**
     * The TemplateName param.
     * 
     */
    @Import(name="templateName")
    private @Nullable Output<String> templateName;

    /**
     * @return The TemplateName param.
     * 
     */
    public Optional<Output<String>> templateName() {
        return Optional.ofNullable(this.templateName);
    }

    private CertificateProfileCaCertificateArgs() {}

    private CertificateProfileCaCertificateArgs(CertificateProfileCaCertificateArgs $) {
        this.defaultOcspUrl = $.defaultOcspUrl;
        this.name = $.name;
        this.ocspVerifyCert = $.ocspVerifyCert;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateProfileCaCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateProfileCaCertificateArgs $;

        public Builder() {
            $ = new CertificateProfileCaCertificateArgs();
        }

        public Builder(CertificateProfileCaCertificateArgs defaults) {
            $ = new CertificateProfileCaCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultOcspUrl The DefaultOcspUrl param.
         * 
         * @return builder
         * 
         */
        public Builder defaultOcspUrl(@Nullable Output<String> defaultOcspUrl) {
            $.defaultOcspUrl = defaultOcspUrl;
            return this;
        }

        /**
         * @param defaultOcspUrl The DefaultOcspUrl param.
         * 
         * @return builder
         * 
         */
        public Builder defaultOcspUrl(String defaultOcspUrl) {
            return defaultOcspUrl(Output.of(defaultOcspUrl));
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ocspVerifyCert The OcspVerifyCert param.
         * 
         * @return builder
         * 
         */
        public Builder ocspVerifyCert(@Nullable Output<String> ocspVerifyCert) {
            $.ocspVerifyCert = ocspVerifyCert;
            return this;
        }

        /**
         * @param ocspVerifyCert The OcspVerifyCert param.
         * 
         * @return builder
         * 
         */
        public Builder ocspVerifyCert(String ocspVerifyCert) {
            return ocspVerifyCert(Output.of(ocspVerifyCert));
        }

        /**
         * @param templateName The TemplateName param.
         * 
         * @return builder
         * 
         */
        public Builder templateName(@Nullable Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName The TemplateName param.
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        public CertificateProfileCaCertificateArgs build() {
            return $;
        }
    }

}
