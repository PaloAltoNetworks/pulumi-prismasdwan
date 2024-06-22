// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRemoteNetworkProtocolBgp {
    /**
     * @return The DoNotExportRoutes param.
     * 
     */
    private Boolean doNotExportRoutes;
    /**
     * @return to setup bgp protocol, enable need to set as true.
     * 
     */
    private Boolean enable;
    /**
     * @return The LocalIpAddress param.
     * 
     */
    private String localIpAddress;
    /**
     * @return The OriginateDefaultRoute param.
     * 
     */
    private Boolean originateDefaultRoute;
    /**
     * @return The PeerAs param.
     * 
     */
    private String peerAs;
    /**
     * @return The PeerIpAddress param.
     * 
     */
    private String peerIpAddress;
    /**
     * @return Exchange Routes: exchange-v4-over-v4 stands for Exchange IPv4 routes over IPv4 peering. exchange-v4-v6-over-v4 stands for Exchange both IPv4 and IPv6 routes over IPv4 peering. exchange-v4-over-v4-v6-over-v6 stands for Exchange IPv4 routes over IPv4 peer and IPv6 route over IPv6 peer. exchange-v6-over-v6 stands for Exchange IPv6 routes over IPv6 peering. String must be one of these: `&#34;exchange-v4-over-v4&#34;`, `&#34;exchange-v4-v6-over-v4&#34;`, `&#34;exchange-v4-over-v4-v6-over-v6&#34;`, `&#34;exchange-v6-over-v6&#34;`.
     * 
     */
    private String peeringType;
    /**
     * @return The Secret param.
     * 
     */
    private String secret;
    /**
     * @return The SummarizeMobileUserRoutes param.
     * 
     */
    private Boolean summarizeMobileUserRoutes;

    private GetRemoteNetworkProtocolBgp() {}
    /**
     * @return The DoNotExportRoutes param.
     * 
     */
    public Boolean doNotExportRoutes() {
        return this.doNotExportRoutes;
    }
    /**
     * @return to setup bgp protocol, enable need to set as true.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The LocalIpAddress param.
     * 
     */
    public String localIpAddress() {
        return this.localIpAddress;
    }
    /**
     * @return The OriginateDefaultRoute param.
     * 
     */
    public Boolean originateDefaultRoute() {
        return this.originateDefaultRoute;
    }
    /**
     * @return The PeerAs param.
     * 
     */
    public String peerAs() {
        return this.peerAs;
    }
    /**
     * @return The PeerIpAddress param.
     * 
     */
    public String peerIpAddress() {
        return this.peerIpAddress;
    }
    /**
     * @return Exchange Routes: exchange-v4-over-v4 stands for Exchange IPv4 routes over IPv4 peering. exchange-v4-v6-over-v4 stands for Exchange both IPv4 and IPv6 routes over IPv4 peering. exchange-v4-over-v4-v6-over-v6 stands for Exchange IPv4 routes over IPv4 peer and IPv6 route over IPv6 peer. exchange-v6-over-v6 stands for Exchange IPv6 routes over IPv6 peering. String must be one of these: `&#34;exchange-v4-over-v4&#34;`, `&#34;exchange-v4-v6-over-v4&#34;`, `&#34;exchange-v4-over-v4-v6-over-v6&#34;`, `&#34;exchange-v6-over-v6&#34;`.
     * 
     */
    public String peeringType() {
        return this.peeringType;
    }
    /**
     * @return The Secret param.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return The SummarizeMobileUserRoutes param.
     * 
     */
    public Boolean summarizeMobileUserRoutes() {
        return this.summarizeMobileUserRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRemoteNetworkProtocolBgp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean doNotExportRoutes;
        private Boolean enable;
        private String localIpAddress;
        private Boolean originateDefaultRoute;
        private String peerAs;
        private String peerIpAddress;
        private String peeringType;
        private String secret;
        private Boolean summarizeMobileUserRoutes;
        public Builder() {}
        public Builder(GetRemoteNetworkProtocolBgp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotExportRoutes = defaults.doNotExportRoutes;
    	      this.enable = defaults.enable;
    	      this.localIpAddress = defaults.localIpAddress;
    	      this.originateDefaultRoute = defaults.originateDefaultRoute;
    	      this.peerAs = defaults.peerAs;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.peeringType = defaults.peeringType;
    	      this.secret = defaults.secret;
    	      this.summarizeMobileUserRoutes = defaults.summarizeMobileUserRoutes;
        }

        @CustomType.Setter
        public Builder doNotExportRoutes(Boolean doNotExportRoutes) {
            if (doNotExportRoutes == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "doNotExportRoutes");
            }
            this.doNotExportRoutes = doNotExportRoutes;
            return this;
        }
        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "enable");
            }
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder localIpAddress(String localIpAddress) {
            if (localIpAddress == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "localIpAddress");
            }
            this.localIpAddress = localIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder originateDefaultRoute(Boolean originateDefaultRoute) {
            if (originateDefaultRoute == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "originateDefaultRoute");
            }
            this.originateDefaultRoute = originateDefaultRoute;
            return this;
        }
        @CustomType.Setter
        public Builder peerAs(String peerAs) {
            if (peerAs == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "peerAs");
            }
            this.peerAs = peerAs;
            return this;
        }
        @CustomType.Setter
        public Builder peerIpAddress(String peerIpAddress) {
            if (peerIpAddress == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "peerIpAddress");
            }
            this.peerIpAddress = peerIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder peeringType(String peeringType) {
            if (peeringType == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "peeringType");
            }
            this.peeringType = peeringType;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder summarizeMobileUserRoutes(Boolean summarizeMobileUserRoutes) {
            if (summarizeMobileUserRoutes == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkProtocolBgp", "summarizeMobileUserRoutes");
            }
            this.summarizeMobileUserRoutes = summarizeMobileUserRoutes;
            return this;
        }
        public GetRemoteNetworkProtocolBgp build() {
            final var _resultValue = new GetRemoteNetworkProtocolBgp();
            _resultValue.doNotExportRoutes = doNotExportRoutes;
            _resultValue.enable = enable;
            _resultValue.localIpAddress = localIpAddress;
            _resultValue.originateDefaultRoute = originateDefaultRoute;
            _resultValue.peerAs = peerAs;
            _resultValue.peerIpAddress = peerIpAddress;
            _resultValue.peeringType = peeringType;
            _resultValue.secret = secret;
            _resultValue.summarizeMobileUserRoutes = summarizeMobileUserRoutes;
            return _resultValue;
        }
    }
}
