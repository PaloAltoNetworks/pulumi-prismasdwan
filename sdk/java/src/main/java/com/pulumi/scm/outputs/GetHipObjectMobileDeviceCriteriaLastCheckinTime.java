// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectMobileDeviceCriteriaLastCheckinTimeNotWithin;
import com.pulumi.scm.outputs.GetHipObjectMobileDeviceCriteriaLastCheckinTimeWithin;
import java.util.Objects;

@CustomType
public final class GetHipObjectMobileDeviceCriteriaLastCheckinTime {
    /**
     * @return The NotWithin param.
     * 
     */
    private GetHipObjectMobileDeviceCriteriaLastCheckinTimeNotWithin notWithin;
    /**
     * @return The Within param.
     * 
     */
    private GetHipObjectMobileDeviceCriteriaLastCheckinTimeWithin within;

    private GetHipObjectMobileDeviceCriteriaLastCheckinTime() {}
    /**
     * @return The NotWithin param.
     * 
     */
    public GetHipObjectMobileDeviceCriteriaLastCheckinTimeNotWithin notWithin() {
        return this.notWithin;
    }
    /**
     * @return The Within param.
     * 
     */
    public GetHipObjectMobileDeviceCriteriaLastCheckinTimeWithin within() {
        return this.within;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectMobileDeviceCriteriaLastCheckinTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectMobileDeviceCriteriaLastCheckinTimeNotWithin notWithin;
        private GetHipObjectMobileDeviceCriteriaLastCheckinTimeWithin within;
        public Builder() {}
        public Builder(GetHipObjectMobileDeviceCriteriaLastCheckinTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notWithin = defaults.notWithin;
    	      this.within = defaults.within;
        }

        @CustomType.Setter
        public Builder notWithin(GetHipObjectMobileDeviceCriteriaLastCheckinTimeNotWithin notWithin) {
            if (notWithin == null) {
              throw new MissingRequiredPropertyException("GetHipObjectMobileDeviceCriteriaLastCheckinTime", "notWithin");
            }
            this.notWithin = notWithin;
            return this;
        }
        @CustomType.Setter
        public Builder within(GetHipObjectMobileDeviceCriteriaLastCheckinTimeWithin within) {
            if (within == null) {
              throw new MissingRequiredPropertyException("GetHipObjectMobileDeviceCriteriaLastCheckinTime", "within");
            }
            this.within = within;
            return this;
        }
        public GetHipObjectMobileDeviceCriteriaLastCheckinTime build() {
            final var _resultValue = new GetHipObjectMobileDeviceCriteriaLastCheckinTime();
            _resultValue.notWithin = notWithin;
            _resultValue.within = within;
            return _resultValue;
        }
    }
}
