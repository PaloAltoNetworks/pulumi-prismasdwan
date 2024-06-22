// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.HipObjectMobileDeviceCriteriaApplicationsArgs;
import com.pulumi.scm.inputs.HipObjectMobileDeviceCriteriaImeiArgs;
import com.pulumi.scm.inputs.HipObjectMobileDeviceCriteriaLastCheckinTimeArgs;
import com.pulumi.scm.inputs.HipObjectMobileDeviceCriteriaModelArgs;
import com.pulumi.scm.inputs.HipObjectMobileDeviceCriteriaPhoneNumberArgs;
import com.pulumi.scm.inputs.HipObjectMobileDeviceCriteriaTagArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectMobileDeviceCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectMobileDeviceCriteriaArgs Empty = new HipObjectMobileDeviceCriteriaArgs();

    /**
     * The Applications param.
     * 
     */
    @Import(name="applications")
    private @Nullable Output<HipObjectMobileDeviceCriteriaApplicationsArgs> applications;

    /**
     * @return The Applications param.
     * 
     */
    public Optional<Output<HipObjectMobileDeviceCriteriaApplicationsArgs>> applications() {
        return Optional.ofNullable(this.applications);
    }

    /**
     * If device&#39;s disk is encrypted.
     * 
     */
    @Import(name="diskEncrypted")
    private @Nullable Output<Boolean> diskEncrypted;

    /**
     * @return If device&#39;s disk is encrypted.
     * 
     */
    public Optional<Output<Boolean>> diskEncrypted() {
        return Optional.ofNullable(this.diskEncrypted);
    }

    /**
     * The Imei param.
     * 
     */
    @Import(name="imei")
    private @Nullable Output<HipObjectMobileDeviceCriteriaImeiArgs> imei;

    /**
     * @return The Imei param.
     * 
     */
    public Optional<Output<HipObjectMobileDeviceCriteriaImeiArgs>> imei() {
        return Optional.ofNullable(this.imei);
    }

    /**
     * If device is by rooted/jailbroken.
     * 
     */
    @Import(name="jailbroken")
    private @Nullable Output<Boolean> jailbroken;

    /**
     * @return If device is by rooted/jailbroken.
     * 
     */
    public Optional<Output<Boolean>> jailbroken() {
        return Optional.ofNullable(this.jailbroken);
    }

    /**
     * The LastCheckinTime param.
     * 
     */
    @Import(name="lastCheckinTime")
    private @Nullable Output<HipObjectMobileDeviceCriteriaLastCheckinTimeArgs> lastCheckinTime;

    /**
     * @return The LastCheckinTime param.
     * 
     */
    public Optional<Output<HipObjectMobileDeviceCriteriaLastCheckinTimeArgs>> lastCheckinTime() {
        return Optional.ofNullable(this.lastCheckinTime);
    }

    /**
     * The Model param.
     * 
     */
    @Import(name="model")
    private @Nullable Output<HipObjectMobileDeviceCriteriaModelArgs> model;

    /**
     * @return The Model param.
     * 
     */
    public Optional<Output<HipObjectMobileDeviceCriteriaModelArgs>> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * If device&#39;s passcode is present.
     * 
     */
    @Import(name="passcodeSet")
    private @Nullable Output<Boolean> passcodeSet;

    /**
     * @return If device&#39;s passcode is present.
     * 
     */
    public Optional<Output<Boolean>> passcodeSet() {
        return Optional.ofNullable(this.passcodeSet);
    }

    /**
     * The PhoneNumber param.
     * 
     */
    @Import(name="phoneNumber")
    private @Nullable Output<HipObjectMobileDeviceCriteriaPhoneNumberArgs> phoneNumber;

    /**
     * @return The PhoneNumber param.
     * 
     */
    public Optional<Output<HipObjectMobileDeviceCriteriaPhoneNumberArgs>> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    /**
     * The Tag param.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<HipObjectMobileDeviceCriteriaTagArgs> tag;

    /**
     * @return The Tag param.
     * 
     */
    public Optional<Output<HipObjectMobileDeviceCriteriaTagArgs>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private HipObjectMobileDeviceCriteriaArgs() {}

    private HipObjectMobileDeviceCriteriaArgs(HipObjectMobileDeviceCriteriaArgs $) {
        this.applications = $.applications;
        this.diskEncrypted = $.diskEncrypted;
        this.imei = $.imei;
        this.jailbroken = $.jailbroken;
        this.lastCheckinTime = $.lastCheckinTime;
        this.model = $.model;
        this.passcodeSet = $.passcodeSet;
        this.phoneNumber = $.phoneNumber;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectMobileDeviceCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectMobileDeviceCriteriaArgs $;

        public Builder() {
            $ = new HipObjectMobileDeviceCriteriaArgs();
        }

        public Builder(HipObjectMobileDeviceCriteriaArgs defaults) {
            $ = new HipObjectMobileDeviceCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applications The Applications param.
         * 
         * @return builder
         * 
         */
        public Builder applications(@Nullable Output<HipObjectMobileDeviceCriteriaApplicationsArgs> applications) {
            $.applications = applications;
            return this;
        }

        /**
         * @param applications The Applications param.
         * 
         * @return builder
         * 
         */
        public Builder applications(HipObjectMobileDeviceCriteriaApplicationsArgs applications) {
            return applications(Output.of(applications));
        }

        /**
         * @param diskEncrypted If device&#39;s disk is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder diskEncrypted(@Nullable Output<Boolean> diskEncrypted) {
            $.diskEncrypted = diskEncrypted;
            return this;
        }

        /**
         * @param diskEncrypted If device&#39;s disk is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder diskEncrypted(Boolean diskEncrypted) {
            return diskEncrypted(Output.of(diskEncrypted));
        }

        /**
         * @param imei The Imei param.
         * 
         * @return builder
         * 
         */
        public Builder imei(@Nullable Output<HipObjectMobileDeviceCriteriaImeiArgs> imei) {
            $.imei = imei;
            return this;
        }

        /**
         * @param imei The Imei param.
         * 
         * @return builder
         * 
         */
        public Builder imei(HipObjectMobileDeviceCriteriaImeiArgs imei) {
            return imei(Output.of(imei));
        }

        /**
         * @param jailbroken If device is by rooted/jailbroken.
         * 
         * @return builder
         * 
         */
        public Builder jailbroken(@Nullable Output<Boolean> jailbroken) {
            $.jailbroken = jailbroken;
            return this;
        }

        /**
         * @param jailbroken If device is by rooted/jailbroken.
         * 
         * @return builder
         * 
         */
        public Builder jailbroken(Boolean jailbroken) {
            return jailbroken(Output.of(jailbroken));
        }

        /**
         * @param lastCheckinTime The LastCheckinTime param.
         * 
         * @return builder
         * 
         */
        public Builder lastCheckinTime(@Nullable Output<HipObjectMobileDeviceCriteriaLastCheckinTimeArgs> lastCheckinTime) {
            $.lastCheckinTime = lastCheckinTime;
            return this;
        }

        /**
         * @param lastCheckinTime The LastCheckinTime param.
         * 
         * @return builder
         * 
         */
        public Builder lastCheckinTime(HipObjectMobileDeviceCriteriaLastCheckinTimeArgs lastCheckinTime) {
            return lastCheckinTime(Output.of(lastCheckinTime));
        }

        /**
         * @param model The Model param.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<HipObjectMobileDeviceCriteriaModelArgs> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model The Model param.
         * 
         * @return builder
         * 
         */
        public Builder model(HipObjectMobileDeviceCriteriaModelArgs model) {
            return model(Output.of(model));
        }

        /**
         * @param passcodeSet If device&#39;s passcode is present.
         * 
         * @return builder
         * 
         */
        public Builder passcodeSet(@Nullable Output<Boolean> passcodeSet) {
            $.passcodeSet = passcodeSet;
            return this;
        }

        /**
         * @param passcodeSet If device&#39;s passcode is present.
         * 
         * @return builder
         * 
         */
        public Builder passcodeSet(Boolean passcodeSet) {
            return passcodeSet(Output.of(passcodeSet));
        }

        /**
         * @param phoneNumber The PhoneNumber param.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(@Nullable Output<HipObjectMobileDeviceCriteriaPhoneNumberArgs> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * @param phoneNumber The PhoneNumber param.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(HipObjectMobileDeviceCriteriaPhoneNumberArgs phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        /**
         * @param tag The Tag param.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<HipObjectMobileDeviceCriteriaTagArgs> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The Tag param.
         * 
         * @return builder
         * 
         */
        public Builder tag(HipObjectMobileDeviceCriteriaTagArgs tag) {
            return tag(Output.of(tag));
        }

        public HipObjectMobileDeviceCriteriaArgs build() {
            return $;
        }
    }

}
