// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs Empty = new HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs();

    /**
     * The GreaterEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    @Import(name="greaterEqual")
    private @Nullable Output<Integer> greaterEqual;

    /**
     * @return The GreaterEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Output<Integer>> greaterEqual() {
        return Optional.ofNullable(this.greaterEqual);
    }

    /**
     * The GreaterThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    @Import(name="greaterThan")
    private @Nullable Output<Integer> greaterThan;

    /**
     * @return The GreaterThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Output<Integer>> greaterThan() {
        return Optional.ofNullable(this.greaterThan);
    }

    /**
     * The Is param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    @Import(name="is")
    private @Nullable Output<Integer> is;

    /**
     * @return The Is param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Output<Integer>> is() {
        return Optional.ofNullable(this.is);
    }

    /**
     * The IsNot param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    @Import(name="isNot")
    private @Nullable Output<Integer> isNot;

    /**
     * @return The IsNot param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Output<Integer>> isNot() {
        return Optional.ofNullable(this.isNot);
    }

    /**
     * The LessEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    @Import(name="lessEqual")
    private @Nullable Output<Integer> lessEqual;

    /**
     * @return The LessEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Output<Integer>> lessEqual() {
        return Optional.ofNullable(this.lessEqual);
    }

    /**
     * The LessThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    @Import(name="lessThan")
    private @Nullable Output<Integer> lessThan;

    /**
     * @return The LessThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Output<Integer>> lessThan() {
        return Optional.ofNullable(this.lessThan);
    }

    private HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs() {}

    private HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs(HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs $) {
        this.greaterEqual = $.greaterEqual;
        this.greaterThan = $.greaterThan;
        this.is = $.is;
        this.isNot = $.isNot;
        this.lessEqual = $.lessEqual;
        this.lessThan = $.lessThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs $;

        public Builder() {
            $ = new HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs();
        }

        public Builder(HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs defaults) {
            $ = new HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param greaterEqual The GreaterEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder greaterEqual(@Nullable Output<Integer> greaterEqual) {
            $.greaterEqual = greaterEqual;
            return this;
        }

        /**
         * @param greaterEqual The GreaterEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder greaterEqual(Integer greaterEqual) {
            return greaterEqual(Output.of(greaterEqual));
        }

        /**
         * @param greaterThan The GreaterThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder greaterThan(@Nullable Output<Integer> greaterThan) {
            $.greaterThan = greaterThan;
            return this;
        }

        /**
         * @param greaterThan The GreaterThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder greaterThan(Integer greaterThan) {
            return greaterThan(Output.of(greaterThan));
        }

        /**
         * @param is The Is param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder is(@Nullable Output<Integer> is) {
            $.is = is;
            return this;
        }

        /**
         * @param is The Is param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder is(Integer is) {
            return is(Output.of(is));
        }

        /**
         * @param isNot The IsNot param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder isNot(@Nullable Output<Integer> isNot) {
            $.isNot = isNot;
            return this;
        }

        /**
         * @param isNot The IsNot param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder isNot(Integer isNot) {
            return isNot(Output.of(isNot));
        }

        /**
         * @param lessEqual The LessEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder lessEqual(@Nullable Output<Integer> lessEqual) {
            $.lessEqual = lessEqual;
            return this;
        }

        /**
         * @param lessEqual The LessEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder lessEqual(Integer lessEqual) {
            return lessEqual(Output.of(lessEqual));
        }

        /**
         * @param lessThan The LessThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder lessThan(@Nullable Output<Integer> lessThan) {
            $.lessThan = lessThan;
            return this;
        }

        /**
         * @param lessThan The LessThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
         * 
         * @return builder
         * 
         */
        public Builder lessThan(Integer lessThan) {
            return lessThan(Output.of(lessThan));
        }

        public HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs build() {
            return $;
        }
    }

}
