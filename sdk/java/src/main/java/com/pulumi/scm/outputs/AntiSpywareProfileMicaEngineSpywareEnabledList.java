// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AntiSpywareProfileMicaEngineSpywareEnabledList {
    /**
     * @return The InlinePolicyAction param. String must be one of these: `&#34;alert&#34;`, `&#34;allow&#34;`, `&#34;drop&#34;`, `&#34;reset-both&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`. Default: `&#34;alert&#34;`.
     * 
     */
    private @Nullable String inlinePolicyAction;
    /**
     * @return The Name param.
     * 
     */
    private @Nullable String name;

    private AntiSpywareProfileMicaEngineSpywareEnabledList() {}
    /**
     * @return The InlinePolicyAction param. String must be one of these: `&#34;alert&#34;`, `&#34;allow&#34;`, `&#34;drop&#34;`, `&#34;reset-both&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`. Default: `&#34;alert&#34;`.
     * 
     */
    public Optional<String> inlinePolicyAction() {
        return Optional.ofNullable(this.inlinePolicyAction);
    }
    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AntiSpywareProfileMicaEngineSpywareEnabledList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String inlinePolicyAction;
        private @Nullable String name;
        public Builder() {}
        public Builder(AntiSpywareProfileMicaEngineSpywareEnabledList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlinePolicyAction = defaults.inlinePolicyAction;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder inlinePolicyAction(@Nullable String inlinePolicyAction) {

            this.inlinePolicyAction = inlinePolicyAction;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public AntiSpywareProfileMicaEngineSpywareEnabledList build() {
            final var _resultValue = new AntiSpywareProfileMicaEngineSpywareEnabledList();
            _resultValue.inlinePolicyAction = inlinePolicyAction;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
