// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectPatchManagementCriteriaMissingPatchesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectPatchManagementCriteriaMissingPatchesArgs Empty = new HipObjectPatchManagementCriteriaMissingPatchesArgs();

    /**
     * The Check param. String must be one of these: `&#34;has-any&#34;`, `&#34;has-none&#34;`, `&#34;has-all&#34;`. Default: `&#34;has-any&#34;`.
     * 
     */
    @Import(name="check")
    private @Nullable Output<String> check;

    /**
     * @return The Check param. String must be one of these: `&#34;has-any&#34;`, `&#34;has-none&#34;`, `&#34;has-all&#34;`. Default: `&#34;has-any&#34;`.
     * 
     */
    public Optional<Output<String>> check() {
        return Optional.ofNullable(this.check);
    }

    /**
     * The Patches param. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    @Import(name="patches")
    private @Nullable Output<List<String>> patches;

    /**
     * @return The Patches param. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    public Optional<Output<List<String>>> patches() {
        return Optional.ofNullable(this.patches);
    }

    /**
     * The Severity param.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs> severity;

    /**
     * @return The Severity param.
     * 
     */
    public Optional<Output<HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs>> severity() {
        return Optional.ofNullable(this.severity);
    }

    private HipObjectPatchManagementCriteriaMissingPatchesArgs() {}

    private HipObjectPatchManagementCriteriaMissingPatchesArgs(HipObjectPatchManagementCriteriaMissingPatchesArgs $) {
        this.check = $.check;
        this.patches = $.patches;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectPatchManagementCriteriaMissingPatchesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectPatchManagementCriteriaMissingPatchesArgs $;

        public Builder() {
            $ = new HipObjectPatchManagementCriteriaMissingPatchesArgs();
        }

        public Builder(HipObjectPatchManagementCriteriaMissingPatchesArgs defaults) {
            $ = new HipObjectPatchManagementCriteriaMissingPatchesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param check The Check param. String must be one of these: `&#34;has-any&#34;`, `&#34;has-none&#34;`, `&#34;has-all&#34;`. Default: `&#34;has-any&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder check(@Nullable Output<String> check) {
            $.check = check;
            return this;
        }

        /**
         * @param check The Check param. String must be one of these: `&#34;has-any&#34;`, `&#34;has-none&#34;`, `&#34;has-all&#34;`. Default: `&#34;has-any&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder check(String check) {
            return check(Output.of(check));
        }

        /**
         * @param patches The Patches param. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder patches(@Nullable Output<List<String>> patches) {
            $.patches = patches;
            return this;
        }

        /**
         * @param patches The Patches param. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder patches(List<String> patches) {
            return patches(Output.of(patches));
        }

        /**
         * @param patches The Patches param. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder patches(String... patches) {
            return patches(List.of(patches));
        }

        /**
         * @param severity The Severity param.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The Severity param.
         * 
         * @return builder
         * 
         */
        public Builder severity(HipObjectPatchManagementCriteriaMissingPatchesSeverityArgs severity) {
            return severity(Output.of(severity));
        }

        public HipObjectPatchManagementCriteriaMissingPatchesArgs build() {
            return $;
        }
    }

}
