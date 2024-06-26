# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SiteArgs', 'Site']

@pulumi.input_type
class SiteArgs:
    def __init__(__self__, *,
                 config: pulumi.Input[str],
                 is_deployed: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Site resource.
        :param pulumi.Input[str] config: The filesystem path of the site's JSON config.
        :param pulumi.Input[bool] is_deployed: This will be set to false if the site config deployed does not match the given config file.
        :param pulumi.Input[str] timeout: Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
        """
        pulumi.set(__self__, "config", config)
        if is_deployed is not None:
            pulumi.set(__self__, "is_deployed", is_deployed)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Input[str]:
        """
        The filesystem path of the site's JSON config.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: pulumi.Input[str]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="isDeployed")
    def is_deployed(self) -> Optional[pulumi.Input[bool]]:
        """
        This will be set to false if the site config deployed does not match the given config file.
        """
        return pulumi.get(self, "is_deployed")

    @is_deployed.setter
    def is_deployed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_deployed", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[str]]:
        """
        Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timeout", value)


@pulumi.input_type
class _SiteState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[str]] = None,
                 is_deployed: Optional[pulumi.Input[bool]] = None,
                 tfid: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Site resources.
        :param pulumi.Input[str] config: The filesystem path of the site's JSON config.
        :param pulumi.Input[bool] is_deployed: This will be set to false if the site config deployed does not match the given config file.
        :param pulumi.Input[str] timeout: Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if is_deployed is not None:
            pulumi.set(__self__, "is_deployed", is_deployed)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        The filesystem path of the site's JSON config.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="isDeployed")
    def is_deployed(self) -> Optional[pulumi.Input[bool]]:
        """
        This will be set to false if the site config deployed does not match the given config file.
        """
        return pulumi.get(self, "is_deployed")

    @is_deployed.setter
    def is_deployed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_deployed", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[str]]:
        """
        Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timeout", value)


class Site(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 is_deployed: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Prisma SD-WAN site.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_prismasdwan as prismasdwan

        example = prismasdwan.Site("example", config="/Users/jdoe/sdwan_configs/site1.yaml")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: The filesystem path of the site's JSON config.
        :param pulumi.Input[bool] is_deployed: This will be set to false if the site config deployed does not match the given config file.
        :param pulumi.Input[str] timeout: Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SiteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Prisma SD-WAN site.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_prismasdwan as prismasdwan

        example = prismasdwan.Site("example", config="/Users/jdoe/sdwan_configs/site1.yaml")
        ```

        :param str resource_name: The name of the resource.
        :param SiteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SiteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 is_deployed: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SiteArgs.__new__(SiteArgs)

            if config is None and not opts.urn:
                raise TypeError("Missing required property 'config'")
            __props__.__dict__["config"] = config
            __props__.__dict__["is_deployed"] = is_deployed
            __props__.__dict__["timeout"] = timeout
            __props__.__dict__["tfid"] = None
        super(Site, __self__).__init__(
            'prismasdwan:index/site:Site',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[str]] = None,
            is_deployed: Optional[pulumi.Input[bool]] = None,
            tfid: Optional[pulumi.Input[str]] = None,
            timeout: Optional[pulumi.Input[str]] = None) -> 'Site':
        """
        Get an existing Site resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: The filesystem path of the site's JSON config.
        :param pulumi.Input[bool] is_deployed: This will be set to false if the site config deployed does not match the given config file.
        :param pulumi.Input[str] timeout: Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SiteState.__new__(_SiteState)

        __props__.__dict__["config"] = config
        __props__.__dict__["is_deployed"] = is_deployed
        __props__.__dict__["tfid"] = tfid
        __props__.__dict__["timeout"] = timeout
        return Site(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[str]:
        """
        The filesystem path of the site's JSON config.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="isDeployed")
    def is_deployed(self) -> pulumi.Output[bool]:
        """
        This will be set to false if the site config deployed does not match the given config file.
        """
        return pulumi.get(self, "is_deployed")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[str]:
        """
        Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
        """
        return pulumi.get(self, "timeout")

