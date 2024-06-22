// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.QosPolicyRuleDscpTosCodepoint;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class QosPolicyRuleDscpTos {
    /**
     * @return The Codepoints param.
     * 
     */
    private @Nullable List<QosPolicyRuleDscpTosCodepoint> codepoints;

    private QosPolicyRuleDscpTos() {}
    /**
     * @return The Codepoints param.
     * 
     */
    public List<QosPolicyRuleDscpTosCodepoint> codepoints() {
        return this.codepoints == null ? List.of() : this.codepoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosPolicyRuleDscpTos defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<QosPolicyRuleDscpTosCodepoint> codepoints;
        public Builder() {}
        public Builder(QosPolicyRuleDscpTos defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codepoints = defaults.codepoints;
        }

        @CustomType.Setter
        public Builder codepoints(@Nullable List<QosPolicyRuleDscpTosCodepoint> codepoints) {

            this.codepoints = codepoints;
            return this;
        }
        public Builder codepoints(QosPolicyRuleDscpTosCodepoint... codepoints) {
            return codepoints(List.of(codepoints));
        }
        public QosPolicyRuleDscpTos build() {
            final var _resultValue = new QosPolicyRuleDscpTos();
            _resultValue.codepoints = codepoints;
            return _resultValue;
        }
    }
}
