// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RemoteNetworkProtocolBgpPeerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RemoteNetworkProtocolBgpPeerArgs Empty = new RemoteNetworkProtocolBgpPeerArgs();

    /**
     * The LocalIpAddress param.
     * 
     */
    @Import(name="localIpAddress")
    private @Nullable Output<String> localIpAddress;

    /**
     * @return The LocalIpAddress param.
     * 
     */
    public Optional<Output<String>> localIpAddress() {
        return Optional.ofNullable(this.localIpAddress);
    }

    /**
     * The PeerIpAddress param.
     * 
     */
    @Import(name="peerIpAddress")
    private @Nullable Output<String> peerIpAddress;

    /**
     * @return The PeerIpAddress param.
     * 
     */
    public Optional<Output<String>> peerIpAddress() {
        return Optional.ofNullable(this.peerIpAddress);
    }

    /**
     * The Secret param.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return The Secret param.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private RemoteNetworkProtocolBgpPeerArgs() {}

    private RemoteNetworkProtocolBgpPeerArgs(RemoteNetworkProtocolBgpPeerArgs $) {
        this.localIpAddress = $.localIpAddress;
        this.peerIpAddress = $.peerIpAddress;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemoteNetworkProtocolBgpPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemoteNetworkProtocolBgpPeerArgs $;

        public Builder() {
            $ = new RemoteNetworkProtocolBgpPeerArgs();
        }

        public Builder(RemoteNetworkProtocolBgpPeerArgs defaults) {
            $ = new RemoteNetworkProtocolBgpPeerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localIpAddress The LocalIpAddress param.
         * 
         * @return builder
         * 
         */
        public Builder localIpAddress(@Nullable Output<String> localIpAddress) {
            $.localIpAddress = localIpAddress;
            return this;
        }

        /**
         * @param localIpAddress The LocalIpAddress param.
         * 
         * @return builder
         * 
         */
        public Builder localIpAddress(String localIpAddress) {
            return localIpAddress(Output.of(localIpAddress));
        }

        /**
         * @param peerIpAddress The PeerIpAddress param.
         * 
         * @return builder
         * 
         */
        public Builder peerIpAddress(@Nullable Output<String> peerIpAddress) {
            $.peerIpAddress = peerIpAddress;
            return this;
        }

        /**
         * @param peerIpAddress The PeerIpAddress param.
         * 
         * @return builder
         * 
         */
        public Builder peerIpAddress(String peerIpAddress) {
            return peerIpAddress(Output.of(peerIpAddress));
        }

        /**
         * @param secret The Secret param.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Secret param.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public RemoteNetworkProtocolBgpPeerArgs build() {
            return $;
        }
    }

}
