// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetIkeGatewayProtocolIkev1;
import com.pulumi.scm.outputs.GetIkeGatewayProtocolIkev2;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIkeGatewayProtocol {
    /**
     * @return The Ikev1 param.
     * 
     */
    private GetIkeGatewayProtocolIkev1 ikev1;
    /**
     * @return The Ikev2 param.
     * 
     */
    private GetIkeGatewayProtocolIkev2 ikev2;
    /**
     * @return The Version param. String must be one of these: `&#34;ikev2-preferred&#34;`, `&#34;ikev1&#34;`, `&#34;ikev2&#34;`. Default: `&#34;ikev2-preferred&#34;`.
     * 
     */
    private String version;

    private GetIkeGatewayProtocol() {}
    /**
     * @return The Ikev1 param.
     * 
     */
    public GetIkeGatewayProtocolIkev1 ikev1() {
        return this.ikev1;
    }
    /**
     * @return The Ikev2 param.
     * 
     */
    public GetIkeGatewayProtocolIkev2 ikev2() {
        return this.ikev2;
    }
    /**
     * @return The Version param. String must be one of these: `&#34;ikev2-preferred&#34;`, `&#34;ikev1&#34;`, `&#34;ikev2&#34;`. Default: `&#34;ikev2-preferred&#34;`.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIkeGatewayProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetIkeGatewayProtocolIkev1 ikev1;
        private GetIkeGatewayProtocolIkev2 ikev2;
        private String version;
        public Builder() {}
        public Builder(GetIkeGatewayProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ikev1 = defaults.ikev1;
    	      this.ikev2 = defaults.ikev2;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder ikev1(GetIkeGatewayProtocolIkev1 ikev1) {
            if (ikev1 == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayProtocol", "ikev1");
            }
            this.ikev1 = ikev1;
            return this;
        }
        @CustomType.Setter
        public Builder ikev2(GetIkeGatewayProtocolIkev2 ikev2) {
            if (ikev2 == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayProtocol", "ikev2");
            }
            this.ikev2 = ikev2;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayProtocol", "version");
            }
            this.version = version;
            return this;
        }
        public GetIkeGatewayProtocol build() {
            final var _resultValue = new GetIkeGatewayProtocol();
            _resultValue.ikev1 = ikev1;
            _resultValue.ikev2 = ikev2;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
