// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetScheduleListDataScheduleTypeRecurringWeekly;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetScheduleListDataScheduleTypeRecurring {
    /**
     * @return The DailyList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private List<String> dailyLists;
    /**
     * @return The Weekly param.
     * 
     */
    private GetScheduleListDataScheduleTypeRecurringWeekly weekly;

    private GetScheduleListDataScheduleTypeRecurring() {}
    /**
     * @return The DailyList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> dailyLists() {
        return this.dailyLists;
    }
    /**
     * @return The Weekly param.
     * 
     */
    public GetScheduleListDataScheduleTypeRecurringWeekly weekly() {
        return this.weekly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleListDataScheduleTypeRecurring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> dailyLists;
        private GetScheduleListDataScheduleTypeRecurringWeekly weekly;
        public Builder() {}
        public Builder(GetScheduleListDataScheduleTypeRecurring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyLists = defaults.dailyLists;
    	      this.weekly = defaults.weekly;
        }

        @CustomType.Setter
        public Builder dailyLists(List<String> dailyLists) {
            if (dailyLists == null) {
              throw new MissingRequiredPropertyException("GetScheduleListDataScheduleTypeRecurring", "dailyLists");
            }
            this.dailyLists = dailyLists;
            return this;
        }
        public Builder dailyLists(String... dailyLists) {
            return dailyLists(List.of(dailyLists));
        }
        @CustomType.Setter
        public Builder weekly(GetScheduleListDataScheduleTypeRecurringWeekly weekly) {
            if (weekly == null) {
              throw new MissingRequiredPropertyException("GetScheduleListDataScheduleTypeRecurring", "weekly");
            }
            this.weekly = weekly;
            return this;
        }
        public GetScheduleListDataScheduleTypeRecurring build() {
            final var _resultValue = new GetScheduleListDataScheduleTypeRecurring();
            _resultValue.dailyLists = dailyLists;
            _resultValue.weekly = weekly;
            return _resultValue;
        }
    }
}
