// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.QosProfileAggregateBandwidthArgs;
import com.pulumi.scm.inputs.QosProfileClassBandwidthTypeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QosProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final QosProfileArgs Empty = new QosProfileArgs();

    /**
     * The AggregateBandwidth param.
     * 
     */
    @Import(name="aggregateBandwidth")
    private @Nullable Output<QosProfileAggregateBandwidthArgs> aggregateBandwidth;

    /**
     * @return The AggregateBandwidth param.
     * 
     */
    public Optional<Output<QosProfileAggregateBandwidthArgs>> aggregateBandwidth() {
        return Optional.ofNullable(this.aggregateBandwidth);
    }

    /**
     * The ClassBandwidthType param.
     * 
     */
    @Import(name="classBandwidthType")
    private @Nullable Output<QosProfileClassBandwidthTypeArgs> classBandwidthType;

    /**
     * @return The ClassBandwidthType param.
     * 
     */
    public Optional<Output<QosProfileClassBandwidthTypeArgs>> classBandwidthType() {
        return Optional.ofNullable(this.classBandwidthType);
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
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
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

    private QosProfileArgs() {}

    private QosProfileArgs(QosProfileArgs $) {
        this.aggregateBandwidth = $.aggregateBandwidth;
        this.classBandwidthType = $.classBandwidthType;
        this.device = $.device;
        this.folder = $.folder;
        this.name = $.name;
        this.snippet = $.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QosProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QosProfileArgs $;

        public Builder() {
            $ = new QosProfileArgs();
        }

        public Builder(QosProfileArgs defaults) {
            $ = new QosProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregateBandwidth The AggregateBandwidth param.
         * 
         * @return builder
         * 
         */
        public Builder aggregateBandwidth(@Nullable Output<QosProfileAggregateBandwidthArgs> aggregateBandwidth) {
            $.aggregateBandwidth = aggregateBandwidth;
            return this;
        }

        /**
         * @param aggregateBandwidth The AggregateBandwidth param.
         * 
         * @return builder
         * 
         */
        public Builder aggregateBandwidth(QosProfileAggregateBandwidthArgs aggregateBandwidth) {
            return aggregateBandwidth(Output.of(aggregateBandwidth));
        }

        /**
         * @param classBandwidthType The ClassBandwidthType param.
         * 
         * @return builder
         * 
         */
        public Builder classBandwidthType(@Nullable Output<QosProfileClassBandwidthTypeArgs> classBandwidthType) {
            $.classBandwidthType = classBandwidthType;
            return this;
        }

        /**
         * @param classBandwidthType The ClassBandwidthType param.
         * 
         * @return builder
         * 
         */
        public Builder classBandwidthType(QosProfileClassBandwidthTypeArgs classBandwidthType) {
            return classBandwidthType(Output.of(classBandwidthType));
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
         * @param name Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
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

        public QosProfileArgs build() {
            return $;
        }
    }

}
