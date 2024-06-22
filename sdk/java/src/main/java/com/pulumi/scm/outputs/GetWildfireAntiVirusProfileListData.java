// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetWildfireAntiVirusProfileListDataMlavException;
import com.pulumi.scm.outputs.GetWildfireAntiVirusProfileListDataRule;
import com.pulumi.scm.outputs.GetWildfireAntiVirusProfileListDataThreatException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWildfireAntiVirusProfileListData {
    /**
     * @return The Description param.
     * 
     */
    private String description;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return The MlavExceptions param.
     * 
     */
    private List<GetWildfireAntiVirusProfileListDataMlavException> mlavExceptions;
    /**
     * @return The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    private String name;
    /**
     * @return The PacketCapture param.
     * 
     */
    private Boolean packetCapture;
    /**
     * @return The Rules param.
     * 
     */
    private List<GetWildfireAntiVirusProfileListDataRule> rules;
    /**
     * @return The ThreatExceptions param.
     * 
     */
    private List<GetWildfireAntiVirusProfileListDataThreatException> threatExceptions;

    private GetWildfireAntiVirusProfileListData() {}
    /**
     * @return The Description param.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return UUID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The MlavExceptions param.
     * 
     */
    public List<GetWildfireAntiVirusProfileListDataMlavException> mlavExceptions() {
        return this.mlavExceptions;
    }
    /**
     * @return The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The PacketCapture param.
     * 
     */
    public Boolean packetCapture() {
        return this.packetCapture;
    }
    /**
     * @return The Rules param.
     * 
     */
    public List<GetWildfireAntiVirusProfileListDataRule> rules() {
        return this.rules;
    }
    /**
     * @return The ThreatExceptions param.
     * 
     */
    public List<GetWildfireAntiVirusProfileListDataThreatException> threatExceptions() {
        return this.threatExceptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWildfireAntiVirusProfileListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private List<GetWildfireAntiVirusProfileListDataMlavException> mlavExceptions;
        private String name;
        private Boolean packetCapture;
        private List<GetWildfireAntiVirusProfileListDataRule> rules;
        private List<GetWildfireAntiVirusProfileListDataThreatException> threatExceptions;
        public Builder() {}
        public Builder(GetWildfireAntiVirusProfileListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.mlavExceptions = defaults.mlavExceptions;
    	      this.name = defaults.name;
    	      this.packetCapture = defaults.packetCapture;
    	      this.rules = defaults.rules;
    	      this.threatExceptions = defaults.threatExceptions;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileListData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mlavExceptions(List<GetWildfireAntiVirusProfileListDataMlavException> mlavExceptions) {
            if (mlavExceptions == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileListData", "mlavExceptions");
            }
            this.mlavExceptions = mlavExceptions;
            return this;
        }
        public Builder mlavExceptions(GetWildfireAntiVirusProfileListDataMlavException... mlavExceptions) {
            return mlavExceptions(List.of(mlavExceptions));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder packetCapture(Boolean packetCapture) {
            if (packetCapture == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileListData", "packetCapture");
            }
            this.packetCapture = packetCapture;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetWildfireAntiVirusProfileListDataRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileListData", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetWildfireAntiVirusProfileListDataRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder threatExceptions(List<GetWildfireAntiVirusProfileListDataThreatException> threatExceptions) {
            if (threatExceptions == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileListData", "threatExceptions");
            }
            this.threatExceptions = threatExceptions;
            return this;
        }
        public Builder threatExceptions(GetWildfireAntiVirusProfileListDataThreatException... threatExceptions) {
            return threatExceptions(List.of(threatExceptions));
        }
        public GetWildfireAntiVirusProfileListData build() {
            final var _resultValue = new GetWildfireAntiVirusProfileListData();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.mlavExceptions = mlavExceptions;
            _resultValue.name = name;
            _resultValue.packetCapture = packetCapture;
            _resultValue.rules = rules;
            _resultValue.threatExceptions = threatExceptions;
            return _resultValue;
        }
    }
}
