// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExternalDynamicListListDataTypeImsiRecurringMonthly {
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    private String at;
    /**
     * @return The DayOfMonth param. Value must be between 1 and 31.
     * 
     */
    private Integer dayOfMonth;

    private GetExternalDynamicListListDataTypeImsiRecurringMonthly() {}
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    public String at() {
        return this.at;
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

    public static Builder builder(GetExternalDynamicListListDataTypeImsiRecurringMonthly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String at;
        private Integer dayOfMonth;
        public Builder() {}
        public Builder(GetExternalDynamicListListDataTypeImsiRecurringMonthly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.at = defaults.at;
    	      this.dayOfMonth = defaults.dayOfMonth;
        }

        @CustomType.Setter
        public Builder at(String at) {
            if (at == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeImsiRecurringMonthly", "at");
            }
            this.at = at;
            return this;
        }
        @CustomType.Setter
        public Builder dayOfMonth(Integer dayOfMonth) {
            if (dayOfMonth == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeImsiRecurringMonthly", "dayOfMonth");
            }
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public GetExternalDynamicListListDataTypeImsiRecurringMonthly build() {
            final var _resultValue = new GetExternalDynamicListListDataTypeImsiRecurringMonthly();
            _resultValue.at = at;
            _resultValue.dayOfMonth = dayOfMonth;
            return _resultValue;
        }
    }
}
