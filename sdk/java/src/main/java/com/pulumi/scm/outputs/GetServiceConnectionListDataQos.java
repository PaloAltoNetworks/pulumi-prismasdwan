// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceConnectionListDataQos {
    /**
     * @return The Enable param.
     * 
     */
    private Boolean enable;
    /**
     * @return The QosProfile param.
     * 
     */
    private String qosProfile;

    private GetServiceConnectionListDataQos() {}
    /**
     * @return The Enable param.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The QosProfile param.
     * 
     */
    public String qosProfile() {
        return this.qosProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceConnectionListDataQos defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        private String qosProfile;
        public Builder() {}
        public Builder(GetServiceConnectionListDataQos defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.qosProfile = defaults.qosProfile;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataQos", "enable");
            }
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder qosProfile(String qosProfile) {
            if (qosProfile == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListDataQos", "qosProfile");
            }
            this.qosProfile = qosProfile;
            return this;
        }
        public GetServiceConnectionListDataQos build() {
            final var _resultValue = new GetServiceConnectionListDataQos();
            _resultValue.enable = enable;
            _resultValue.qosProfile = qosProfile;
            return _resultValue;
        }
    }
}
