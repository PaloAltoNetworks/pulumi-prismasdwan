// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TacacsServerProfileServer {
    /**
     * @return The Address param.
     * 
     */
    private @Nullable String address;
    /**
     * @return The Name param.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Port param. Value must be between 1 and 65535.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The Secret param. String length must not exceed 64 characters.
     * 
     */
    private @Nullable String secret;

    private TacacsServerProfileServer() {}
    /**
     * @return The Address param.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Port param. Value must be between 1 and 65535.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The Secret param. String length must not exceed 64 characters.
     * 
     */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TacacsServerProfileServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String name;
        private @Nullable Integer port;
        private @Nullable String secret;
        public Builder() {}
        public Builder(TacacsServerProfileServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {

            this.secret = secret;
            return this;
        }
        public TacacsServerProfileServer build() {
            final var _resultValue = new TacacsServerProfileServer();
            _resultValue.address = address;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
