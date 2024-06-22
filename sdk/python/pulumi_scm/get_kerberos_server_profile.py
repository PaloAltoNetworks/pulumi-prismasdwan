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

__all__ = [
    'GetKerberosServerProfileResult',
    'AwaitableGetKerberosServerProfileResult',
    'get_kerberos_server_profile',
    'get_kerberos_server_profile_output',
]

@pulumi.output_type
class GetKerberosServerProfileResult:
    """
    A collection of values returned by getKerberosServerProfile.
    """
    def __init__(__self__, id=None, servers=None, tfid=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if servers and not isinstance(servers, list):
            raise TypeError("Expected argument 'servers' to be a list")
        pulumi.set(__self__, "servers", servers)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def servers(self) -> Sequence['outputs.GetKerberosServerProfileServerResult']:
        """
        The Servers param.
        """
        return pulumi.get(self, "servers")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")


class AwaitableGetKerberosServerProfileResult(GetKerberosServerProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKerberosServerProfileResult(
            id=self.id,
            servers=self.servers,
            tfid=self.tfid)


def get_kerberos_server_profile(id: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKerberosServerProfileResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_kerberos_server_profile(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getKerberosServerProfile:getKerberosServerProfile', __args__, opts=opts, typ=GetKerberosServerProfileResult).value

    return AwaitableGetKerberosServerProfileResult(
        id=pulumi.get(__ret__, 'id'),
        servers=pulumi.get(__ret__, 'servers'),
        tfid=pulumi.get(__ret__, 'tfid'))


@_utilities.lift_output_func(get_kerberos_server_profile)
def get_kerberos_server_profile_output(id: Optional[pulumi.Input[str]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKerberosServerProfileResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_kerberos_server_profile(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    ...
