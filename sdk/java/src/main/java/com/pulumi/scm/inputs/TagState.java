// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagState extends com.pulumi.resources.ResourceArgs {

    public static final TagState Empty = new TagState();

    /**
     * The Color param. String must be one of these: `&#34;Red&#34;`, `&#34;Green&#34;`, `&#34;Blue&#34;`, `&#34;Yellow&#34;`, `&#34;Copper&#34;`, `&#34;Orange&#34;`, `&#34;Purple&#34;`, `&#34;Gray&#34;`, `&#34;Light Green&#34;`, `&#34;Cyan&#34;`, `&#34;Light Gray&#34;`, `&#34;Blue Gray&#34;`, `&#34;Lime&#34;`, `&#34;Black&#34;`, `&#34;Gold&#34;`, `&#34;Brown&#34;`, `&#34;Olive&#34;`, `&#34;Maroon&#34;`, `&#34;Red-Orange&#34;`, `&#34;Yellow-Orange&#34;`, `&#34;Forest Green&#34;`, `&#34;Turquoise Blue&#34;`, `&#34;Azure Blue&#34;`, `&#34;Cerulean Blue&#34;`, `&#34;Midnight Blue&#34;`, `&#34;Medium Blue&#34;`, `&#34;Cobalt Blue&#34;`, `&#34;Violet Blue&#34;`, `&#34;Blue Violet&#34;`, `&#34;Medium Violet&#34;`, `&#34;Medium Rose&#34;`, `&#34;Lavender&#34;`, `&#34;Orchid&#34;`, `&#34;Thistle&#34;`, `&#34;Peach&#34;`, `&#34;Salmon&#34;`, `&#34;Magenta&#34;`, `&#34;Red Violet&#34;`, `&#34;Mahogany&#34;`, `&#34;Burnt Sienna&#34;`, `&#34;Chestnut&#34;`.
     * 
     */
    @Import(name="color")
    private @Nullable Output<String> color;

    /**
     * @return The Color param. String must be one of these: `&#34;Red&#34;`, `&#34;Green&#34;`, `&#34;Blue&#34;`, `&#34;Yellow&#34;`, `&#34;Copper&#34;`, `&#34;Orange&#34;`, `&#34;Purple&#34;`, `&#34;Gray&#34;`, `&#34;Light Green&#34;`, `&#34;Cyan&#34;`, `&#34;Light Gray&#34;`, `&#34;Blue Gray&#34;`, `&#34;Lime&#34;`, `&#34;Black&#34;`, `&#34;Gold&#34;`, `&#34;Brown&#34;`, `&#34;Olive&#34;`, `&#34;Maroon&#34;`, `&#34;Red-Orange&#34;`, `&#34;Yellow-Orange&#34;`, `&#34;Forest Green&#34;`, `&#34;Turquoise Blue&#34;`, `&#34;Azure Blue&#34;`, `&#34;Cerulean Blue&#34;`, `&#34;Midnight Blue&#34;`, `&#34;Medium Blue&#34;`, `&#34;Cobalt Blue&#34;`, `&#34;Violet Blue&#34;`, `&#34;Blue Violet&#34;`, `&#34;Medium Violet&#34;`, `&#34;Medium Rose&#34;`, `&#34;Lavender&#34;`, `&#34;Orchid&#34;`, `&#34;Thistle&#34;`, `&#34;Peach&#34;`, `&#34;Salmon&#34;`, `&#34;Magenta&#34;`, `&#34;Red Violet&#34;`, `&#34;Mahogany&#34;`, `&#34;Burnt Sienna&#34;`, `&#34;Chestnut&#34;`.
     * 
     */
    public Optional<Output<String>> color() {
        return Optional.ofNullable(this.color);
    }

    /**
     * The Comments param. String length must not exceed 1023 characters.
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return The Comments param. String length must not exceed 1023 characters.
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The Name param. String length must not exceed 127 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name param. String length must not exceed 127 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable Output<String> snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<Output<String>> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    @Import(name="tfid")
    private @Nullable Output<String> tfid;

    public Optional<Output<String>> tfid() {
        return Optional.ofNullable(this.tfid);
    }

    private TagState() {}

    private TagState(TagState $) {
        this.color = $.color;
        this.comments = $.comments;
        this.device = $.device;
        this.folder = $.folder;
        this.name = $.name;
        this.snippet = $.snippet;
        this.tfid = $.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagState $;

        public Builder() {
            $ = new TagState();
        }

        public Builder(TagState defaults) {
            $ = new TagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param color The Color param. String must be one of these: `&#34;Red&#34;`, `&#34;Green&#34;`, `&#34;Blue&#34;`, `&#34;Yellow&#34;`, `&#34;Copper&#34;`, `&#34;Orange&#34;`, `&#34;Purple&#34;`, `&#34;Gray&#34;`, `&#34;Light Green&#34;`, `&#34;Cyan&#34;`, `&#34;Light Gray&#34;`, `&#34;Blue Gray&#34;`, `&#34;Lime&#34;`, `&#34;Black&#34;`, `&#34;Gold&#34;`, `&#34;Brown&#34;`, `&#34;Olive&#34;`, `&#34;Maroon&#34;`, `&#34;Red-Orange&#34;`, `&#34;Yellow-Orange&#34;`, `&#34;Forest Green&#34;`, `&#34;Turquoise Blue&#34;`, `&#34;Azure Blue&#34;`, `&#34;Cerulean Blue&#34;`, `&#34;Midnight Blue&#34;`, `&#34;Medium Blue&#34;`, `&#34;Cobalt Blue&#34;`, `&#34;Violet Blue&#34;`, `&#34;Blue Violet&#34;`, `&#34;Medium Violet&#34;`, `&#34;Medium Rose&#34;`, `&#34;Lavender&#34;`, `&#34;Orchid&#34;`, `&#34;Thistle&#34;`, `&#34;Peach&#34;`, `&#34;Salmon&#34;`, `&#34;Magenta&#34;`, `&#34;Red Violet&#34;`, `&#34;Mahogany&#34;`, `&#34;Burnt Sienna&#34;`, `&#34;Chestnut&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder color(@Nullable Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color The Color param. String must be one of these: `&#34;Red&#34;`, `&#34;Green&#34;`, `&#34;Blue&#34;`, `&#34;Yellow&#34;`, `&#34;Copper&#34;`, `&#34;Orange&#34;`, `&#34;Purple&#34;`, `&#34;Gray&#34;`, `&#34;Light Green&#34;`, `&#34;Cyan&#34;`, `&#34;Light Gray&#34;`, `&#34;Blue Gray&#34;`, `&#34;Lime&#34;`, `&#34;Black&#34;`, `&#34;Gold&#34;`, `&#34;Brown&#34;`, `&#34;Olive&#34;`, `&#34;Maroon&#34;`, `&#34;Red-Orange&#34;`, `&#34;Yellow-Orange&#34;`, `&#34;Forest Green&#34;`, `&#34;Turquoise Blue&#34;`, `&#34;Azure Blue&#34;`, `&#34;Cerulean Blue&#34;`, `&#34;Midnight Blue&#34;`, `&#34;Medium Blue&#34;`, `&#34;Cobalt Blue&#34;`, `&#34;Violet Blue&#34;`, `&#34;Blue Violet&#34;`, `&#34;Medium Violet&#34;`, `&#34;Medium Rose&#34;`, `&#34;Lavender&#34;`, `&#34;Orchid&#34;`, `&#34;Thistle&#34;`, `&#34;Peach&#34;`, `&#34;Salmon&#34;`, `&#34;Magenta&#34;`, `&#34;Red Violet&#34;`, `&#34;Mahogany&#34;`, `&#34;Burnt Sienna&#34;`, `&#34;Chestnut&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        /**
         * @param comments The Comments param. String length must not exceed 1023 characters.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments The Comments param. String length must not exceed 1023 characters.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param name The Name param. String length must not exceed 127 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param. String length must not exceed 127 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable Output<String> snippet) {
            $.snippet = snippet;
            return this;
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(String snippet) {
            return snippet(Output.of(snippet));
        }

        public Builder tfid(@Nullable Output<String> tfid) {
            $.tfid = tfid;
            return this;
        }

        public Builder tfid(String tfid) {
            return tfid(Output.of(tfid));
        }

        public TagState build() {
            return $;
        }
    }

}
