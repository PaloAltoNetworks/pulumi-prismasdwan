// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWildfireAntiVirusProfileMlavException {
    /**
     * @return The Description param.
     * 
     */
    private String description;
    /**
     * @return The Filename param.
     * 
     */
    private String filename;
    /**
     * @return The Name param.
     * 
     */
    private String name;

    private GetWildfireAntiVirusProfileMlavException() {}
    /**
     * @return The Description param.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The Filename param.
     * 
     */
    public String filename() {
        return this.filename;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWildfireAntiVirusProfileMlavException defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String filename;
        private String name;
        public Builder() {}
        public Builder(GetWildfireAntiVirusProfileMlavException defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filename = defaults.filename;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileMlavException", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder filename(String filename) {
            if (filename == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileMlavException", "filename");
            }
            this.filename = filename;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileMlavException", "name");
            }
            this.name = name;
            return this;
        }
        public GetWildfireAntiVirusProfileMlavException build() {
            final var _resultValue = new GetWildfireAntiVirusProfileMlavException();
            _resultValue.description = description;
            _resultValue.filename = filename;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
