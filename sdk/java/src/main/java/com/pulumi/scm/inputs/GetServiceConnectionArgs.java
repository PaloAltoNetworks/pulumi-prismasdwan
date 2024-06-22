// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceConnectionArgs Empty = new GetServiceConnectionArgs();

    /**
     * The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The Id param.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The Id param.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetServiceConnectionArgs() {}

    private GetServiceConnectionArgs(GetServiceConnectionArgs $) {
        this.folder = $.folder;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceConnectionArgs $;

        public Builder() {
            $ = new GetServiceConnectionArgs();
        }

        public Builder(GetServiceConnectionArgs defaults) {
            $ = new GetServiceConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param folder The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetServiceConnectionArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetServiceConnectionArgs", "id");
            }
            return $;
        }
    }

}
