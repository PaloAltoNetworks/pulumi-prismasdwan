// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileBlockingProfileRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileBlockingProfileRuleArgs Empty = new FileBlockingProfileRuleArgs();

    /**
     * The Action param. String must be one of these: `&#34;alert&#34;`, `&#34;block&#34;`, `&#34;continue&#34;`. Default: `&#34;alert&#34;`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The Action param. String must be one of these: `&#34;alert&#34;`, `&#34;block&#34;`, `&#34;continue&#34;`. Default: `&#34;alert&#34;`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The Applications param. List must contain at least 1 elements.
     * 
     */
    @Import(name="applications", required=true)
    private Output<List<String>> applications;

    /**
     * @return The Applications param. List must contain at least 1 elements.
     * 
     */
    public Output<List<String>> applications() {
        return this.applications;
    }

    /**
     * The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`. Default: `&#34;both&#34;`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`. Default: `&#34;both&#34;`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * The FileTypes param. List must contain at least 1 elements.
     * 
     */
    @Import(name="fileTypes", required=true)
    private Output<List<String>> fileTypes;

    /**
     * @return The FileTypes param. List must contain at least 1 elements.
     * 
     */
    public Output<List<String>> fileTypes() {
        return this.fileTypes;
    }

    /**
     * The Name param.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private FileBlockingProfileRuleArgs() {}

    private FileBlockingProfileRuleArgs(FileBlockingProfileRuleArgs $) {
        this.action = $.action;
        this.applications = $.applications;
        this.direction = $.direction;
        this.fileTypes = $.fileTypes;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileBlockingProfileRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileBlockingProfileRuleArgs $;

        public Builder() {
            $ = new FileBlockingProfileRuleArgs();
        }

        public Builder(FileBlockingProfileRuleArgs defaults) {
            $ = new FileBlockingProfileRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The Action param. String must be one of these: `&#34;alert&#34;`, `&#34;block&#34;`, `&#34;continue&#34;`. Default: `&#34;alert&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The Action param. String must be one of these: `&#34;alert&#34;`, `&#34;block&#34;`, `&#34;continue&#34;`. Default: `&#34;alert&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param applications The Applications param. List must contain at least 1 elements.
         * 
         * @return builder
         * 
         */
        public Builder applications(Output<List<String>> applications) {
            $.applications = applications;
            return this;
        }

        /**
         * @param applications The Applications param. List must contain at least 1 elements.
         * 
         * @return builder
         * 
         */
        public Builder applications(List<String> applications) {
            return applications(Output.of(applications));
        }

        /**
         * @param applications The Applications param. List must contain at least 1 elements.
         * 
         * @return builder
         * 
         */
        public Builder applications(String... applications) {
            return applications(List.of(applications));
        }

        /**
         * @param direction The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`. Default: `&#34;both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`. Default: `&#34;both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param fileTypes The FileTypes param. List must contain at least 1 elements.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(Output<List<String>> fileTypes) {
            $.fileTypes = fileTypes;
            return this;
        }

        /**
         * @param fileTypes The FileTypes param. List must contain at least 1 elements.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(List<String> fileTypes) {
            return fileTypes(Output.of(fileTypes));
        }

        /**
         * @param fileTypes The FileTypes param. List must contain at least 1 elements.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(String... fileTypes) {
            return fileTypes(List.of(fileTypes));
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FileBlockingProfileRuleArgs build() {
            if ($.applications == null) {
                throw new MissingRequiredPropertyException("FileBlockingProfileRuleArgs", "applications");
            }
            if ($.fileTypes == null) {
                throw new MissingRequiredPropertyException("FileBlockingProfileRuleArgs", "fileTypes");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("FileBlockingProfileRuleArgs", "name");
            }
            return $;
        }
    }

}
