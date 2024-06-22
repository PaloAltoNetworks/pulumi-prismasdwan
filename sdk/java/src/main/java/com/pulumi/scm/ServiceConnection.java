// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.ServiceConnectionArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.ServiceConnectionState;
import com.pulumi.scm.outputs.ServiceConnectionBgpPeer;
import com.pulumi.scm.outputs.ServiceConnectionProtocol;
import com.pulumi.scm.outputs.ServiceConnectionQos;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Retrieves a config item.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scm.ServiceConnection;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ServiceConnection("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/serviceConnection:ServiceConnection")
public class ServiceConnection extends com.pulumi.resources.CustomResource {
    /**
     * The BackupSC param.
     * 
     */
    @Export(name="backupSC", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> backupSC;

    /**
     * @return The BackupSC param.
     * 
     */
    public Output<Optional<String>> backupSC() {
        return Codegen.optional(this.backupSC);
    }
    /**
     * The BgpPeer param.
     * 
     */
    @Export(name="bgpPeer", refs={ServiceConnectionBgpPeer.class}, tree="[0]")
    private Output</* @Nullable */ ServiceConnectionBgpPeer> bgpPeer;

    /**
     * @return The BgpPeer param.
     * 
     */
    public Output<Optional<ServiceConnectionBgpPeer>> bgpPeer() {
        return Codegen.optional(this.bgpPeer);
    }
    /**
     * (Internal use) Encrypted values returned from the API.
     * 
     */
    @Export(name="encryptedValues", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> encryptedValues;

    /**
     * @return (Internal use) Encrypted values returned from the API.
     * 
     */
    public Output<Map<String,String>> encryptedValues() {
        return this.encryptedValues;
    }
    /**
     * The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output<String> folder;

    /**
     * @return The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }
    /**
     * The IpsecTunnel param.
     * 
     */
    @Export(name="ipsecTunnel", refs={String.class}, tree="[0]")
    private Output<String> ipsecTunnel;

    /**
     * @return The IpsecTunnel param.
     * 
     */
    public Output<String> ipsecTunnel() {
        return this.ipsecTunnel;
    }
    /**
     * The Name param.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The NatPool param.
     * 
     */
    @Export(name="natPool", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> natPool;

    /**
     * @return The NatPool param.
     * 
     */
    public Output<Optional<String>> natPool() {
        return Codegen.optional(this.natPool);
    }
    /**
     * The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
     * 
     */
    @Export(name="noExportCommunity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> noExportCommunity;

    /**
     * @return The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
     * 
     */
    public Output<Optional<String>> noExportCommunity() {
        return Codegen.optional(this.noExportCommunity);
    }
    /**
     * The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
     * 
     */
    @Export(name="onboardingType", refs={String.class}, tree="[0]")
    private Output<String> onboardingType;

    /**
     * @return The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
     * 
     */
    public Output<String> onboardingType() {
        return this.onboardingType;
    }
    /**
     * The Protocol param.
     * 
     */
    @Export(name="protocol", refs={ServiceConnectionProtocol.class}, tree="[0]")
    private Output</* @Nullable */ ServiceConnectionProtocol> protocol;

    /**
     * @return The Protocol param.
     * 
     */
    public Output<Optional<ServiceConnectionProtocol>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * The Qos param.
     * 
     */
    @Export(name="qos", refs={ServiceConnectionQos.class}, tree="[0]")
    private Output</* @Nullable */ ServiceConnectionQos> qos;

    /**
     * @return The Qos param.
     * 
     */
    public Output<Optional<ServiceConnectionQos>> qos() {
        return Codegen.optional(this.qos);
    }
    /**
     * The Region param.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The Region param.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The SecondaryIpsecTunnel param.
     * 
     */
    @Export(name="secondaryIpsecTunnel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secondaryIpsecTunnel;

    /**
     * @return The SecondaryIpsecTunnel param.
     * 
     */
    public Output<Optional<String>> secondaryIpsecTunnel() {
        return Codegen.optional(this.secondaryIpsecTunnel);
    }
    /**
     * The SourceNat param.
     * 
     */
    @Export(name="sourceNat", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sourceNat;

    /**
     * @return The SourceNat param.
     * 
     */
    public Output<Optional<Boolean>> sourceNat() {
        return Codegen.optional(this.sourceNat);
    }
    /**
     * The Subnets param.
     * 
     */
    @Export(name="subnets", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> subnets;

    /**
     * @return The Subnets param.
     * 
     */
    public Output<Optional<List<String>>> subnets() {
        return Codegen.optional(this.subnets);
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceConnection(String name) {
        this(name, ServiceConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceConnection(String name, ServiceConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceConnection(String name, ServiceConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/serviceConnection:ServiceConnection", name, args == null ? ServiceConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceConnection(String name, Output<String> id, @Nullable ServiceConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/serviceConnection:ServiceConnection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "encryptedValues"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServiceConnection get(String name, Output<String> id, @Nullable ServiceConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceConnection(name, id, state, options);
    }
}
