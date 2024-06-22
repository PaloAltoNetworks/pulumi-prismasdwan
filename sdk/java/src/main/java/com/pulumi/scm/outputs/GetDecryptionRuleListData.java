// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetDecryptionRuleListDataType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDecryptionRuleListData {
    /**
     * @return The Action param. String must be one of these: `&#34;decrypt&#34;`, `&#34;no-decrypt&#34;`.
     * 
     */
    private String action;
    /**
     * @return The Categories param.
     * 
     */
    private List<String> categories;
    /**
     * @return The Description param.
     * 
     */
    private String description;
    /**
     * @return The DestinationHips param.
     * 
     */
    private List<String> destinationHips;
    /**
     * @return The Destinations param.
     * 
     */
    private List<String> destinations;
    /**
     * @return The Disabled param.
     * 
     */
    private Boolean disabled;
    /**
     * @return The Froms param.
     * 
     */
    private List<String> froms;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return The LogFail param.
     * 
     */
    private Boolean logFail;
    /**
     * @return The LogSetting param.
     * 
     */
    private String logSetting;
    /**
     * @return The LogSuccess param.
     * 
     */
    private Boolean logSuccess;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The NegateDestination param.
     * 
     */
    private Boolean negateDestination;
    /**
     * @return The NegateSource param.
     * 
     */
    private Boolean negateSource;
    /**
     * @return The Profile param.
     * 
     */
    private String profile;
    /**
     * @return The Services param.
     * 
     */
    private List<String> services;
    /**
     * @return The SourceHips param.
     * 
     */
    private List<String> sourceHips;
    /**
     * @return The SourceUsers param.
     * 
     */
    private List<String> sourceUsers;
    /**
     * @return The Sources param.
     * 
     */
    private List<String> sources;
    /**
     * @return The Tags param.
     * 
     */
    private List<String> tags;
    /**
     * @return The Tos param.
     * 
     */
    private List<String> tos;
    /**
     * @return The Type param.
     * 
     */
    private GetDecryptionRuleListDataType type;

    private GetDecryptionRuleListData() {}
    /**
     * @return The Action param. String must be one of these: `&#34;decrypt&#34;`, `&#34;no-decrypt&#34;`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The Categories param.
     * 
     */
    public List<String> categories() {
        return this.categories;
    }
    /**
     * @return The Description param.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The DestinationHips param.
     * 
     */
    public List<String> destinationHips() {
        return this.destinationHips;
    }
    /**
     * @return The Destinations param.
     * 
     */
    public List<String> destinations() {
        return this.destinations;
    }
    /**
     * @return The Disabled param.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The Froms param.
     * 
     */
    public List<String> froms() {
        return this.froms;
    }
    /**
     * @return UUID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The LogFail param.
     * 
     */
    public Boolean logFail() {
        return this.logFail;
    }
    /**
     * @return The LogSetting param.
     * 
     */
    public String logSetting() {
        return this.logSetting;
    }
    /**
     * @return The LogSuccess param.
     * 
     */
    public Boolean logSuccess() {
        return this.logSuccess;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The NegateDestination param.
     * 
     */
    public Boolean negateDestination() {
        return this.negateDestination;
    }
    /**
     * @return The NegateSource param.
     * 
     */
    public Boolean negateSource() {
        return this.negateSource;
    }
    /**
     * @return The Profile param.
     * 
     */
    public String profile() {
        return this.profile;
    }
    /**
     * @return The Services param.
     * 
     */
    public List<String> services() {
        return this.services;
    }
    /**
     * @return The SourceHips param.
     * 
     */
    public List<String> sourceHips() {
        return this.sourceHips;
    }
    /**
     * @return The SourceUsers param.
     * 
     */
    public List<String> sourceUsers() {
        return this.sourceUsers;
    }
    /**
     * @return The Sources param.
     * 
     */
    public List<String> sources() {
        return this.sources;
    }
    /**
     * @return The Tags param.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The Tos param.
     * 
     */
    public List<String> tos() {
        return this.tos;
    }
    /**
     * @return The Type param.
     * 
     */
    public GetDecryptionRuleListDataType type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDecryptionRuleListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<String> categories;
        private String description;
        private List<String> destinationHips;
        private List<String> destinations;
        private Boolean disabled;
        private List<String> froms;
        private String id;
        private Boolean logFail;
        private String logSetting;
        private Boolean logSuccess;
        private String name;
        private Boolean negateDestination;
        private Boolean negateSource;
        private String profile;
        private List<String> services;
        private List<String> sourceHips;
        private List<String> sourceUsers;
        private List<String> sources;
        private List<String> tags;
        private List<String> tos;
        private GetDecryptionRuleListDataType type;
        public Builder() {}
        public Builder(GetDecryptionRuleListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.destinationHips = defaults.destinationHips;
    	      this.destinations = defaults.destinations;
    	      this.disabled = defaults.disabled;
    	      this.froms = defaults.froms;
    	      this.id = defaults.id;
    	      this.logFail = defaults.logFail;
    	      this.logSetting = defaults.logSetting;
    	      this.logSuccess = defaults.logSuccess;
    	      this.name = defaults.name;
    	      this.negateDestination = defaults.negateDestination;
    	      this.negateSource = defaults.negateSource;
    	      this.profile = defaults.profile;
    	      this.services = defaults.services;
    	      this.sourceHips = defaults.sourceHips;
    	      this.sourceUsers = defaults.sourceUsers;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
    	      this.tos = defaults.tos;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder categories(List<String> categories) {
            if (categories == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "categories");
            }
            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinationHips(List<String> destinationHips) {
            if (destinationHips == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "destinationHips");
            }
            this.destinationHips = destinationHips;
            return this;
        }
        public Builder destinationHips(String... destinationHips) {
            return destinationHips(List.of(destinationHips));
        }
        @CustomType.Setter
        public Builder destinations(List<String> destinations) {
            if (destinations == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "destinations");
            }
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder froms(List<String> froms) {
            if (froms == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "froms");
            }
            this.froms = froms;
            return this;
        }
        public Builder froms(String... froms) {
            return froms(List.of(froms));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder logFail(Boolean logFail) {
            if (logFail == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "logFail");
            }
            this.logFail = logFail;
            return this;
        }
        @CustomType.Setter
        public Builder logSetting(String logSetting) {
            if (logSetting == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "logSetting");
            }
            this.logSetting = logSetting;
            return this;
        }
        @CustomType.Setter
        public Builder logSuccess(Boolean logSuccess) {
            if (logSuccess == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "logSuccess");
            }
            this.logSuccess = logSuccess;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder negateDestination(Boolean negateDestination) {
            if (negateDestination == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "negateDestination");
            }
            this.negateDestination = negateDestination;
            return this;
        }
        @CustomType.Setter
        public Builder negateSource(Boolean negateSource) {
            if (negateSource == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "negateSource");
            }
            this.negateSource = negateSource;
            return this;
        }
        @CustomType.Setter
        public Builder profile(String profile) {
            if (profile == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "profile");
            }
            this.profile = profile;
            return this;
        }
        @CustomType.Setter
        public Builder services(List<String> services) {
            if (services == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "services");
            }
            this.services = services;
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder sourceHips(List<String> sourceHips) {
            if (sourceHips == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "sourceHips");
            }
            this.sourceHips = sourceHips;
            return this;
        }
        public Builder sourceHips(String... sourceHips) {
            return sourceHips(List.of(sourceHips));
        }
        @CustomType.Setter
        public Builder sourceUsers(List<String> sourceUsers) {
            if (sourceUsers == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "sourceUsers");
            }
            this.sourceUsers = sourceUsers;
            return this;
        }
        public Builder sourceUsers(String... sourceUsers) {
            return sourceUsers(List.of(sourceUsers));
        }
        @CustomType.Setter
        public Builder sources(List<String> sources) {
            if (sources == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "sources");
            }
            this.sources = sources;
            return this;
        }
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder tos(List<String> tos) {
            if (tos == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "tos");
            }
            this.tos = tos;
            return this;
        }
        public Builder tos(String... tos) {
            return tos(List.of(tos));
        }
        @CustomType.Setter
        public Builder type(GetDecryptionRuleListDataType type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDecryptionRuleListData", "type");
            }
            this.type = type;
            return this;
        }
        public GetDecryptionRuleListData build() {
            final var _resultValue = new GetDecryptionRuleListData();
            _resultValue.action = action;
            _resultValue.categories = categories;
            _resultValue.description = description;
            _resultValue.destinationHips = destinationHips;
            _resultValue.destinations = destinations;
            _resultValue.disabled = disabled;
            _resultValue.froms = froms;
            _resultValue.id = id;
            _resultValue.logFail = logFail;
            _resultValue.logSetting = logSetting;
            _resultValue.logSuccess = logSuccess;
            _resultValue.name = name;
            _resultValue.negateDestination = negateDestination;
            _resultValue.negateSource = negateSource;
            _resultValue.profile = profile;
            _resultValue.services = services;
            _resultValue.sourceHips = sourceHips;
            _resultValue.sourceUsers = sourceUsers;
            _resultValue.sources = sources;
            _resultValue.tags = tags;
            _resultValue.tos = tos;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
