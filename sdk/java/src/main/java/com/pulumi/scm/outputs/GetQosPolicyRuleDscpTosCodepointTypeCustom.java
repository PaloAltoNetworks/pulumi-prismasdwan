// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetQosPolicyRuleDscpTosCodepointTypeCustomCodepoint;
import java.util.Objects;

@CustomType
public final class GetQosPolicyRuleDscpTosCodepointTypeCustom {
    /**
     * @return The Codepoint param.
     * 
     */
    private GetQosPolicyRuleDscpTosCodepointTypeCustomCodepoint codepoint;

    private GetQosPolicyRuleDscpTosCodepointTypeCustom() {}
    /**
     * @return The Codepoint param.
     * 
     */
    public GetQosPolicyRuleDscpTosCodepointTypeCustomCodepoint codepoint() {
        return this.codepoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosPolicyRuleDscpTosCodepointTypeCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetQosPolicyRuleDscpTosCodepointTypeCustomCodepoint codepoint;
        public Builder() {}
        public Builder(GetQosPolicyRuleDscpTosCodepointTypeCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codepoint = defaults.codepoint;
        }

        @CustomType.Setter
        public Builder codepoint(GetQosPolicyRuleDscpTosCodepointTypeCustomCodepoint codepoint) {
            if (codepoint == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleDscpTosCodepointTypeCustom", "codepoint");
            }
            this.codepoint = codepoint;
            return this;
        }
        public GetQosPolicyRuleDscpTosCodepointTypeCustom build() {
            final var _resultValue = new GetQosPolicyRuleDscpTosCodepointTypeCustom();
            _resultValue.codepoint = codepoint;
            return _resultValue;
        }
    }
}
