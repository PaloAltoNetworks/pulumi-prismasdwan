// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.AuthenticationProfileMethodCloudArgs;
import com.pulumi.scm.inputs.AuthenticationProfileMethodKerberosArgs;
import com.pulumi.scm.inputs.AuthenticationProfileMethodLdapArgs;
import com.pulumi.scm.inputs.AuthenticationProfileMethodRadiusArgs;
import com.pulumi.scm.inputs.AuthenticationProfileMethodSamlIdpArgs;
import com.pulumi.scm.inputs.AuthenticationProfileMethodTacplusArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationProfileMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationProfileMethodArgs Empty = new AuthenticationProfileMethodArgs();

    /**
     * The Cloud param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    @Import(name="cloud")
    private @Nullable Output<AuthenticationProfileMethodCloudArgs> cloud;

    /**
     * @return The Cloud param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    public Optional<Output<AuthenticationProfileMethodCloudArgs>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * The Kerberos param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    @Import(name="kerberos")
    private @Nullable Output<AuthenticationProfileMethodKerberosArgs> kerberos;

    /**
     * @return The Kerberos param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    public Optional<Output<AuthenticationProfileMethodKerberosArgs>> kerberos() {
        return Optional.ofNullable(this.kerberos);
    }

    /**
     * The Ldap param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    @Import(name="ldap")
    private @Nullable Output<AuthenticationProfileMethodLdapArgs> ldap;

    /**
     * @return The Ldap param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    public Optional<Output<AuthenticationProfileMethodLdapArgs>> ldap() {
        return Optional.ofNullable(this.ldap);
    }

    /**
     * The LocalDatabase param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    @Import(name="localDatabase")
    private @Nullable Output<Boolean> localDatabase;

    /**
     * @return The LocalDatabase param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    public Optional<Output<Boolean>> localDatabase() {
        return Optional.ofNullable(this.localDatabase);
    }

    /**
     * The Radius param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    @Import(name="radius")
    private @Nullable Output<AuthenticationProfileMethodRadiusArgs> radius;

    /**
     * @return The Radius param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    public Optional<Output<AuthenticationProfileMethodRadiusArgs>> radius() {
        return Optional.ofNullable(this.radius);
    }

    /**
     * The SamlIdp param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    @Import(name="samlIdp")
    private @Nullable Output<AuthenticationProfileMethodSamlIdpArgs> samlIdp;

    /**
     * @return The SamlIdp param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    public Optional<Output<AuthenticationProfileMethodSamlIdpArgs>> samlIdp() {
        return Optional.ofNullable(this.samlIdp);
    }

    /**
     * The Tacplus param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    @Import(name="tacplus")
    private @Nullable Output<AuthenticationProfileMethodTacplusArgs> tacplus;

    /**
     * @return The Tacplus param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
     * 
     */
    public Optional<Output<AuthenticationProfileMethodTacplusArgs>> tacplus() {
        return Optional.ofNullable(this.tacplus);
    }

    private AuthenticationProfileMethodArgs() {}

    private AuthenticationProfileMethodArgs(AuthenticationProfileMethodArgs $) {
        this.cloud = $.cloud;
        this.kerberos = $.kerberos;
        this.ldap = $.ldap;
        this.localDatabase = $.localDatabase;
        this.radius = $.radius;
        this.samlIdp = $.samlIdp;
        this.tacplus = $.tacplus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationProfileMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationProfileMethodArgs $;

        public Builder() {
            $ = new AuthenticationProfileMethodArgs();
        }

        public Builder(AuthenticationProfileMethodArgs defaults) {
            $ = new AuthenticationProfileMethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloud The Cloud param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder cloud(@Nullable Output<AuthenticationProfileMethodCloudArgs> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The Cloud param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder cloud(AuthenticationProfileMethodCloudArgs cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param kerberos The Kerberos param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder kerberos(@Nullable Output<AuthenticationProfileMethodKerberosArgs> kerberos) {
            $.kerberos = kerberos;
            return this;
        }

        /**
         * @param kerberos The Kerberos param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder kerberos(AuthenticationProfileMethodKerberosArgs kerberos) {
            return kerberos(Output.of(kerberos));
        }

        /**
         * @param ldap The Ldap param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder ldap(@Nullable Output<AuthenticationProfileMethodLdapArgs> ldap) {
            $.ldap = ldap;
            return this;
        }

        /**
         * @param ldap The Ldap param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder ldap(AuthenticationProfileMethodLdapArgs ldap) {
            return ldap(Output.of(ldap));
        }

        /**
         * @param localDatabase The LocalDatabase param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder localDatabase(@Nullable Output<Boolean> localDatabase) {
            $.localDatabase = localDatabase;
            return this;
        }

        /**
         * @param localDatabase The LocalDatabase param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder localDatabase(Boolean localDatabase) {
            return localDatabase(Output.of(localDatabase));
        }

        /**
         * @param radius The Radius param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder radius(@Nullable Output<AuthenticationProfileMethodRadiusArgs> radius) {
            $.radius = radius;
            return this;
        }

        /**
         * @param radius The Radius param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder radius(AuthenticationProfileMethodRadiusArgs radius) {
            return radius(Output.of(radius));
        }

        /**
         * @param samlIdp The SamlIdp param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder samlIdp(@Nullable Output<AuthenticationProfileMethodSamlIdpArgs> samlIdp) {
            $.samlIdp = samlIdp;
            return this;
        }

        /**
         * @param samlIdp The SamlIdp param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder samlIdp(AuthenticationProfileMethodSamlIdpArgs samlIdp) {
            return samlIdp(Output.of(samlIdp));
        }

        /**
         * @param tacplus The Tacplus param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder tacplus(@Nullable Output<AuthenticationProfileMethodTacplusArgs> tacplus) {
            $.tacplus = tacplus;
            return this;
        }

        /**
         * @param tacplus The Tacplus param. Ensure that only one of the following is specified: `cloud`, `kerberos`, `ldap`, `local_database`, `radius`, `saml_idp`, `tacplus`
         * 
         * @return builder
         * 
         */
        public Builder tacplus(AuthenticationProfileMethodTacplusArgs tacplus) {
            return tacplus(Output.of(tacplus));
        }

        public AuthenticationProfileMethodArgs build() {
            return $;
        }
    }

}
