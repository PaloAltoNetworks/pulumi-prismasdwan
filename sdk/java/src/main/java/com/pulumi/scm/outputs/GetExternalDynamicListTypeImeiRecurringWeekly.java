// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExternalDynamicListTypeImeiRecurringWeekly {
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    private String at;
    /**
     * @return The DayOfWeek param. String must be one of these: `&#34;sunday&#34;`, `&#34;monday&#34;`, `&#34;tuesday&#34;`, `&#34;wednesday&#34;`, `&#34;thursday&#34;`, `&#34;friday&#34;`, `&#34;saturday&#34;`.
     * 
     */
    private String dayOfWeek;

    private GetExternalDynamicListTypeImeiRecurringWeekly() {}
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    public String at() {
        return this.at;
    }
    /**
     * @return The DayOfWeek param. String must be one of these: `&#34;sunday&#34;`, `&#34;monday&#34;`, `&#34;tuesday&#34;`, `&#34;wednesday&#34;`, `&#34;thursday&#34;`, `&#34;friday&#34;`, `&#34;saturday&#34;`.
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalDynamicListTypeImeiRecurringWeekly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String at;
        private String dayOfWeek;
        public Builder() {}
        public Builder(GetExternalDynamicListTypeImeiRecurringWeekly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.at = defaults.at;
    	      this.dayOfWeek = defaults.dayOfWeek;
        }

        @CustomType.Setter
        public Builder at(String at) {
            if (at == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeImeiRecurringWeekly", "at");
            }
            this.at = at;
            return this;
        }
        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            if (dayOfWeek == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeImeiRecurringWeekly", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public GetExternalDynamicListTypeImeiRecurringWeekly build() {
            final var _resultValue = new GetExternalDynamicListTypeImeiRecurringWeekly();
            _resultValue.at = at;
            _resultValue.dayOfWeek = dayOfWeek;
            return _resultValue;
        }
    }
}
