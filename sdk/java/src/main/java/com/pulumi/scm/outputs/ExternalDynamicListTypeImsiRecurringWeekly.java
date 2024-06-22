// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalDynamicListTypeImsiRecurringWeekly {
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    private @Nullable String at;
    /**
     * @return The DayOfWeek param. String must be one of these: `&#34;sunday&#34;`, `&#34;monday&#34;`, `&#34;tuesday&#34;`, `&#34;wednesday&#34;`, `&#34;thursday&#34;`, `&#34;friday&#34;`, `&#34;saturday&#34;`.
     * 
     */
    private String dayOfWeek;

    private ExternalDynamicListTypeImsiRecurringWeekly() {}
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    public Optional<String> at() {
        return Optional.ofNullable(this.at);
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

    public static Builder builder(ExternalDynamicListTypeImsiRecurringWeekly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String at;
        private String dayOfWeek;
        public Builder() {}
        public Builder(ExternalDynamicListTypeImsiRecurringWeekly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.at = defaults.at;
    	      this.dayOfWeek = defaults.dayOfWeek;
        }

        @CustomType.Setter
        public Builder at(@Nullable String at) {

            this.at = at;
            return this;
        }
        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            if (dayOfWeek == null) {
              throw new MissingRequiredPropertyException("ExternalDynamicListTypeImsiRecurringWeekly", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public ExternalDynamicListTypeImsiRecurringWeekly build() {
            final var _resultValue = new ExternalDynamicListTypeImsiRecurringWeekly();
            _resultValue.at = at;
            _resultValue.dayOfWeek = dayOfWeek;
            return _resultValue;
        }
    }
}
