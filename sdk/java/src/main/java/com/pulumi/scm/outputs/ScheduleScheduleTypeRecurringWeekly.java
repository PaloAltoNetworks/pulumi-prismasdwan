// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleScheduleTypeRecurringWeekly {
    /**
     * @return The FridayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private @Nullable List<String> fridayLists;
    /**
     * @return The MondayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private @Nullable List<String> mondayLists;
    /**
     * @return The SaturdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private @Nullable List<String> saturdayLists;
    /**
     * @return The SundayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private @Nullable List<String> sundayLists;
    /**
     * @return The ThursdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private @Nullable List<String> thursdayLists;
    /**
     * @return The TuesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private @Nullable List<String> tuesdayLists;
    /**
     * @return The WednesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    private @Nullable List<String> wednesdayLists;

    private ScheduleScheduleTypeRecurringWeekly() {}
    /**
     * @return The FridayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> fridayLists() {
        return this.fridayLists == null ? List.of() : this.fridayLists;
    }
    /**
     * @return The MondayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> mondayLists() {
        return this.mondayLists == null ? List.of() : this.mondayLists;
    }
    /**
     * @return The SaturdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> saturdayLists() {
        return this.saturdayLists == null ? List.of() : this.saturdayLists;
    }
    /**
     * @return The SundayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> sundayLists() {
        return this.sundayLists == null ? List.of() : this.sundayLists;
    }
    /**
     * @return The ThursdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> thursdayLists() {
        return this.thursdayLists == null ? List.of() : this.thursdayLists;
    }
    /**
     * @return The TuesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> tuesdayLists() {
        return this.tuesdayLists == null ? List.of() : this.tuesdayLists;
    }
    /**
     * @return The WednesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public List<String> wednesdayLists() {
        return this.wednesdayLists == null ? List.of() : this.wednesdayLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleScheduleTypeRecurringWeekly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> fridayLists;
        private @Nullable List<String> mondayLists;
        private @Nullable List<String> saturdayLists;
        private @Nullable List<String> sundayLists;
        private @Nullable List<String> thursdayLists;
        private @Nullable List<String> tuesdayLists;
        private @Nullable List<String> wednesdayLists;
        public Builder() {}
        public Builder(ScheduleScheduleTypeRecurringWeekly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fridayLists = defaults.fridayLists;
    	      this.mondayLists = defaults.mondayLists;
    	      this.saturdayLists = defaults.saturdayLists;
    	      this.sundayLists = defaults.sundayLists;
    	      this.thursdayLists = defaults.thursdayLists;
    	      this.tuesdayLists = defaults.tuesdayLists;
    	      this.wednesdayLists = defaults.wednesdayLists;
        }

        @CustomType.Setter
        public Builder fridayLists(@Nullable List<String> fridayLists) {

            this.fridayLists = fridayLists;
            return this;
        }
        public Builder fridayLists(String... fridayLists) {
            return fridayLists(List.of(fridayLists));
        }
        @CustomType.Setter
        public Builder mondayLists(@Nullable List<String> mondayLists) {

            this.mondayLists = mondayLists;
            return this;
        }
        public Builder mondayLists(String... mondayLists) {
            return mondayLists(List.of(mondayLists));
        }
        @CustomType.Setter
        public Builder saturdayLists(@Nullable List<String> saturdayLists) {

            this.saturdayLists = saturdayLists;
            return this;
        }
        public Builder saturdayLists(String... saturdayLists) {
            return saturdayLists(List.of(saturdayLists));
        }
        @CustomType.Setter
        public Builder sundayLists(@Nullable List<String> sundayLists) {

            this.sundayLists = sundayLists;
            return this;
        }
        public Builder sundayLists(String... sundayLists) {
            return sundayLists(List.of(sundayLists));
        }
        @CustomType.Setter
        public Builder thursdayLists(@Nullable List<String> thursdayLists) {

            this.thursdayLists = thursdayLists;
            return this;
        }
        public Builder thursdayLists(String... thursdayLists) {
            return thursdayLists(List.of(thursdayLists));
        }
        @CustomType.Setter
        public Builder tuesdayLists(@Nullable List<String> tuesdayLists) {

            this.tuesdayLists = tuesdayLists;
            return this;
        }
        public Builder tuesdayLists(String... tuesdayLists) {
            return tuesdayLists(List.of(tuesdayLists));
        }
        @CustomType.Setter
        public Builder wednesdayLists(@Nullable List<String> wednesdayLists) {

            this.wednesdayLists = wednesdayLists;
            return this;
        }
        public Builder wednesdayLists(String... wednesdayLists) {
            return wednesdayLists(List.of(wednesdayLists));
        }
        public ScheduleScheduleTypeRecurringWeekly build() {
            final var _resultValue = new ScheduleScheduleTypeRecurringWeekly();
            _resultValue.fridayLists = fridayLists;
            _resultValue.mondayLists = mondayLists;
            _resultValue.saturdayLists = saturdayLists;
            _resultValue.sundayLists = sundayLists;
            _resultValue.thursdayLists = thursdayLists;
            _resultValue.tuesdayLists = tuesdayLists;
            _resultValue.wednesdayLists = wednesdayLists;
            return _resultValue;
        }
    }
}
