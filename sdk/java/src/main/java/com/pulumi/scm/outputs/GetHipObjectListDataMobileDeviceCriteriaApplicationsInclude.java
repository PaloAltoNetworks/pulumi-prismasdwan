// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude {
    /**
     * @return application hash. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    private String hash;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return application package name. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    private String package_;

    private GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude() {}
    /**
     * @return application hash. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    public String hash() {
        return this.hash;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return application package name. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    public String package_() {
        return this.package_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hash;
        private String name;
        private String package_;
        public Builder() {}
        public Builder(GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hash = defaults.hash;
    	      this.name = defaults.name;
    	      this.package_ = defaults.package_;
        }

        @CustomType.Setter
        public Builder hash(String hash) {
            if (hash == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude", "hash");
            }
            this.hash = hash;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter("package")
        public Builder package_(String package_) {
            if (package_ == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude", "package_");
            }
            this.package_ = package_;
            return this;
        }
        public GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude build() {
            final var _resultValue = new GetHipObjectListDataMobileDeviceCriteriaApplicationsInclude();
            _resultValue.hash = hash;
            _resultValue.name = name;
            _resultValue.package_ = package_;
            return _resultValue;
        }
    }
}
