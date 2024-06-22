// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataHostInfoCriteriaSerialNumber {
    /**
     * @return The Contains param. String length must not exceed 255 characters.
     * 
     */
    private String contains;
    /**
     * @return The Is param. String length must not exceed 255 characters.
     * 
     */
    private String is;
    /**
     * @return The IsNot param. String length must not exceed 255 characters.
     * 
     */
    private String isNot;

    private GetHipObjectListDataHostInfoCriteriaSerialNumber() {}
    /**
     * @return The Contains param. String length must not exceed 255 characters.
     * 
     */
    public String contains() {
        return this.contains;
    }
    /**
     * @return The Is param. String length must not exceed 255 characters.
     * 
     */
    public String is() {
        return this.is;
    }
    /**
     * @return The IsNot param. String length must not exceed 255 characters.
     * 
     */
    public String isNot() {
        return this.isNot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataHostInfoCriteriaSerialNumber defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contains;
        private String is;
        private String isNot;
        public Builder() {}
        public Builder(GetHipObjectListDataHostInfoCriteriaSerialNumber defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.is = defaults.is;
    	      this.isNot = defaults.isNot;
        }

        @CustomType.Setter
        public Builder contains(String contains) {
            if (contains == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteriaSerialNumber", "contains");
            }
            this.contains = contains;
            return this;
        }
        @CustomType.Setter
        public Builder is(String is) {
            if (is == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteriaSerialNumber", "is");
            }
            this.is = is;
            return this;
        }
        @CustomType.Setter
        public Builder isNot(String isNot) {
            if (isNot == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteriaSerialNumber", "isNot");
            }
            this.isNot = isNot;
            return this;
        }
        public GetHipObjectListDataHostInfoCriteriaSerialNumber build() {
            final var _resultValue = new GetHipObjectListDataHostInfoCriteriaSerialNumber();
            _resultValue.contains = contains;
            _resultValue.is = is;
            _resultValue.isNot = isNot;
            return _resultValue;
        }
    }
}
