// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceConnectionListDataProtocolBgp {
    /**
     * @return The DoNotExportRoutes param.
     * 
     */
    private Boolean doNotExportRoutes;
    /**
     * @return The Enable param.
     * 
     */
    private Boolean enable;
    /**
     * @return The FastFailover param.
     * 
     */
    private Boolean fastFailover;
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
     * @return The Secret param.
     * 
     */
    private String secret;
    /**
     * @return The SummarizeMobileUserRoutes param.
     * 
     */
    private Boolean summarizeMobileUserRoutes;

    private GetServiceConnectionListDataProtocolBgp() {}
    /**
     * @return The DoNotExportRoutes param.
     * 
     */
    public Boolean doNotExportRoutes() {
        return this.doNotExportRoutes;
    }
    /**
     * @return The Enable param.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The FastFailover param.
     * 
     */
    public Boolean fastFailover() {
        return this.fastFailover;
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

    public static Builder builder(GetServiceConnectionListDataProtocolBgp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean doNotExportRoutes;
        private Boolean enable;
        private Boolean fastFailover;
        private String localIpAddress;
        private Boolean originateDefaultRoute;
        private String peerAs;
        private String peerIpAddress;
        private String secret;
        private Boolean summarizeMobileUserRoutes;
        public Builder() {}
        public Builder(GetServiceConnectionListDataProtocolBgp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotExportRoutes = defaults.doNotExportRoutes;
    	      this.enable = defaults.enable;
    	      this.fastFailover = defaults.fastFailover;
    	      this.localIpAddress = defaults.localIpAddress;
    	      this.originateDefaultRoute = defaults.originateDefaultRoute;
    	      this.peerAs = defaults.peerAs;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.secret = defaults.secret;
    	      this.summarizeMobileUserRoutes = defaults.summarizeMobileUserRoutes;
        }

        @CustomType.Setter
        public Builder doNotExportRoutes(Boolean doNotExportRoutes) {
            if (doNotExportRoutes == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "doNotExportRoutes");
            }
            this.doNotExportRoutes = doNotExportRoutes;
            return this;
        }
        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "enable");
            }
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder fastFailover(Boolean fastFailover) {
            if (fastFailover == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "fastFailover");
            }
            this.fastFailover = fastFailover;
            return this;
        }
        @CustomType.Setter
        public Builder localIpAddress(String localIpAddress) {
            if (localIpAddress == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "localIpAddress");
            }
            this.localIpAddress = localIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder originateDefaultRoute(Boolean originateDefaultRoute) {
            if (originateDefaultRoute == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "originateDefaultRoute");
            }
            this.originateDefaultRoute = originateDefaultRoute;
            return this;
        }
        @CustomType.Setter
        public Builder peerAs(String peerAs) {
            if (peerAs == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "peerAs");
            }
            this.peerAs = peerAs;
            return this;
        }
        @CustomType.Setter
        public Builder peerIpAddress(String peerIpAddress) {
            if (peerIpAddress == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "peerIpAddress");
            }
            this.peerIpAddress = peerIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder summarizeMobileUserRoutes(Boolean summarizeMobileUserRoutes) {
            if (summarizeMobileUserRoutes == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataProtocolBgp", "summarizeMobileUserRoutes");
            }
            this.summarizeMobileUserRoutes = summarizeMobileUserRoutes;
            return this;
        }
        public GetServiceConnectionListDataProtocolBgp build() {
            final var _resultValue = new GetServiceConnectionListDataProtocolBgp();
            _resultValue.doNotExportRoutes = doNotExportRoutes;
            _resultValue.enable = enable;
            _resultValue.fastFailover = fastFailover;
            _resultValue.localIpAddress = localIpAddress;
            _resultValue.originateDefaultRoute = originateDefaultRoute;
            _resultValue.peerAs = peerAs;
            _resultValue.peerIpAddress = peerIpAddress;
            _resultValue.secret = secret;
            _resultValue.summarizeMobileUserRoutes = summarizeMobileUserRoutes;
            return _resultValue;
        }
    }
}
