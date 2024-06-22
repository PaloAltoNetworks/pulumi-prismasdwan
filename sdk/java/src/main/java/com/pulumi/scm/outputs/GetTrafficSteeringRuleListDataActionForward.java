// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTrafficSteeringRuleListDataActionForward {
    /**
     * @return The Target param.
     * 
     */
    private String target;

    private GetTrafficSteeringRuleListDataActionForward() {}
    /**
     * @return The Target param.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficSteeringRuleListDataActionForward defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String target;
        public Builder() {}
        public Builder(GetTrafficSteeringRuleListDataActionForward defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListDataActionForward", "target");
            }
            this.target = target;
            return this;
        }
        public GetTrafficSteeringRuleListDataActionForward build() {
            final var _resultValue = new GetTrafficSteeringRuleListDataActionForward();
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
