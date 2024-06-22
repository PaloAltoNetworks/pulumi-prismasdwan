// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAuthenticationProfileListDataMethodTacplus {
    /**
     * @return The Checkgroup param.
     * 
     */
    private Boolean checkgroup;
    /**
     * @return The ServerProfile param.
     * 
     */
    private String serverProfile;

    private GetAuthenticationProfileListDataMethodTacplus() {}
    /**
     * @return The Checkgroup param.
     * 
     */
    public Boolean checkgroup() {
        return this.checkgroup;
    }
    /**
     * @return The ServerProfile param.
     * 
     */
    public String serverProfile() {
        return this.serverProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthenticationProfileListDataMethodTacplus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean checkgroup;
        private String serverProfile;
        public Builder() {}
        public Builder(GetAuthenticationProfileListDataMethodTacplus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkgroup = defaults.checkgroup;
    	      this.serverProfile = defaults.serverProfile;
        }

        @CustomType.Setter
        public Builder checkgroup(Boolean checkgroup) {
            if (checkgroup == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileListDataMethodTacplus", "checkgroup");
            }
            this.checkgroup = checkgroup;
            return this;
        }
        @CustomType.Setter
        public Builder serverProfile(String serverProfile) {
            if (serverProfile == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileListDataMethodTacplus", "serverProfile");
            }
            this.serverProfile = serverProfile;
            return this;
        }
        public GetAuthenticationProfileListDataMethodTacplus build() {
            final var _resultValue = new GetAuthenticationProfileListDataMethodTacplus();
            _resultValue.checkgroup = checkgroup;
            _resultValue.serverProfile = serverProfile;
            return _resultValue;
        }
    }
}
