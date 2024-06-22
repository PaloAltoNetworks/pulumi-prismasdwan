// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectNetworkInfoCriteriaNetworkIsNotMobile;
import com.pulumi.scm.outputs.GetHipObjectNetworkInfoCriteriaNetworkIsNotWifi;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetHipObjectNetworkInfoCriteriaNetworkIsNot {
    /**
     * @return The Ethernet param.
     * 
     */
    private Boolean ethernet;
    /**
     * @return The Mobile param.
     * 
     */
    private GetHipObjectNetworkInfoCriteriaNetworkIsNotMobile mobile;
    /**
     * @return The Unknown param.
     * 
     */
    private Boolean unknown;
    /**
     * @return The Wifi param.
     * 
     */
    private GetHipObjectNetworkInfoCriteriaNetworkIsNotWifi wifi;

    private GetHipObjectNetworkInfoCriteriaNetworkIsNot() {}
    /**
     * @return The Ethernet param.
     * 
     */
    public Boolean ethernet() {
        return this.ethernet;
    }
    /**
     * @return The Mobile param.
     * 
     */
    public GetHipObjectNetworkInfoCriteriaNetworkIsNotMobile mobile() {
        return this.mobile;
    }
    /**
     * @return The Unknown param.
     * 
     */
    public Boolean unknown() {
        return this.unknown;
    }
    /**
     * @return The Wifi param.
     * 
     */
    public GetHipObjectNetworkInfoCriteriaNetworkIsNotWifi wifi() {
        return this.wifi;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectNetworkInfoCriteriaNetworkIsNot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean ethernet;
        private GetHipObjectNetworkInfoCriteriaNetworkIsNotMobile mobile;
        private Boolean unknown;
        private GetHipObjectNetworkInfoCriteriaNetworkIsNotWifi wifi;
        public Builder() {}
        public Builder(GetHipObjectNetworkInfoCriteriaNetworkIsNot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ethernet = defaults.ethernet;
    	      this.mobile = defaults.mobile;
    	      this.unknown = defaults.unknown;
    	      this.wifi = defaults.wifi;
        }

        @CustomType.Setter
        public Builder ethernet(Boolean ethernet) {
            if (ethernet == null) {
              throw new MissingRequiredPropertyException("GetHipObjectNetworkInfoCriteriaNetworkIsNot", "ethernet");
            }
            this.ethernet = ethernet;
            return this;
        }
        @CustomType.Setter
        public Builder mobile(GetHipObjectNetworkInfoCriteriaNetworkIsNotMobile mobile) {
            if (mobile == null) {
              throw new MissingRequiredPropertyException("GetHipObjectNetworkInfoCriteriaNetworkIsNot", "mobile");
            }
            this.mobile = mobile;
            return this;
        }
        @CustomType.Setter
        public Builder unknown(Boolean unknown) {
            if (unknown == null) {
              throw new MissingRequiredPropertyException("GetHipObjectNetworkInfoCriteriaNetworkIsNot", "unknown");
            }
            this.unknown = unknown;
            return this;
        }
        @CustomType.Setter
        public Builder wifi(GetHipObjectNetworkInfoCriteriaNetworkIsNotWifi wifi) {
            if (wifi == null) {
              throw new MissingRequiredPropertyException("GetHipObjectNetworkInfoCriteriaNetworkIsNot", "wifi");
            }
            this.wifi = wifi;
            return this;
        }
        public GetHipObjectNetworkInfoCriteriaNetworkIsNot build() {
            final var _resultValue = new GetHipObjectNetworkInfoCriteriaNetworkIsNot();
            _resultValue.ethernet = ethernet;
            _resultValue.mobile = mobile;
            _resultValue.unknown = unknown;
            _resultValue.wifi = wifi;
            return _resultValue;
        }
    }
}
