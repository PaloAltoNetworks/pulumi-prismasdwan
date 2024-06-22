// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetJobsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobsPlainArgs Empty = new GetJobsPlainArgs();

    /**
     * The Id param.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The Id param.
     * 
     */
    public Integer id() {
        return this.id;
    }

    private GetJobsPlainArgs() {}

    private GetJobsPlainArgs(GetJobsPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobsPlainArgs $;

        public Builder() {
            $ = new GetJobsPlainArgs();
        }

        public Builder(GetJobsPlainArgs defaults) {
            $ = new GetJobsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        public GetJobsPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetJobsPlainArgs", "id");
            }
            return $;
        }
    }

}
