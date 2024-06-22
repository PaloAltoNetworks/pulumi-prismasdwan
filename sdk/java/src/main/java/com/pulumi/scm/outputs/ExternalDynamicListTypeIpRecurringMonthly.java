// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalDynamicListTypeIpRecurringMonthly {
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    private @Nullable String at;
    /**
     * @return The DayOfMonth param. Value must be between 1 and 31.
     * 
     */
    private Integer dayOfMonth;

    private ExternalDynamicListTypeIpRecurringMonthly() {}
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    public Optional<String> at() {
        return Optional.ofNullable(this.at);
    }
    /**
     * @return The DayOfMonth param. Value must be between 1 and 31.
     * 
     */
    public Integer dayOfMonth() {
        return this.dayOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDynamicListTypeIpRecurringMonthly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String at;
        private Integer dayOfMonth;
        public Builder() {}
        public Builder(ExternalDynamicListTypeIpRecurringMonthly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.at = defaults.at;
    	      this.dayOfMonth = defaults.dayOfMonth;
        }

        @CustomType.Setter
        public Builder at(@Nullable String at) {

            this.at = at;
            return this;
        }
        @CustomType.Setter
        public Builder dayOfMonth(Integer dayOfMonth) {
            if (dayOfMonth == null) {
              throw new MissingRequiredPropertyException("ExternalDynamicListTypeIpRecurringMonthly", "dayOfMonth");
            }
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public ExternalDynamicListTypeIpRecurringMonthly build() {
            final var _resultValue = new ExternalDynamicListTypeIpRecurringMonthly();
            _resultValue.at = at;
            _resultValue.dayOfMonth = dayOfMonth;
            return _resultValue;
        }
    }
}
