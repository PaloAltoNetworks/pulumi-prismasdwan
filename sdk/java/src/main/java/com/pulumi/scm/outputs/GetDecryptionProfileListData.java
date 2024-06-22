// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetDecryptionProfileListDataSslForwardProxy;
import com.pulumi.scm.outputs.GetDecryptionProfileListDataSslInboundProxy;
import com.pulumi.scm.outputs.GetDecryptionProfileListDataSslNoProxy;
import com.pulumi.scm.outputs.GetDecryptionProfileListDataSslProtocolSettings;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDecryptionProfileListData {
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
     * 
     */
    private String name;
    /**
     * @return The SslForwardProxy param.
     * 
     */
    private GetDecryptionProfileListDataSslForwardProxy sslForwardProxy;
    /**
     * @return The SslInboundProxy param.
     * 
     */
    private GetDecryptionProfileListDataSslInboundProxy sslInboundProxy;
    /**
     * @return The SslNoProxy param.
     * 
     */
    private GetDecryptionProfileListDataSslNoProxy sslNoProxy;
    /**
     * @return The SslProtocolSettings param.
     * 
     */
    private GetDecryptionProfileListDataSslProtocolSettings sslProtocolSettings;

    private GetDecryptionProfileListData() {}
    /**
     * @return UUID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The SslForwardProxy param.
     * 
     */
    public GetDecryptionProfileListDataSslForwardProxy sslForwardProxy() {
        return this.sslForwardProxy;
    }
    /**
     * @return The SslInboundProxy param.
     * 
     */
    public GetDecryptionProfileListDataSslInboundProxy sslInboundProxy() {
        return this.sslInboundProxy;
    }
    /**
     * @return The SslNoProxy param.
     * 
     */
    public GetDecryptionProfileListDataSslNoProxy sslNoProxy() {
        return this.sslNoProxy;
    }
    /**
     * @return The SslProtocolSettings param.
     * 
     */
    public GetDecryptionProfileListDataSslProtocolSettings sslProtocolSettings() {
        return this.sslProtocolSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDecryptionProfileListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private GetDecryptionProfileListDataSslForwardProxy sslForwardProxy;
        private GetDecryptionProfileListDataSslInboundProxy sslInboundProxy;
        private GetDecryptionProfileListDataSslNoProxy sslNoProxy;
        private GetDecryptionProfileListDataSslProtocolSettings sslProtocolSettings;
        public Builder() {}
        public Builder(GetDecryptionProfileListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sslForwardProxy = defaults.sslForwardProxy;
    	      this.sslInboundProxy = defaults.sslInboundProxy;
    	      this.sslNoProxy = defaults.sslNoProxy;
    	      this.sslProtocolSettings = defaults.sslProtocolSettings;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sslForwardProxy(GetDecryptionProfileListDataSslForwardProxy sslForwardProxy) {
            if (sslForwardProxy == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListData", "sslForwardProxy");
            }
            this.sslForwardProxy = sslForwardProxy;
            return this;
        }
        @CustomType.Setter
        public Builder sslInboundProxy(GetDecryptionProfileListDataSslInboundProxy sslInboundProxy) {
            if (sslInboundProxy == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListData", "sslInboundProxy");
            }
            this.sslInboundProxy = sslInboundProxy;
            return this;
        }
        @CustomType.Setter
        public Builder sslNoProxy(GetDecryptionProfileListDataSslNoProxy sslNoProxy) {
            if (sslNoProxy == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListData", "sslNoProxy");
            }
            this.sslNoProxy = sslNoProxy;
            return this;
        }
        @CustomType.Setter
        public Builder sslProtocolSettings(GetDecryptionProfileListDataSslProtocolSettings sslProtocolSettings) {
            if (sslProtocolSettings == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListData", "sslProtocolSettings");
            }
            this.sslProtocolSettings = sslProtocolSettings;
            return this;
        }
        public GetDecryptionProfileListData build() {
            final var _resultValue = new GetDecryptionProfileListData();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.sslForwardProxy = sslForwardProxy;
            _resultValue.sslInboundProxy = sslInboundProxy;
            _resultValue.sslNoProxy = sslNoProxy;
            _resultValue.sslProtocolSettings = sslProtocolSettings;
            return _resultValue;
        }
    }
}
