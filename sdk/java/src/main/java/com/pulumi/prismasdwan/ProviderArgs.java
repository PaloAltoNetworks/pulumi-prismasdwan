// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.prismasdwan;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The file path to the JSON file with auth creds for SCM.
     * 
     */
    @Import(name="authFile")
    private @Nullable Output<String> authFile;

    /**
     * @return The file path to the JSON file with auth creds for SCM.
     * 
     */
    public Optional<Output<String>> authFile() {
        return Optional.ofNullable(this.authFile);
    }

    /**
     * The URL to send auth credentials to which will return a JWT. Default:
     * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
     * file variable: `auth_url`.
     * 
     */
    @Import(name="authUrl")
    private @Nullable Output<String> authUrl;

    /**
     * @return The URL to send auth credentials to which will return a JWT. Default:
     * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
     * file variable: `auth_url`.
     * 
     */
    public Optional<Output<String>> authUrl() {
        return Optional.ofNullable(this.authUrl);
    }

    /**
     * The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
     * `client_secret`.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
     * `client_secret`.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
     * JSON config file variable: `host`.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
     * JSON config file variable: `host`.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
     * `SCM_LOGGING`. JSON config file variable: `logging`.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<String> logging;

    /**
     * @return The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
     * `SCM_LOGGING`. JSON config file variable: `logging`.
     * 
     */
    public Optional<Output<String>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * The port number for API operations, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
     * config file variable: `port`.
     * 
     */
    @Import(name="port", json=true)
    private @Nullable Output<Integer> port;

    /**
     * @return The port number for API operations, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
     * config file variable: `port`.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
     * `protocol`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
     * `protocol`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.authFile = $.authFile;
        this.authUrl = $.authUrl;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.host = $.host;
        this.logging = $.logging;
        this.port = $.port;
        this.protocol = $.protocol;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authFile The file path to the JSON file with auth creds for SCM.
         * 
         * @return builder
         * 
         */
        public Builder authFile(@Nullable Output<String> authFile) {
            $.authFile = authFile;
            return this;
        }

        /**
         * @param authFile The file path to the JSON file with auth creds for SCM.
         * 
         * @return builder
         * 
         */
        public Builder authFile(String authFile) {
            return authFile(Output.of(authFile));
        }

        /**
         * @param authUrl The URL to send auth credentials to which will return a JWT. Default:
         * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
         * file variable: `auth_url`.
         * 
         * @return builder
         * 
         */
        public Builder authUrl(@Nullable Output<String> authUrl) {
            $.authUrl = authUrl;
            return this;
        }

        /**
         * @param authUrl The URL to send auth credentials to which will return a JWT. Default:
         * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
         * file variable: `auth_url`.
         * 
         * @return builder
         * 
         */
        public Builder authUrl(String authUrl) {
            return authUrl(Output.of(authUrl));
        }

        /**
         * @param clientId The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
         * `client_secret`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
         * `client_secret`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param host The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
         * JSON config file variable: `host`.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
         * JSON config file variable: `host`.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param logging The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
         * `SCM_LOGGING`. JSON config file variable: `logging`.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<String> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
         * `SCM_LOGGING`. JSON config file variable: `logging`.
         * 
         * @return builder
         * 
         */
        public Builder logging(String logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param port The port number for API operations, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
         * config file variable: `port`.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number for API operations, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
         * config file variable: `port`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
         * `protocol`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
         * `protocol`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param scope The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
