// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecurityRuleListDataProfileSetting {
    /**
     * @return The security profile group.
     * 
     */
    private List<String> groups;

    private GetSecurityRuleListDataProfileSetting() {}
    /**
     * @return The security profile group.
     * 
     */
    public List<String> groups() {
        return this.groups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityRuleListDataProfileSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> groups;
        public Builder() {}
        public Builder(GetSecurityRuleListDataProfileSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
        }

        @CustomType.Setter
        public Builder groups(List<String> groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetSecurityRuleListDataProfileSetting", "groups");
            }
            this.groups = groups;
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }
        public GetSecurityRuleListDataProfileSetting build() {
            final var _resultValue = new GetSecurityRuleListDataProfileSetting();
            _resultValue.groups = groups;
            return _resultValue;
        }
    }
}
