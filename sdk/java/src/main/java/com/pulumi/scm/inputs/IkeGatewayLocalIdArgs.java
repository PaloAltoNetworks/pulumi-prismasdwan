// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IkeGatewayLocalIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final IkeGatewayLocalIdArgs Empty = new IkeGatewayLocalIdArgs();

    /**
     * Local ID string. String length must be between 1 and 1024 characters. String validation regex: `^(.+\{@literal @}[a-zA-Z0-9.-]+)$|^([$a-zA-Z0-9_:.-]+)$|^(([[:xdigit:]][[:xdigit:]])+)$|^([a-zA-Z0-9.]+=(\\,|[^,])+[, ]+)*([a-zA-Z0-9.]+=(\\,|[^,])+)$`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Local ID string. String length must be between 1 and 1024 characters. String validation regex: `^(.+\{@literal @}[a-zA-Z0-9.-]+)$|^([$a-zA-Z0-9_:.-]+)$|^(([[:xdigit:]][[:xdigit:]])+)$|^([a-zA-Z0-9.]+=(\\,|[^,])+[, ]+)*([a-zA-Z0-9.]+=(\\,|[^,])+)$`.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Type param.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The Type param.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private IkeGatewayLocalIdArgs() {}

    private IkeGatewayLocalIdArgs(IkeGatewayLocalIdArgs $) {
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IkeGatewayLocalIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IkeGatewayLocalIdArgs $;

        public Builder() {
            $ = new IkeGatewayLocalIdArgs();
        }

        public Builder(IkeGatewayLocalIdArgs defaults) {
            $ = new IkeGatewayLocalIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Local ID string. String length must be between 1 and 1024 characters. String validation regex: `^(.+\{@literal @}[a-zA-Z0-9.-]+)$|^([$a-zA-Z0-9_:.-]+)$|^(([[:xdigit:]][[:xdigit:]])+)$|^([a-zA-Z0-9.]+=(\\,|[^,])+[, ]+)*([a-zA-Z0-9.]+=(\\,|[^,])+)$`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Local ID string. String length must be between 1 and 1024 characters. String validation regex: `^(.+\{@literal @}[a-zA-Z0-9.-]+)$|^([$a-zA-Z0-9_:.-]+)$|^(([[:xdigit:]][[:xdigit:]])+)$|^([a-zA-Z0-9.]+=(\\,|[^,])+[, ]+)*([a-zA-Z0-9.]+=(\\,|[^,])+)$`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param type The Type param.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Type param.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IkeGatewayLocalIdArgs build() {
            return $;
        }
    }

}
