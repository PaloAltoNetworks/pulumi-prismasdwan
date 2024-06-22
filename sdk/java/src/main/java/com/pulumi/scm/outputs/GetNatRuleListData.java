// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetNatRuleListDataDestinationTranslation;
import com.pulumi.scm.outputs.GetNatRuleListDataDynamicDestinationTranslation;
import com.pulumi.scm.outputs.GetNatRuleListDataSourceTranslation;
import com.pulumi.scm.outputs.GetNatRuleListDataTarget;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNatRuleListData {
    /**
     * @return The ActiveActiveDeviceBinding param. String must be one of these: `&#34;primary&#34;`, `&#34;both&#34;`, `&#34;0&#34;`, `&#34;1&#34;`.
     * 
     */
    private String activeActiveDeviceBinding;
    /**
     * @return The Description param.
     * 
     */
    private String description;
    /**
     * @return Static destination translation parameter.
     * 
     */
    private GetNatRuleListDataDestinationTranslation destinationTranslation;
    /**
     * @return The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `&#34;any&#34;`.
     * 
     */
    private List<String> destinations;
    /**
     * @return The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
     * 
     */
    private String device;
    /**
     * @return The Disabled param.
     * 
     */
    private Boolean disabled;
    /**
     * @return Dynamic destination translation parameter.
     * 
     */
    private GetNatRuleListDataDynamicDestinationTranslation dynamicDestinationTranslation;
    /**
     * @return The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
     * 
     */
    private String folder;
    /**
     * @return The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `&#34;any&#34;`.
     * 
     */
    private List<String> froms;
    /**
     * @return The GroupTag param.
     * 
     */
    private String groupTag;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The NatType param. String must be one of these: `&#34;ipv4&#34;`, `&#34;nat64&#34;`, `&#34;nptv6&#34;`.
     * 
     */
    private String natType;
    /**
     * @return The Service param.
     * 
     */
    private String service;
    /**
     * @return The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
     * 
     */
    private String snippet;
    /**
     * @return The SourceTranslation param.
     * 
     */
    private GetNatRuleListDataSourceTranslation sourceTranslation;
    /**
     * @return The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `&#34;any&#34;`.
     * 
     */
    private List<String> sources;
    /**
     * @return The Tags param.
     * 
     */
    private List<String> tags;
    /**
     * @return The Target param.
     * 
     */
    private GetNatRuleListDataTarget target;
    /**
     * @return The ToInterface param. String must be one of these: `&#34;any&#34;`.
     * 
     */
    private String toInterface;
    /**
     * @return The destination security zone(s).
     * 
     */
    private List<String> tos;

    private GetNatRuleListData() {}
    /**
     * @return The ActiveActiveDeviceBinding param. String must be one of these: `&#34;primary&#34;`, `&#34;both&#34;`, `&#34;0&#34;`, `&#34;1&#34;`.
     * 
     */
    public String activeActiveDeviceBinding() {
        return this.activeActiveDeviceBinding;
    }
    /**
     * @return The Description param.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Static destination translation parameter.
     * 
     */
    public GetNatRuleListDataDestinationTranslation destinationTranslation() {
        return this.destinationTranslation;
    }
    /**
     * @return The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `&#34;any&#34;`.
     * 
     */
    public List<String> destinations() {
        return this.destinations;
    }
    /**
     * @return The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
     * 
     */
    public String device() {
        return this.device;
    }
    /**
     * @return The Disabled param.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return Dynamic destination translation parameter.
     * 
     */
    public GetNatRuleListDataDynamicDestinationTranslation dynamicDestinationTranslation() {
        return this.dynamicDestinationTranslation;
    }
    /**
     * @return The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
     * 
     */
    public String folder() {
        return this.folder;
    }
    /**
     * @return The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `&#34;any&#34;`.
     * 
     */
    public List<String> froms() {
        return this.froms;
    }
    /**
     * @return The GroupTag param.
     * 
     */
    public String groupTag() {
        return this.groupTag;
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The NatType param. String must be one of these: `&#34;ipv4&#34;`, `&#34;nat64&#34;`, `&#34;nptv6&#34;`.
     * 
     */
    public String natType() {
        return this.natType;
    }
    /**
     * @return The Service param.
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
     * 
     */
    public String snippet() {
        return this.snippet;
    }
    /**
     * @return The SourceTranslation param.
     * 
     */
    public GetNatRuleListDataSourceTranslation sourceTranslation() {
        return this.sourceTranslation;
    }
    /**
     * @return The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `&#34;any&#34;`.
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
     * @return The Target param.
     * 
     */
    public GetNatRuleListDataTarget target() {
        return this.target;
    }
    /**
     * @return The ToInterface param. String must be one of these: `&#34;any&#34;`.
     * 
     */
    public String toInterface() {
        return this.toInterface;
    }
    /**
     * @return The destination security zone(s).
     * 
     */
    public List<String> tos() {
        return this.tos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatRuleListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activeActiveDeviceBinding;
        private String description;
        private GetNatRuleListDataDestinationTranslation destinationTranslation;
        private List<String> destinations;
        private String device;
        private Boolean disabled;
        private GetNatRuleListDataDynamicDestinationTranslation dynamicDestinationTranslation;
        private String folder;
        private List<String> froms;
        private String groupTag;
        private String id;
        private String name;
        private String natType;
        private String service;
        private String snippet;
        private GetNatRuleListDataSourceTranslation sourceTranslation;
        private List<String> sources;
        private List<String> tags;
        private GetNatRuleListDataTarget target;
        private String toInterface;
        private List<String> tos;
        public Builder() {}
        public Builder(GetNatRuleListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeActiveDeviceBinding = defaults.activeActiveDeviceBinding;
    	      this.description = defaults.description;
    	      this.destinationTranslation = defaults.destinationTranslation;
    	      this.destinations = defaults.destinations;
    	      this.device = defaults.device;
    	      this.disabled = defaults.disabled;
    	      this.dynamicDestinationTranslation = defaults.dynamicDestinationTranslation;
    	      this.folder = defaults.folder;
    	      this.froms = defaults.froms;
    	      this.groupTag = defaults.groupTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.natType = defaults.natType;
    	      this.service = defaults.service;
    	      this.snippet = defaults.snippet;
    	      this.sourceTranslation = defaults.sourceTranslation;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
    	      this.target = defaults.target;
    	      this.toInterface = defaults.toInterface;
    	      this.tos = defaults.tos;
        }

        @CustomType.Setter
        public Builder activeActiveDeviceBinding(String activeActiveDeviceBinding) {
            if (activeActiveDeviceBinding == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "activeActiveDeviceBinding");
            }
            this.activeActiveDeviceBinding = activeActiveDeviceBinding;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinationTranslation(GetNatRuleListDataDestinationTranslation destinationTranslation) {
            if (destinationTranslation == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "destinationTranslation");
            }
            this.destinationTranslation = destinationTranslation;
            return this;
        }
        @CustomType.Setter
        public Builder destinations(List<String> destinations) {
            if (destinations == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "destinations");
            }
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        @CustomType.Setter
        public Builder device(String device) {
            if (device == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "device");
            }
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicDestinationTranslation(GetNatRuleListDataDynamicDestinationTranslation dynamicDestinationTranslation) {
            if (dynamicDestinationTranslation == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "dynamicDestinationTranslation");
            }
            this.dynamicDestinationTranslation = dynamicDestinationTranslation;
            return this;
        }
        @CustomType.Setter
        public Builder folder(String folder) {
            if (folder == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "folder");
            }
            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder froms(List<String> froms) {
            if (froms == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "froms");
            }
            this.froms = froms;
            return this;
        }
        public Builder froms(String... froms) {
            return froms(List.of(froms));
        }
        @CustomType.Setter
        public Builder groupTag(String groupTag) {
            if (groupTag == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "groupTag");
            }
            this.groupTag = groupTag;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder natType(String natType) {
            if (natType == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "natType");
            }
            this.natType = natType;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "service");
            }
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder snippet(String snippet) {
            if (snippet == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "snippet");
            }
            this.snippet = snippet;
            return this;
        }
        @CustomType.Setter
        public Builder sourceTranslation(GetNatRuleListDataSourceTranslation sourceTranslation) {
            if (sourceTranslation == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "sourceTranslation");
            }
            this.sourceTranslation = sourceTranslation;
            return this;
        }
        @CustomType.Setter
        public Builder sources(List<String> sources) {
            if (sources == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "sources");
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
              throw new MissingRequiredPropertyException("GetNatRuleListData", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder target(GetNatRuleListDataTarget target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "target");
            }
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder toInterface(String toInterface) {
            if (toInterface == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "toInterface");
            }
            this.toInterface = toInterface;
            return this;
        }
        @CustomType.Setter
        public Builder tos(List<String> tos) {
            if (tos == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListData", "tos");
            }
            this.tos = tos;
            return this;
        }
        public Builder tos(String... tos) {
            return tos(List.of(tos));
        }
        public GetNatRuleListData build() {
            final var _resultValue = new GetNatRuleListData();
            _resultValue.activeActiveDeviceBinding = activeActiveDeviceBinding;
            _resultValue.description = description;
            _resultValue.destinationTranslation = destinationTranslation;
            _resultValue.destinations = destinations;
            _resultValue.device = device;
            _resultValue.disabled = disabled;
            _resultValue.dynamicDestinationTranslation = dynamicDestinationTranslation;
            _resultValue.folder = folder;
            _resultValue.froms = froms;
            _resultValue.groupTag = groupTag;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.natType = natType;
            _resultValue.service = service;
            _resultValue.snippet = snippet;
            _resultValue.sourceTranslation = sourceTranslation;
            _resultValue.sources = sources;
            _resultValue.tags = tags;
            _resultValue.target = target;
            _resultValue.toInterface = toInterface;
            _resultValue.tos = tos;
            return _resultValue;
        }
    }
}
