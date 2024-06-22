// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DnsSecurityProfileBotnetDomainsSinkhole {
    /**
     * @return The Ipv4Address param. String must be one of these: `&#34;127.0.0.1&#34;`, `&#34;pan-sinkhole-default-ip&#34;`.
     * 
     */
    private @Nullable String ipv4Address;
    /**
     * @return The Ipv6Address param. String must be one of these: `&#34;::1&#34;`.
     * 
     */
    private @Nullable String ipv6Address;

    private DnsSecurityProfileBotnetDomainsSinkhole() {}
    /**
     * @return The Ipv4Address param. String must be one of these: `&#34;127.0.0.1&#34;`, `&#34;pan-sinkhole-default-ip&#34;`.
     * 
     */
    public Optional<String> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }
    /**
     * @return The Ipv6Address param. String must be one of these: `&#34;::1&#34;`.
     * 
     */
    public Optional<String> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSecurityProfileBotnetDomainsSinkhole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipv4Address;
        private @Nullable String ipv6Address;
        public Builder() {}
        public Builder(DnsSecurityProfileBotnetDomainsSinkhole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
        }

        @CustomType.Setter
        public Builder ipv4Address(@Nullable String ipv4Address) {

            this.ipv4Address = ipv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(@Nullable String ipv6Address) {

            this.ipv6Address = ipv6Address;
            return this;
        }
        public DnsSecurityProfileBotnetDomainsSinkhole build() {
            final var _resultValue = new DnsSecurityProfileBotnetDomainsSinkhole();
            _resultValue.ipv4Address = ipv4Address;
            _resultValue.ipv6Address = ipv6Address;
            return _resultValue;
        }
    }
}
