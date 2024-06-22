// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.TacacsServerProfileServerArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TacacsServerProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final TacacsServerProfileArgs Empty = new TacacsServerProfileArgs();

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
     * The Protocol param. String must be one of these: `&#34;CHAP&#34;`, `&#34;PAP&#34;`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The Protocol param. String must be one of these: `&#34;CHAP&#34;`, `&#34;PAP&#34;`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The Servers param.
     * 
     */
    @Import(name="servers", required=true)
    private Output<List<TacacsServerProfileServerArgs>> servers;

    /**
     * @return The Servers param.
     * 
     */
    public Output<List<TacacsServerProfileServerArgs>> servers() {
        return this.servers;
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

    /**
     * The Timeout param. Value must be between 1 and 30.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The Timeout param. Value must be between 1 and 30.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The UseSingleConnection param.
     * 
     */
    @Import(name="useSingleConnection")
    private @Nullable Output<Boolean> useSingleConnection;

    /**
     * @return The UseSingleConnection param.
     * 
     */
    public Optional<Output<Boolean>> useSingleConnection() {
        return Optional.ofNullable(this.useSingleConnection);
    }

    private TacacsServerProfileArgs() {}

    private TacacsServerProfileArgs(TacacsServerProfileArgs $) {
        this.device = $.device;
        this.folder = $.folder;
        this.protocol = $.protocol;
        this.servers = $.servers;
        this.snippet = $.snippet;
        this.timeout = $.timeout;
        this.useSingleConnection = $.useSingleConnection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TacacsServerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TacacsServerProfileArgs $;

        public Builder() {
            $ = new TacacsServerProfileArgs();
        }

        public Builder(TacacsServerProfileArgs defaults) {
            $ = new TacacsServerProfileArgs(Objects.requireNonNull(defaults));
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
         * @param protocol The Protocol param. String must be one of these: `&#34;CHAP&#34;`, `&#34;PAP&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The Protocol param. String must be one of these: `&#34;CHAP&#34;`, `&#34;PAP&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(Output<List<TacacsServerProfileServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(List<TacacsServerProfileServerArgs> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(TacacsServerProfileServerArgs... servers) {
            return servers(List.of(servers));
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

        /**
         * @param timeout The Timeout param. Value must be between 1 and 30.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The Timeout param. Value must be between 1 and 30.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param useSingleConnection The UseSingleConnection param.
         * 
         * @return builder
         * 
         */
        public Builder useSingleConnection(@Nullable Output<Boolean> useSingleConnection) {
            $.useSingleConnection = useSingleConnection;
            return this;
        }

        /**
         * @param useSingleConnection The UseSingleConnection param.
         * 
         * @return builder
         * 
         */
        public Builder useSingleConnection(Boolean useSingleConnection) {
            return useSingleConnection(Output.of(useSingleConnection));
        }

        public TacacsServerProfileArgs build() {
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("TacacsServerProfileArgs", "protocol");
            }
            if ($.servers == null) {
                throw new MissingRequiredPropertyException("TacacsServerProfileArgs", "servers");
            }
            return $;
        }
    }

}
