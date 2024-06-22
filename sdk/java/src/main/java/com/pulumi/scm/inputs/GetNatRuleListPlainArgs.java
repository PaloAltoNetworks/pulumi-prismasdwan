// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNatRuleListPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNatRuleListPlainArgs Empty = new GetNatRuleListPlainArgs();

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable String device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable String folder;

    /**
     * @return The Folder param.
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }

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

    /**
     * The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    @Import(name="position")
    private @Nullable String position;

    /**
     * @return The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    public Optional<String> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable String snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<String> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    private GetNatRuleListPlainArgs() {}

    private GetNatRuleListPlainArgs(GetNatRuleListPlainArgs $) {
        this.device = $.device;
        this.folder = $.folder;
        this.limit = $.limit;
        this.name = $.name;
        this.offset = $.offset;
        this.position = $.position;
        this.snippet = $.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNatRuleListPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNatRuleListPlainArgs $;

        public Builder() {
            $ = new GetNatRuleListPlainArgs();
        }

        public Builder(GetNatRuleListPlainArgs defaults) {
            $ = new GetNatRuleListPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable String folder) {
            $.folder = folder;
            return this;
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

        /**
         * @param position The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable String position) {
            $.position = position;
            return this;
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable String snippet) {
            $.snippet = snippet;
            return this;
        }

        public GetNatRuleListPlainArgs build() {
            return $;
        }
    }

}
