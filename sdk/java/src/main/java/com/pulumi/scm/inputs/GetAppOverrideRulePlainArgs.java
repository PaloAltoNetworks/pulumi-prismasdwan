// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAppOverrideRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppOverrideRulePlainArgs Empty = new GetAppOverrideRulePlainArgs();

    /**
     * The Id param.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetAppOverrideRulePlainArgs() {}

    private GetAppOverrideRulePlainArgs(GetAppOverrideRulePlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppOverrideRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppOverrideRulePlainArgs $;

        public Builder() {
            $ = new GetAppOverrideRulePlainArgs();
        }

        public Builder(GetAppOverrideRulePlainArgs defaults) {
            $ = new GetAppOverrideRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAppOverrideRulePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetAppOverrideRulePlainArgs", "id");
            }
            return $;
        }
    }

}
