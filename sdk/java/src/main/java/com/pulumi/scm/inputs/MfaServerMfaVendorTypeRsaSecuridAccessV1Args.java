// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MfaServerMfaVendorTypeRsaSecuridAccessV1Args extends com.pulumi.resources.ResourceArgs {

    public static final MfaServerMfaVendorTypeRsaSecuridAccessV1Args Empty = new MfaServerMfaVendorTypeRsaSecuridAccessV1Args();

    /**
     * The RsaAccessid param.
     * 
     */
    @Import(name="rsaAccessid")
    private @Nullable Output<String> rsaAccessid;

    /**
     * @return The RsaAccessid param.
     * 
     */
    public Optional<Output<String>> rsaAccessid() {
        return Optional.ofNullable(this.rsaAccessid);
    }

    /**
     * The RsaAccesskey param.
     * 
     */
    @Import(name="rsaAccesskey")
    private @Nullable Output<String> rsaAccesskey;

    /**
     * @return The RsaAccesskey param.
     * 
     */
    public Optional<Output<String>> rsaAccesskey() {
        return Optional.ofNullable(this.rsaAccesskey);
    }

    /**
     * The RsaApiHost param.
     * 
     */
    @Import(name="rsaApiHost")
    private @Nullable Output<String> rsaApiHost;

    /**
     * @return The RsaApiHost param.
     * 
     */
    public Optional<Output<String>> rsaApiHost() {
        return Optional.ofNullable(this.rsaApiHost);
    }

    /**
     * The RsaAssurancepolicyid param.
     * 
     */
    @Import(name="rsaAssurancepolicyid")
    private @Nullable Output<String> rsaAssurancepolicyid;

    /**
     * @return The RsaAssurancepolicyid param.
     * 
     */
    public Optional<Output<String>> rsaAssurancepolicyid() {
        return Optional.ofNullable(this.rsaAssurancepolicyid);
    }

    /**
     * The RsaBaseuri param.
     * 
     */
    @Import(name="rsaBaseuri")
    private @Nullable Output<String> rsaBaseuri;

    /**
     * @return The RsaBaseuri param.
     * 
     */
    public Optional<Output<String>> rsaBaseuri() {
        return Optional.ofNullable(this.rsaBaseuri);
    }

    /**
     * The RsaTimeout param.
     * 
     */
    @Import(name="rsaTimeout")
    private @Nullable Output<String> rsaTimeout;

    /**
     * @return The RsaTimeout param.
     * 
     */
    public Optional<Output<String>> rsaTimeout() {
        return Optional.ofNullable(this.rsaTimeout);
    }

    private MfaServerMfaVendorTypeRsaSecuridAccessV1Args() {}

    private MfaServerMfaVendorTypeRsaSecuridAccessV1Args(MfaServerMfaVendorTypeRsaSecuridAccessV1Args $) {
        this.rsaAccessid = $.rsaAccessid;
        this.rsaAccesskey = $.rsaAccesskey;
        this.rsaApiHost = $.rsaApiHost;
        this.rsaAssurancepolicyid = $.rsaAssurancepolicyid;
        this.rsaBaseuri = $.rsaBaseuri;
        this.rsaTimeout = $.rsaTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MfaServerMfaVendorTypeRsaSecuridAccessV1Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MfaServerMfaVendorTypeRsaSecuridAccessV1Args $;

        public Builder() {
            $ = new MfaServerMfaVendorTypeRsaSecuridAccessV1Args();
        }

        public Builder(MfaServerMfaVendorTypeRsaSecuridAccessV1Args defaults) {
            $ = new MfaServerMfaVendorTypeRsaSecuridAccessV1Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param rsaAccessid The RsaAccessid param.
         * 
         * @return builder
         * 
         */
        public Builder rsaAccessid(@Nullable Output<String> rsaAccessid) {
            $.rsaAccessid = rsaAccessid;
            return this;
        }

        /**
         * @param rsaAccessid The RsaAccessid param.
         * 
         * @return builder
         * 
         */
        public Builder rsaAccessid(String rsaAccessid) {
            return rsaAccessid(Output.of(rsaAccessid));
        }

        /**
         * @param rsaAccesskey The RsaAccesskey param.
         * 
         * @return builder
         * 
         */
        public Builder rsaAccesskey(@Nullable Output<String> rsaAccesskey) {
            $.rsaAccesskey = rsaAccesskey;
            return this;
        }

        /**
         * @param rsaAccesskey The RsaAccesskey param.
         * 
         * @return builder
         * 
         */
        public Builder rsaAccesskey(String rsaAccesskey) {
            return rsaAccesskey(Output.of(rsaAccesskey));
        }

        /**
         * @param rsaApiHost The RsaApiHost param.
         * 
         * @return builder
         * 
         */
        public Builder rsaApiHost(@Nullable Output<String> rsaApiHost) {
            $.rsaApiHost = rsaApiHost;
            return this;
        }

        /**
         * @param rsaApiHost The RsaApiHost param.
         * 
         * @return builder
         * 
         */
        public Builder rsaApiHost(String rsaApiHost) {
            return rsaApiHost(Output.of(rsaApiHost));
        }

        /**
         * @param rsaAssurancepolicyid The RsaAssurancepolicyid param.
         * 
         * @return builder
         * 
         */
        public Builder rsaAssurancepolicyid(@Nullable Output<String> rsaAssurancepolicyid) {
            $.rsaAssurancepolicyid = rsaAssurancepolicyid;
            return this;
        }

        /**
         * @param rsaAssurancepolicyid The RsaAssurancepolicyid param.
         * 
         * @return builder
         * 
         */
        public Builder rsaAssurancepolicyid(String rsaAssurancepolicyid) {
            return rsaAssurancepolicyid(Output.of(rsaAssurancepolicyid));
        }

        /**
         * @param rsaBaseuri The RsaBaseuri param.
         * 
         * @return builder
         * 
         */
        public Builder rsaBaseuri(@Nullable Output<String> rsaBaseuri) {
            $.rsaBaseuri = rsaBaseuri;
            return this;
        }

        /**
         * @param rsaBaseuri The RsaBaseuri param.
         * 
         * @return builder
         * 
         */
        public Builder rsaBaseuri(String rsaBaseuri) {
            return rsaBaseuri(Output.of(rsaBaseuri));
        }

        /**
         * @param rsaTimeout The RsaTimeout param.
         * 
         * @return builder
         * 
         */
        public Builder rsaTimeout(@Nullable Output<String> rsaTimeout) {
            $.rsaTimeout = rsaTimeout;
            return this;
        }

        /**
         * @param rsaTimeout The RsaTimeout param.
         * 
         * @return builder
         * 
         */
        public Builder rsaTimeout(String rsaTimeout) {
            return rsaTimeout(Output.of(rsaTimeout));
        }

        public MfaServerMfaVendorTypeRsaSecuridAccessV1Args build() {
            return $;
        }
    }

}
