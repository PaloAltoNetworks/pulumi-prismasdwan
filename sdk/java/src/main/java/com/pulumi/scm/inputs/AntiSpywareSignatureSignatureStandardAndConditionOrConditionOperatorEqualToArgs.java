// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs extends com.pulumi.resources.ResourceArgs {

    public static final AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs Empty = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs();

    /**
     * The Context param.
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    /**
     * @return The Context param.
     * 
     */
    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The Negate param. Default: `false`.
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    /**
     * @return The Negate param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    /**
     * The Qualifiers param.
     * 
     */
    @Import(name="qualifiers")
    private @Nullable Output<List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs>> qualifiers;

    /**
     * @return The Qualifiers param.
     * 
     */
    public Optional<Output<List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs>>> qualifiers() {
        return Optional.ofNullable(this.qualifiers);
    }

    /**
     * The Value param. Value must be between 0 and 4294967295.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Integer> value;

    /**
     * @return The Value param. Value must be between 0 and 4294967295.
     * 
     */
    public Optional<Output<Integer>> value() {
        return Optional.ofNullable(this.value);
    }

    private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs() {}

    private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs $) {
        this.context = $.context;
        this.negate = $.negate;
        this.qualifiers = $.qualifiers;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs $;

        public Builder() {
            $ = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs();
        }

        public Builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs defaults) {
            $ = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context The Context param.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context The Context param.
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param negate The Negate param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        /**
         * @param negate The Negate param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        /**
         * @param qualifiers The Qualifiers param.
         * 
         * @return builder
         * 
         */
        public Builder qualifiers(@Nullable Output<List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs>> qualifiers) {
            $.qualifiers = qualifiers;
            return this;
        }

        /**
         * @param qualifiers The Qualifiers param.
         * 
         * @return builder
         * 
         */
        public Builder qualifiers(List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs> qualifiers) {
            return qualifiers(Output.of(qualifiers));
        }

        /**
         * @param qualifiers The Qualifiers param.
         * 
         * @return builder
         * 
         */
        public Builder qualifiers(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs... qualifiers) {
            return qualifiers(List.of(qualifiers));
        }

        /**
         * @param value The Value param. Value must be between 0 and 4294967295.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The Value param. Value must be between 0 and 4294967295.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToArgs build() {
            return $;
        }
    }

}
