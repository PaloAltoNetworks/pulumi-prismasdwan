// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OcspResponderArgs extends com.pulumi.resources.ResourceArgs {

    public static final OcspResponderArgs Empty = new OcspResponderArgs();

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The HostName param. String length must be between 1 and 255 characters.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return The HostName param. String length must be between 1 and 255 characters.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * alphanumeric string [:0-9a-zA-Z._-]. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return alphanumeric string [:0-9a-zA-Z._-]. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable Output<String> snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<Output<String>> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    private OcspResponderArgs() {}

    private OcspResponderArgs(OcspResponderArgs $) {
        this.device = $.device;
        this.folder = $.folder;
        this.hostName = $.hostName;
        this.name = $.name;
        this.snippet = $.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OcspResponderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OcspResponderArgs $;

        public Builder() {
            $ = new OcspResponderArgs();
        }

        public Builder(OcspResponderArgs defaults) {
            $ = new OcspResponderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param hostName The HostName param. String length must be between 1 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The HostName param. String length must be between 1 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param name alphanumeric string [:0-9a-zA-Z._-]. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name alphanumeric string [:0-9a-zA-Z._-]. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable Output<String> snippet) {
            $.snippet = snippet;
            return this;
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(String snippet) {
            return snippet(Output.of(snippet));
        }

        public OcspResponderArgs build() {
            if ($.hostName == null) {
                throw new MissingRequiredPropertyException("OcspResponderArgs", "hostName");
            }
            return $;
        }
    }

}
