// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.AntiSpywareProfileRuleActionBlockIpArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AntiSpywareProfileRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AntiSpywareProfileRuleActionArgs Empty = new AntiSpywareProfileRuleActionArgs();

    /**
     * The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    @Import(name="alert")
    private @Nullable Output<Boolean> alert;

    /**
     * @return The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    public Optional<Output<Boolean>> alert() {
        return Optional.ofNullable(this.alert);
    }

    /**
     * The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    @Import(name="allow")
    private @Nullable Output<Boolean> allow;

    /**
     * @return The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    public Optional<Output<Boolean>> allow() {
        return Optional.ofNullable(this.allow);
    }

    /**
     * The BlockIp param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    @Import(name="blockIp")
    private @Nullable Output<AntiSpywareProfileRuleActionBlockIpArgs> blockIp;

    /**
     * @return The BlockIp param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    public Optional<Output<AntiSpywareProfileRuleActionBlockIpArgs>> blockIp() {
        return Optional.ofNullable(this.blockIp);
    }

    /**
     * The Drop param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    @Import(name="drop")
    private @Nullable Output<Boolean> drop;

    /**
     * @return The Drop param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    public Optional<Output<Boolean>> drop() {
        return Optional.ofNullable(this.drop);
    }

    /**
     * The ResetBoth param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    @Import(name="resetBoth")
    private @Nullable Output<Boolean> resetBoth;

    /**
     * @return The ResetBoth param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    public Optional<Output<Boolean>> resetBoth() {
        return Optional.ofNullable(this.resetBoth);
    }

    /**
     * The ResetClient param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    @Import(name="resetClient")
    private @Nullable Output<Boolean> resetClient;

    /**
     * @return The ResetClient param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    public Optional<Output<Boolean>> resetClient() {
        return Optional.ofNullable(this.resetClient);
    }

    /**
     * The ResetServer param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    @Import(name="resetServer")
    private @Nullable Output<Boolean> resetServer;

    /**
     * @return The ResetServer param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
     * 
     */
    public Optional<Output<Boolean>> resetServer() {
        return Optional.ofNullable(this.resetServer);
    }

    private AntiSpywareProfileRuleActionArgs() {}

    private AntiSpywareProfileRuleActionArgs(AntiSpywareProfileRuleActionArgs $) {
        this.alert = $.alert;
        this.allow = $.allow;
        this.blockIp = $.blockIp;
        this.drop = $.drop;
        this.resetBoth = $.resetBoth;
        this.resetClient = $.resetClient;
        this.resetServer = $.resetServer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AntiSpywareProfileRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AntiSpywareProfileRuleActionArgs $;

        public Builder() {
            $ = new AntiSpywareProfileRuleActionArgs();
        }

        public Builder(AntiSpywareProfileRuleActionArgs defaults) {
            $ = new AntiSpywareProfileRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alert The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder alert(@Nullable Output<Boolean> alert) {
            $.alert = alert;
            return this;
        }

        /**
         * @param alert The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder alert(Boolean alert) {
            return alert(Output.of(alert));
        }

        /**
         * @param allow The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder allow(@Nullable Output<Boolean> allow) {
            $.allow = allow;
            return this;
        }

        /**
         * @param allow The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder allow(Boolean allow) {
            return allow(Output.of(allow));
        }

        /**
         * @param blockIp The BlockIp param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder blockIp(@Nullable Output<AntiSpywareProfileRuleActionBlockIpArgs> blockIp) {
            $.blockIp = blockIp;
            return this;
        }

        /**
         * @param blockIp The BlockIp param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder blockIp(AntiSpywareProfileRuleActionBlockIpArgs blockIp) {
            return blockIp(Output.of(blockIp));
        }

        /**
         * @param drop The Drop param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder drop(@Nullable Output<Boolean> drop) {
            $.drop = drop;
            return this;
        }

        /**
         * @param drop The Drop param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder drop(Boolean drop) {
            return drop(Output.of(drop));
        }

        /**
         * @param resetBoth The ResetBoth param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder resetBoth(@Nullable Output<Boolean> resetBoth) {
            $.resetBoth = resetBoth;
            return this;
        }

        /**
         * @param resetBoth The ResetBoth param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder resetBoth(Boolean resetBoth) {
            return resetBoth(Output.of(resetBoth));
        }

        /**
         * @param resetClient The ResetClient param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder resetClient(@Nullable Output<Boolean> resetClient) {
            $.resetClient = resetClient;
            return this;
        }

        /**
         * @param resetClient The ResetClient param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder resetClient(Boolean resetClient) {
            return resetClient(Output.of(resetClient));
        }

        /**
         * @param resetServer The ResetServer param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder resetServer(@Nullable Output<Boolean> resetServer) {
            $.resetServer = resetServer;
            return this;
        }

        /**
         * @param resetServer The ResetServer param. Ensure that only one of the following is specified: `alert`, `allow`, `block_ip`, `drop`, `reset_both`, `reset_client`, `reset_server`
         * 
         * @return builder
         * 
         */
        public Builder resetServer(Boolean resetServer) {
            return resetServer(Output.of(resetServer));
        }

        public AntiSpywareProfileRuleActionArgs build() {
            return $;
        }
    }

}
