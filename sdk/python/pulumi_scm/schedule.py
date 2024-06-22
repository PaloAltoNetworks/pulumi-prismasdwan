# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ScheduleArgs', 'Schedule']

@pulumi.input_type
class ScheduleArgs:
    def __init__(__self__, *,
                 schedule_type: pulumi.Input['ScheduleScheduleTypeArgs'],
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Schedule resource.
        :param pulumi.Input['ScheduleScheduleTypeArgs'] schedule_type: The ScheduleType param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        pulumi.set(__self__, "schedule_type", schedule_type)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)

    @property
    @pulumi.getter(name="scheduleType")
    def schedule_type(self) -> pulumi.Input['ScheduleScheduleTypeArgs']:
        """
        The ScheduleType param.
        """
        return pulumi.get(self, "schedule_type")

    @schedule_type.setter
    def schedule_type(self, value: pulumi.Input['ScheduleScheduleTypeArgs']):
        pulumi.set(self, "schedule_type", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snippet", value)


@pulumi.input_type
class _ScheduleState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule_type: Optional[pulumi.Input['ScheduleScheduleTypeArgs']] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 tfid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Schedule resources.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input['ScheduleScheduleTypeArgs'] schedule_type: The ScheduleType param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule_type is not None:
            pulumi.set(__self__, "schedule_type", schedule_type)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="scheduleType")
    def schedule_type(self) -> Optional[pulumi.Input['ScheduleScheduleTypeArgs']]:
        """
        The ScheduleType param.
        """
        return pulumi.get(self, "schedule_type")

    @schedule_type.setter
    def schedule_type(self, value: Optional[pulumi.Input['ScheduleScheduleTypeArgs']]):
        pulumi.set(self, "schedule_type", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snippet", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)


class Schedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule_type: Optional[pulumi.Input[pulumi.InputType['ScheduleScheduleTypeArgs']]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.Schedule("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[pulumi.InputType['ScheduleScheduleTypeArgs']] schedule_type: The ScheduleType param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScheduleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.Schedule("example")
        ```

        :param str resource_name: The name of the resource.
        :param ScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule_type: Optional[pulumi.Input[pulumi.InputType['ScheduleScheduleTypeArgs']]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScheduleArgs.__new__(ScheduleArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["folder"] = folder
            __props__.__dict__["name"] = name
            if schedule_type is None and not opts.urn:
                raise TypeError("Missing required property 'schedule_type'")
            __props__.__dict__["schedule_type"] = schedule_type
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["tfid"] = None
        super(Schedule, __self__).__init__(
            'scm:index/schedule:Schedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            schedule_type: Optional[pulumi.Input[pulumi.InputType['ScheduleScheduleTypeArgs']]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            tfid: Optional[pulumi.Input[str]] = None) -> 'Schedule':
        """
        Get an existing Schedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[pulumi.InputType['ScheduleScheduleTypeArgs']] schedule_type: The ScheduleType param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScheduleState.__new__(_ScheduleState)

        __props__.__dict__["device"] = device
        __props__.__dict__["folder"] = folder
        __props__.__dict__["name"] = name
        __props__.__dict__["schedule_type"] = schedule_type
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["tfid"] = tfid
        return Schedule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="scheduleType")
    def schedule_type(self) -> pulumi.Output['outputs.ScheduleScheduleType']:
        """
        The ScheduleType param.
        """
        return pulumi.get(self, "schedule_type")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[Optional[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

