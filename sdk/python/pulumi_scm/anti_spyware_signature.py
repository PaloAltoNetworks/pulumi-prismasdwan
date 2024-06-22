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

__all__ = ['AntiSpywareSignatureArgs', 'AntiSpywareSignature']

@pulumi.input_type
class AntiSpywareSignatureArgs:
    def __init__(__self__, *,
                 threat_id: pulumi.Input[int],
                 threatname: pulumi.Input[str],
                 bugtraqs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 cves: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_action: Optional[pulumi.Input['AntiSpywareSignatureDefaultActionArgs']] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 references: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input['AntiSpywareSignatureSignatureArgs']] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 vendors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AntiSpywareSignature resource.
        :param pulumi.Input[int] threat_id: threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        :param pulumi.Input[str] threatname: The Threatname param. String length must not exceed 1024 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bugtraqs: The Bugtraqs param.
        :param pulumi.Input[str] comment: The Comment param. String length must not exceed 256 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cves: The Cves param.
        :param pulumi.Input['AntiSpywareSignatureDefaultActionArgs'] default_action: The DefaultAction param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] direction: The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] references: The References param.
        :param pulumi.Input[str] severity: The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        :param pulumi.Input['AntiSpywareSignatureSignatureArgs'] signature: The Signature param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vendors: The Vendors param.
        """
        pulumi.set(__self__, "threat_id", threat_id)
        pulumi.set(__self__, "threatname", threatname)
        if bugtraqs is not None:
            pulumi.set(__self__, "bugtraqs", bugtraqs)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if cves is not None:
            pulumi.set(__self__, "cves", cves)
        if default_action is not None:
            pulumi.set(__self__, "default_action", default_action)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if direction is not None:
            pulumi.set(__self__, "direction", direction)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if references is not None:
            pulumi.set(__self__, "references", references)
        if severity is not None:
            pulumi.set(__self__, "severity", severity)
        if signature is not None:
            pulumi.set(__self__, "signature", signature)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if vendors is not None:
            pulumi.set(__self__, "vendors", vendors)

    @property
    @pulumi.getter(name="threatId")
    def threat_id(self) -> pulumi.Input[int]:
        """
        threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        """
        return pulumi.get(self, "threat_id")

    @threat_id.setter
    def threat_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "threat_id", value)

    @property
    @pulumi.getter
    def threatname(self) -> pulumi.Input[str]:
        """
        The Threatname param. String length must not exceed 1024 characters.
        """
        return pulumi.get(self, "threatname")

    @threatname.setter
    def threatname(self, value: pulumi.Input[str]):
        pulumi.set(self, "threatname", value)

    @property
    @pulumi.getter
    def bugtraqs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Bugtraqs param.
        """
        return pulumi.get(self, "bugtraqs")

    @bugtraqs.setter
    def bugtraqs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "bugtraqs", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        The Comment param. String length must not exceed 256 characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def cves(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Cves param.
        """
        return pulumi.get(self, "cves")

    @cves.setter
    def cves(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "cves", value)

    @property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> Optional[pulumi.Input['AntiSpywareSignatureDefaultActionArgs']]:
        """
        The DefaultAction param.
        """
        return pulumi.get(self, "default_action")

    @default_action.setter
    def default_action(self, value: Optional[pulumi.Input['AntiSpywareSignatureDefaultActionArgs']]):
        pulumi.set(self, "default_action", value)

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
    def direction(self) -> Optional[pulumi.Input[str]]:
        """
        The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "direction", value)

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
    def references(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The References param.
        """
        return pulumi.get(self, "references")

    @references.setter
    def references(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "references", value)

    @property
    @pulumi.getter
    def severity(self) -> Optional[pulumi.Input[str]]:
        """
        The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        """
        return pulumi.get(self, "severity")

    @severity.setter
    def severity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "severity", value)

    @property
    @pulumi.getter
    def signature(self) -> Optional[pulumi.Input['AntiSpywareSignatureSignatureArgs']]:
        """
        The Signature param.
        """
        return pulumi.get(self, "signature")

    @signature.setter
    def signature(self, value: Optional[pulumi.Input['AntiSpywareSignatureSignatureArgs']]):
        pulumi.set(self, "signature", value)

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
    def vendors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Vendors param.
        """
        return pulumi.get(self, "vendors")

    @vendors.setter
    def vendors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "vendors", value)


@pulumi.input_type
class _AntiSpywareSignatureState:
    def __init__(__self__, *,
                 bugtraqs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 cves: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_action: Optional[pulumi.Input['AntiSpywareSignatureDefaultActionArgs']] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 references: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input['AntiSpywareSignatureSignatureArgs']] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 tfid: Optional[pulumi.Input[str]] = None,
                 threat_id: Optional[pulumi.Input[int]] = None,
                 threatname: Optional[pulumi.Input[str]] = None,
                 vendors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering AntiSpywareSignature resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bugtraqs: The Bugtraqs param.
        :param pulumi.Input[str] comment: The Comment param. String length must not exceed 256 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cves: The Cves param.
        :param pulumi.Input['AntiSpywareSignatureDefaultActionArgs'] default_action: The DefaultAction param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] direction: The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] references: The References param.
        :param pulumi.Input[str] severity: The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        :param pulumi.Input['AntiSpywareSignatureSignatureArgs'] signature: The Signature param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[int] threat_id: threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        :param pulumi.Input[str] threatname: The Threatname param. String length must not exceed 1024 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vendors: The Vendors param.
        """
        if bugtraqs is not None:
            pulumi.set(__self__, "bugtraqs", bugtraqs)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if cves is not None:
            pulumi.set(__self__, "cves", cves)
        if default_action is not None:
            pulumi.set(__self__, "default_action", default_action)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if direction is not None:
            pulumi.set(__self__, "direction", direction)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if references is not None:
            pulumi.set(__self__, "references", references)
        if severity is not None:
            pulumi.set(__self__, "severity", severity)
        if signature is not None:
            pulumi.set(__self__, "signature", signature)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)
        if threat_id is not None:
            pulumi.set(__self__, "threat_id", threat_id)
        if threatname is not None:
            pulumi.set(__self__, "threatname", threatname)
        if vendors is not None:
            pulumi.set(__self__, "vendors", vendors)

    @property
    @pulumi.getter
    def bugtraqs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Bugtraqs param.
        """
        return pulumi.get(self, "bugtraqs")

    @bugtraqs.setter
    def bugtraqs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "bugtraqs", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        The Comment param. String length must not exceed 256 characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def cves(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Cves param.
        """
        return pulumi.get(self, "cves")

    @cves.setter
    def cves(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "cves", value)

    @property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> Optional[pulumi.Input['AntiSpywareSignatureDefaultActionArgs']]:
        """
        The DefaultAction param.
        """
        return pulumi.get(self, "default_action")

    @default_action.setter
    def default_action(self, value: Optional[pulumi.Input['AntiSpywareSignatureDefaultActionArgs']]):
        pulumi.set(self, "default_action", value)

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
    def direction(self) -> Optional[pulumi.Input[str]]:
        """
        The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "direction", value)

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
    def references(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The References param.
        """
        return pulumi.get(self, "references")

    @references.setter
    def references(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "references", value)

    @property
    @pulumi.getter
    def severity(self) -> Optional[pulumi.Input[str]]:
        """
        The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        """
        return pulumi.get(self, "severity")

    @severity.setter
    def severity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "severity", value)

    @property
    @pulumi.getter
    def signature(self) -> Optional[pulumi.Input['AntiSpywareSignatureSignatureArgs']]:
        """
        The Signature param.
        """
        return pulumi.get(self, "signature")

    @signature.setter
    def signature(self, value: Optional[pulumi.Input['AntiSpywareSignatureSignatureArgs']]):
        pulumi.set(self, "signature", value)

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

    @property
    @pulumi.getter(name="threatId")
    def threat_id(self) -> Optional[pulumi.Input[int]]:
        """
        threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        """
        return pulumi.get(self, "threat_id")

    @threat_id.setter
    def threat_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "threat_id", value)

    @property
    @pulumi.getter
    def threatname(self) -> Optional[pulumi.Input[str]]:
        """
        The Threatname param. String length must not exceed 1024 characters.
        """
        return pulumi.get(self, "threatname")

    @threatname.setter
    def threatname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "threatname", value)

    @property
    @pulumi.getter
    def vendors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Vendors param.
        """
        return pulumi.get(self, "vendors")

    @vendors.setter
    def vendors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "vendors", value)


class AntiSpywareSignature(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bugtraqs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 cves: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_action: Optional[pulumi.Input[pulumi.InputType['AntiSpywareSignatureDefaultActionArgs']]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 references: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input[pulumi.InputType['AntiSpywareSignatureSignatureArgs']]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 threat_id: Optional[pulumi.Input[int]] = None,
                 threatname: Optional[pulumi.Input[str]] = None,
                 vendors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.AntiSpywareSignature("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bugtraqs: The Bugtraqs param.
        :param pulumi.Input[str] comment: The Comment param. String length must not exceed 256 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cves: The Cves param.
        :param pulumi.Input[pulumi.InputType['AntiSpywareSignatureDefaultActionArgs']] default_action: The DefaultAction param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] direction: The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] references: The References param.
        :param pulumi.Input[str] severity: The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        :param pulumi.Input[pulumi.InputType['AntiSpywareSignatureSignatureArgs']] signature: The Signature param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[int] threat_id: threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        :param pulumi.Input[str] threatname: The Threatname param. String length must not exceed 1024 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vendors: The Vendors param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AntiSpywareSignatureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.AntiSpywareSignature("example")
        ```

        :param str resource_name: The name of the resource.
        :param AntiSpywareSignatureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AntiSpywareSignatureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bugtraqs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 cves: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_action: Optional[pulumi.Input[pulumi.InputType['AntiSpywareSignatureDefaultActionArgs']]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 references: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input[pulumi.InputType['AntiSpywareSignatureSignatureArgs']]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 threat_id: Optional[pulumi.Input[int]] = None,
                 threatname: Optional[pulumi.Input[str]] = None,
                 vendors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AntiSpywareSignatureArgs.__new__(AntiSpywareSignatureArgs)

            __props__.__dict__["bugtraqs"] = bugtraqs
            __props__.__dict__["comment"] = comment
            __props__.__dict__["cves"] = cves
            __props__.__dict__["default_action"] = default_action
            __props__.__dict__["device"] = device
            __props__.__dict__["direction"] = direction
            __props__.__dict__["folder"] = folder
            __props__.__dict__["references"] = references
            __props__.__dict__["severity"] = severity
            __props__.__dict__["signature"] = signature
            __props__.__dict__["snippet"] = snippet
            if threat_id is None and not opts.urn:
                raise TypeError("Missing required property 'threat_id'")
            __props__.__dict__["threat_id"] = threat_id
            if threatname is None and not opts.urn:
                raise TypeError("Missing required property 'threatname'")
            __props__.__dict__["threatname"] = threatname
            __props__.__dict__["vendors"] = vendors
            __props__.__dict__["tfid"] = None
        super(AntiSpywareSignature, __self__).__init__(
            'scm:index/antiSpywareSignature:AntiSpywareSignature',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bugtraqs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            cves: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            default_action: Optional[pulumi.Input[pulumi.InputType['AntiSpywareSignatureDefaultActionArgs']]] = None,
            device: Optional[pulumi.Input[str]] = None,
            direction: Optional[pulumi.Input[str]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            references: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            severity: Optional[pulumi.Input[str]] = None,
            signature: Optional[pulumi.Input[pulumi.InputType['AntiSpywareSignatureSignatureArgs']]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            tfid: Optional[pulumi.Input[str]] = None,
            threat_id: Optional[pulumi.Input[int]] = None,
            threatname: Optional[pulumi.Input[str]] = None,
            vendors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'AntiSpywareSignature':
        """
        Get an existing AntiSpywareSignature resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bugtraqs: The Bugtraqs param.
        :param pulumi.Input[str] comment: The Comment param. String length must not exceed 256 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cves: The Cves param.
        :param pulumi.Input[pulumi.InputType['AntiSpywareSignatureDefaultActionArgs']] default_action: The DefaultAction param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] direction: The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] references: The References param.
        :param pulumi.Input[str] severity: The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        :param pulumi.Input[pulumi.InputType['AntiSpywareSignatureSignatureArgs']] signature: The Signature param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[int] threat_id: threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        :param pulumi.Input[str] threatname: The Threatname param. String length must not exceed 1024 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vendors: The Vendors param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AntiSpywareSignatureState.__new__(_AntiSpywareSignatureState)

        __props__.__dict__["bugtraqs"] = bugtraqs
        __props__.__dict__["comment"] = comment
        __props__.__dict__["cves"] = cves
        __props__.__dict__["default_action"] = default_action
        __props__.__dict__["device"] = device
        __props__.__dict__["direction"] = direction
        __props__.__dict__["folder"] = folder
        __props__.__dict__["references"] = references
        __props__.__dict__["severity"] = severity
        __props__.__dict__["signature"] = signature
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["tfid"] = tfid
        __props__.__dict__["threat_id"] = threat_id
        __props__.__dict__["threatname"] = threatname
        __props__.__dict__["vendors"] = vendors
        return AntiSpywareSignature(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bugtraqs(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The Bugtraqs param.
        """
        return pulumi.get(self, "bugtraqs")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        The Comment param. String length must not exceed 256 characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def cves(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The Cves param.
        """
        return pulumi.get(self, "cves")

    @property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> pulumi.Output[Optional['outputs.AntiSpywareSignatureDefaultAction']]:
        """
        The DefaultAction param.
        """
        return pulumi.get(self, "default_action")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Output[Optional[str]]:
        """
        The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        """
        return pulumi.get(self, "direction")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def references(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The References param.
        """
        return pulumi.get(self, "references")

    @property
    @pulumi.getter
    def severity(self) -> pulumi.Output[Optional[str]]:
        """
        The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        """
        return pulumi.get(self, "severity")

    @property
    @pulumi.getter
    def signature(self) -> pulumi.Output[Optional['outputs.AntiSpywareSignatureSignature']]:
        """
        The Signature param.
        """
        return pulumi.get(self, "signature")

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

    @property
    @pulumi.getter(name="threatId")
    def threat_id(self) -> pulumi.Output[int]:
        """
        threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        """
        return pulumi.get(self, "threat_id")

    @property
    @pulumi.getter
    def threatname(self) -> pulumi.Output[str]:
        """
        The Threatname param. String length must not exceed 1024 characters.
        """
        return pulumi.get(self, "threatname")

    @property
    @pulumi.getter
    def vendors(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The Vendors param.
        """
        return pulumi.get(self, "vendors")

