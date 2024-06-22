// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AntiSpywareSignatureSignatureCombinationAndConditionOrCondition {
    /**
     * @return The Name param.
     * 
     */
    private @Nullable String name;
    /**
     * @return The ThreatId param.
     * 
     */
    private @Nullable String threatId;

    private AntiSpywareSignatureSignatureCombinationAndConditionOrCondition() {}
    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ThreatId param.
     * 
     */
    public Optional<String> threatId() {
        return Optional.ofNullable(this.threatId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AntiSpywareSignatureSignatureCombinationAndConditionOrCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String threatId;
        public Builder() {}
        public Builder(AntiSpywareSignatureSignatureCombinationAndConditionOrCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.threatId = defaults.threatId;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder threatId(@Nullable String threatId) {

            this.threatId = threatId;
            return this;
        }
        public AntiSpywareSignatureSignatureCombinationAndConditionOrCondition build() {
            final var _resultValue = new AntiSpywareSignatureSignatureCombinationAndConditionOrCondition();
            _resultValue.name = name;
            _resultValue.threatId = threatId;
            return _resultValue;
        }
    }
}
