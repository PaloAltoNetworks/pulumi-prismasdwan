// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalDynamicListTypeUrlRecurringMonthlyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalDynamicListTypeUrlRecurringMonthlyArgs Empty = new ExternalDynamicListTypeUrlRecurringMonthlyArgs();

    /**
     * Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    @Import(name="at")
    private @Nullable Output<String> at;

    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    public Optional<Output<String>> at() {
        return Optional.ofNullable(this.at);
    }

    /**
     * The DayOfMonth param. Value must be between 1 and 31.
     * 
     */
    @Import(name="dayOfMonth", required=true)
    private Output<Integer> dayOfMonth;

    /**
     * @return The DayOfMonth param. Value must be between 1 and 31.
     * 
     */
    public Output<Integer> dayOfMonth() {
        return this.dayOfMonth;
    }

    private ExternalDynamicListTypeUrlRecurringMonthlyArgs() {}

    private ExternalDynamicListTypeUrlRecurringMonthlyArgs(ExternalDynamicListTypeUrlRecurringMonthlyArgs $) {
        this.at = $.at;
        this.dayOfMonth = $.dayOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalDynamicListTypeUrlRecurringMonthlyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalDynamicListTypeUrlRecurringMonthlyArgs $;

        public Builder() {
            $ = new ExternalDynamicListTypeUrlRecurringMonthlyArgs();
        }

        public Builder(ExternalDynamicListTypeUrlRecurringMonthlyArgs defaults) {
            $ = new ExternalDynamicListTypeUrlRecurringMonthlyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param at Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder at(@Nullable Output<String> at) {
            $.at = at;
            return this;
        }

        /**
         * @param at Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder at(String at) {
            return at(Output.of(at));
        }

        /**
         * @param dayOfMonth The DayOfMonth param. Value must be between 1 and 31.
         * 
         * @return builder
         * 
         */
        public Builder dayOfMonth(Output<Integer> dayOfMonth) {
            $.dayOfMonth = dayOfMonth;
            return this;
        }

        /**
         * @param dayOfMonth The DayOfMonth param. Value must be between 1 and 31.
         * 
         * @return builder
         * 
         */
        public Builder dayOfMonth(Integer dayOfMonth) {
            return dayOfMonth(Output.of(dayOfMonth));
        }

        public ExternalDynamicListTypeUrlRecurringMonthlyArgs build() {
            if ($.dayOfMonth == null) {
                throw new MissingRequiredPropertyException("ExternalDynamicListTypeUrlRecurringMonthlyArgs", "dayOfMonth");
            }
            return $;
        }
    }

}
