// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectNetworkInfoCriteriaNetworkIsWifi {
    /**
     * @return SSID. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    private String ssid;

    private GetHipObjectNetworkInfoCriteriaNetworkIsWifi() {}
    /**
     * @return SSID. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    public String ssid() {
        return this.ssid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectNetworkInfoCriteriaNetworkIsWifi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ssid;
        public Builder() {}
        public Builder(GetHipObjectNetworkInfoCriteriaNetworkIsWifi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssid = defaults.ssid;
        }

        @CustomType.Setter
        public Builder ssid(String ssid) {
            if (ssid == null) {
              throw new MissingRequiredPropertyException("GetHipObjectNetworkInfoCriteriaNetworkIsWifi", "ssid");
            }
            this.ssid = ssid;
            return this;
        }
        public GetHipObjectNetworkInfoCriteriaNetworkIsWifi build() {
            final var _resultValue = new GetHipObjectNetworkInfoCriteriaNetworkIsWifi();
            _resultValue.ssid = ssid;
            return _resultValue;
        }
    }
}
