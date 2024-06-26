// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package prismasdwan

import (
	"context"
	"reflect"

	"github.com/paloaltonetworks/pulumi-prismasdwan/sdk/go/prismasdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the prismasdwan package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The file path to the JSON file with auth creds for SCM.
	AuthFile pulumi.StringPtrOutput `pulumi:"authFile"`
	// The URL to send auth credentials to which will return a JWT. Default:
	// `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
	// file variable: `authUrl`.
	AuthUrl pulumi.StringPtrOutput `pulumi:"authUrl"`
	// The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `clientId`.
	ClientId pulumi.StringPtrOutput `pulumi:"clientId"`
	// The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
	// `clientSecret`.
	ClientSecret pulumi.StringPtrOutput `pulumi:"clientSecret"`
	// The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
	// JSON config file variable: `host`.
	Host pulumi.StringPtrOutput `pulumi:"host"`
	// The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
	// `SCM_LOGGING`. JSON config file variable: `logging`.
	Logging pulumi.StringPtrOutput `pulumi:"logging"`
	// The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
	// `protocol`.
	Protocol pulumi.StringPtrOutput `pulumi:"protocol"`
	// The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
	Scope pulumi.StringPtrOutput `pulumi:"scope"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.ClientSecret != nil {
		args.ClientSecret = pulumi.ToSecret(args.ClientSecret).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clientSecret",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:prismasdwan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The file path to the JSON file with auth creds for SCM.
	AuthFile *string `pulumi:"authFile"`
	// The URL to send auth credentials to which will return a JWT. Default:
	// `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
	// file variable: `authUrl`.
	AuthUrl *string `pulumi:"authUrl"`
	// The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `clientId`.
	ClientId *string `pulumi:"clientId"`
	// The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
	// `clientSecret`.
	ClientSecret *string `pulumi:"clientSecret"`
	// The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
	// JSON config file variable: `host`.
	Host *string `pulumi:"host"`
	// The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
	// `SCM_LOGGING`. JSON config file variable: `logging`.
	Logging *string `pulumi:"logging"`
	// The port number for API operations, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
	// config file variable: `port`.
	Port *int `pulumi:"port"`
	// The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
	// `protocol`.
	Protocol *string `pulumi:"protocol"`
	// The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
	Scope *string `pulumi:"scope"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The file path to the JSON file with auth creds for SCM.
	AuthFile pulumi.StringPtrInput
	// The URL to send auth credentials to which will return a JWT. Default:
	// `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
	// file variable: `authUrl`.
	AuthUrl pulumi.StringPtrInput
	// The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `clientId`.
	ClientId pulumi.StringPtrInput
	// The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
	// `clientSecret`.
	ClientSecret pulumi.StringPtrInput
	// The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
	// JSON config file variable: `host`.
	Host pulumi.StringPtrInput
	// The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
	// `SCM_LOGGING`. JSON config file variable: `logging`.
	Logging pulumi.StringPtrInput
	// The port number for API operations, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
	// config file variable: `port`.
	Port pulumi.IntPtrInput
	// The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
	// `protocol`.
	Protocol pulumi.StringPtrInput
	// The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
	Scope pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The file path to the JSON file with auth creds for SCM.
func (o ProviderOutput) AuthFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AuthFile }).(pulumi.StringPtrOutput)
}

// The URL to send auth credentials to which will return a JWT. Default:
// `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
// file variable: `authUrl`.
func (o ProviderOutput) AuthUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AuthUrl }).(pulumi.StringPtrOutput)
}

// The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `clientId`.
func (o ProviderOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ClientId }).(pulumi.StringPtrOutput)
}

// The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
// `clientSecret`.
func (o ProviderOutput) ClientSecret() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ClientSecret }).(pulumi.StringPtrOutput)
}

// The hostname of Strata Cloud Manager API. Default: `pa-us01.api.prismaaccess.com`. Environment variable: `SCM_HOST`.
// JSON config file variable: `host`.
func (o ProviderOutput) Host() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Host }).(pulumi.StringPtrOutput)
}

// The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
// `SCM_LOGGING`. JSON config file variable: `logging`.
func (o ProviderOutput) Logging() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Logging }).(pulumi.StringPtrOutput)
}

// The protocol (https or http). Default: `https`. Environment variable: `SCM_PROTOCOL`. JSON config file variable:
// `protocol`.
func (o ProviderOutput) Protocol() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Protocol }).(pulumi.StringPtrOutput)
}

// The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
func (o ProviderOutput) Scope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Scope }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}