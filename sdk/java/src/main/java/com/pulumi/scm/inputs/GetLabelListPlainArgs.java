// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLabelListPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLabelListPlainArgs Empty = new GetLabelListPlainArgs();

    /**
     * The Limit param. A limit of -1 will return all configured items. Default: `200`.
     * 
     */
    @Import(name="limit")
    private @Nullable Integer limit;

    /**
     * @return The Limit param. A limit of -1 will return all configured items. Default: `200`.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * The Name param.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Offset param. Default: `0`.
     * 
     */
    @Import(name="offset")
    private @Nullable Integer offset;

    /**
     * @return The Offset param. Default: `0`.
     * 
     */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }

    private GetLabelListPlainArgs() {}

    private GetLabelListPlainArgs(GetLabelListPlainArgs $) {
        this.limit = $.limit;
        this.name = $.name;
        this.offset = $.offset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLabelListPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLabelListPlainArgs $;

        public Builder() {
            $ = new GetLabelListPlainArgs();
        }

        public Builder(GetLabelListPlainArgs defaults) {
            $ = new GetLabelListPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit The Limit param. A limit of -1 will return all configured items. Default: `200`.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Integer limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param offset The Offset param. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Integer offset) {
            $.offset = offset;
            return this;
        }

        public GetLabelListPlainArgs build() {
            return $;
        }
    }

}
