// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleScheduleTypeRecurringWeeklyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleScheduleTypeRecurringWeeklyArgs Empty = new ScheduleScheduleTypeRecurringWeeklyArgs();

    /**
     * The FridayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    @Import(name="fridayLists")
    private @Nullable Output<List<String>> fridayLists;

    /**
     * @return The FridayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public Optional<Output<List<String>>> fridayLists() {
        return Optional.ofNullable(this.fridayLists);
    }

    /**
     * The MondayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    @Import(name="mondayLists")
    private @Nullable Output<List<String>> mondayLists;

    /**
     * @return The MondayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public Optional<Output<List<String>>> mondayLists() {
        return Optional.ofNullable(this.mondayLists);
    }

    /**
     * The SaturdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    @Import(name="saturdayLists")
    private @Nullable Output<List<String>> saturdayLists;

    /**
     * @return The SaturdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public Optional<Output<List<String>>> saturdayLists() {
        return Optional.ofNullable(this.saturdayLists);
    }

    /**
     * The SundayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    @Import(name="sundayLists")
    private @Nullable Output<List<String>> sundayLists;

    /**
     * @return The SundayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public Optional<Output<List<String>>> sundayLists() {
        return Optional.ofNullable(this.sundayLists);
    }

    /**
     * The ThursdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    @Import(name="thursdayLists")
    private @Nullable Output<List<String>> thursdayLists;

    /**
     * @return The ThursdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public Optional<Output<List<String>>> thursdayLists() {
        return Optional.ofNullable(this.thursdayLists);
    }

    /**
     * The TuesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    @Import(name="tuesdayLists")
    private @Nullable Output<List<String>> tuesdayLists;

    /**
     * @return The TuesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public Optional<Output<List<String>>> tuesdayLists() {
        return Optional.ofNullable(this.tuesdayLists);
    }

    /**
     * The WednesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    @Import(name="wednesdayLists")
    private @Nullable Output<List<String>> wednesdayLists;

    /**
     * @return The WednesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
     * 
     */
    public Optional<Output<List<String>>> wednesdayLists() {
        return Optional.ofNullable(this.wednesdayLists);
    }

    private ScheduleScheduleTypeRecurringWeeklyArgs() {}

    private ScheduleScheduleTypeRecurringWeeklyArgs(ScheduleScheduleTypeRecurringWeeklyArgs $) {
        this.fridayLists = $.fridayLists;
        this.mondayLists = $.mondayLists;
        this.saturdayLists = $.saturdayLists;
        this.sundayLists = $.sundayLists;
        this.thursdayLists = $.thursdayLists;
        this.tuesdayLists = $.tuesdayLists;
        this.wednesdayLists = $.wednesdayLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleScheduleTypeRecurringWeeklyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleScheduleTypeRecurringWeeklyArgs $;

        public Builder() {
            $ = new ScheduleScheduleTypeRecurringWeeklyArgs();
        }

        public Builder(ScheduleScheduleTypeRecurringWeeklyArgs defaults) {
            $ = new ScheduleScheduleTypeRecurringWeeklyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fridayLists The FridayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder fridayLists(@Nullable Output<List<String>> fridayLists) {
            $.fridayLists = fridayLists;
            return this;
        }

        /**
         * @param fridayLists The FridayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder fridayLists(List<String> fridayLists) {
            return fridayLists(Output.of(fridayLists));
        }

        /**
         * @param fridayLists The FridayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder fridayLists(String... fridayLists) {
            return fridayLists(List.of(fridayLists));
        }

        /**
         * @param mondayLists The MondayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder mondayLists(@Nullable Output<List<String>> mondayLists) {
            $.mondayLists = mondayLists;
            return this;
        }

        /**
         * @param mondayLists The MondayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder mondayLists(List<String> mondayLists) {
            return mondayLists(Output.of(mondayLists));
        }

        /**
         * @param mondayLists The MondayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder mondayLists(String... mondayLists) {
            return mondayLists(List.of(mondayLists));
        }

        /**
         * @param saturdayLists The SaturdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder saturdayLists(@Nullable Output<List<String>> saturdayLists) {
            $.saturdayLists = saturdayLists;
            return this;
        }

        /**
         * @param saturdayLists The SaturdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder saturdayLists(List<String> saturdayLists) {
            return saturdayLists(Output.of(saturdayLists));
        }

        /**
         * @param saturdayLists The SaturdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder saturdayLists(String... saturdayLists) {
            return saturdayLists(List.of(saturdayLists));
        }

        /**
         * @param sundayLists The SundayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder sundayLists(@Nullable Output<List<String>> sundayLists) {
            $.sundayLists = sundayLists;
            return this;
        }

        /**
         * @param sundayLists The SundayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder sundayLists(List<String> sundayLists) {
            return sundayLists(Output.of(sundayLists));
        }

        /**
         * @param sundayLists The SundayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder sundayLists(String... sundayLists) {
            return sundayLists(List.of(sundayLists));
        }

        /**
         * @param thursdayLists The ThursdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder thursdayLists(@Nullable Output<List<String>> thursdayLists) {
            $.thursdayLists = thursdayLists;
            return this;
        }

        /**
         * @param thursdayLists The ThursdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder thursdayLists(List<String> thursdayLists) {
            return thursdayLists(Output.of(thursdayLists));
        }

        /**
         * @param thursdayLists The ThursdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder thursdayLists(String... thursdayLists) {
            return thursdayLists(List.of(thursdayLists));
        }

        /**
         * @param tuesdayLists The TuesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder tuesdayLists(@Nullable Output<List<String>> tuesdayLists) {
            $.tuesdayLists = tuesdayLists;
            return this;
        }

        /**
         * @param tuesdayLists The TuesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder tuesdayLists(List<String> tuesdayLists) {
            return tuesdayLists(Output.of(tuesdayLists));
        }

        /**
         * @param tuesdayLists The TuesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder tuesdayLists(String... tuesdayLists) {
            return tuesdayLists(List.of(tuesdayLists));
        }

        /**
         * @param wednesdayLists The WednesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder wednesdayLists(@Nullable Output<List<String>> wednesdayLists) {
            $.wednesdayLists = wednesdayLists;
            return this;
        }

        /**
         * @param wednesdayLists The WednesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder wednesdayLists(List<String> wednesdayLists) {
            return wednesdayLists(Output.of(wednesdayLists));
        }

        /**
         * @param wednesdayLists The WednesdayList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`.
         * 
         * @return builder
         * 
         */
        public Builder wednesdayLists(String... wednesdayLists) {
            return wednesdayLists(List.of(wednesdayLists));
        }

        public ScheduleScheduleTypeRecurringWeeklyArgs build() {
            return $;
        }
    }

}
