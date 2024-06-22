// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQosPolicyRuleDscpTosCodepointTypeTos {
    /**
     * @return The Codepoint param.
     * 
     */
    private String codepoint;

    private GetQosPolicyRuleDscpTosCodepointTypeTos() {}
    /**
     * @return The Codepoint param.
     * 
     */
    public String codepoint() {
        return this.codepoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosPolicyRuleDscpTosCodepointTypeTos defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String codepoint;
        public Builder() {}
        public Builder(GetQosPolicyRuleDscpTosCodepointTypeTos defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codepoint = defaults.codepoint;
        }

        @CustomType.Setter
        public Builder codepoint(String codepoint) {
            if (codepoint == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleDscpTosCodepointTypeTos", "codepoint");
            }
            this.codepoint = codepoint;
            return this;
        }
        public GetQosPolicyRuleDscpTosCodepointTypeTos build() {
            final var _resultValue = new GetQosPolicyRuleDscpTosCodepointTypeTos();
            _resultValue.codepoint = codepoint;
            return _resultValue;
        }
    }
}
