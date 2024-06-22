// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanQualifier;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan {
    /**
     * @return The Context param. String length must not exceed 127 characters.
     * 
     */
    private String context;
    /**
     * @return The Qualifiers param.
     * 
     */
    private List<GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanQualifier> qualifiers;
    /**
     * @return The Value param. Value must be between 0 and 4294967295.
     * 
     */
    private Integer value;

    private GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan() {}
    /**
     * @return The Context param. String length must not exceed 127 characters.
     * 
     */
    public String context() {
        return this.context;
    }
    /**
     * @return The Qualifiers param.
     * 
     */
    public List<GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanQualifier> qualifiers() {
        return this.qualifiers;
    }
    /**
     * @return The Value param. Value must be between 0 and 4294967295.
     * 
     */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String context;
        private List<GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanQualifier> qualifiers;
        private Integer value;
        public Builder() {}
        public Builder(GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.qualifiers = defaults.qualifiers;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder context(String context) {
            if (context == null) {
              throw new MissingRequiredPropertyException("GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan", "context");
            }
            this.context = context;
            return this;
        }
        @CustomType.Setter
        public Builder qualifiers(List<GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanQualifier> qualifiers) {
            if (qualifiers == null) {
              throw new MissingRequiredPropertyException("GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan", "qualifiers");
            }
            this.qualifiers = qualifiers;
            return this;
        }
        public Builder qualifiers(GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanQualifier... qualifiers) {
            return qualifiers(List.of(qualifiers));
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan", "value");
            }
            this.value = value;
            return this;
        }
        public GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan build() {
            final var _resultValue = new GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThan();
            _resultValue.context = context;
            _resultValue.qualifiers = qualifiers;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
