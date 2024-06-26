// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package prismasdwan

import (
	"context"
	"reflect"

	"errors"
	"github.com/paloaltonetworks/pulumi-prismasdwan/sdk/go/prismasdwan/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Prisma SD-WAN site.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/paloaltonetworks/pulumi-prismasdwan/sdk/go/prismasdwan"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := prismasdwan.NewSite(ctx, "example", &prismasdwan.SiteArgs{
//				Config: pulumi.String("/Users/jdoe/sdwan_configs/site1.yaml"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Site struct {
	pulumi.CustomResourceState

	// The filesystem path of the site's JSON config.
	Config pulumi.StringOutput `pulumi:"config"`
	// This will be set to false if the site config deployed does not match the given config file.
	IsDeployed pulumi.BoolOutput   `pulumi:"isDeployed"`
	Tfid       pulumi.StringOutput `pulumi:"tfid"`
	// Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
	Timeout pulumi.StringOutput `pulumi:"timeout"`
}

// NewSite registers a new resource with the given unique name, arguments, and options.
func NewSite(ctx *pulumi.Context,
	name string, args *SiteArgs, opts ...pulumi.ResourceOption) (*Site, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Site
	err := ctx.RegisterResource("prismasdwan:index/site:Site", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSite gets an existing Site resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSite(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SiteState, opts ...pulumi.ResourceOption) (*Site, error) {
	var resource Site
	err := ctx.ReadResource("prismasdwan:index/site:Site", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Site resources.
type siteState struct {
	// The filesystem path of the site's JSON config.
	Config *string `pulumi:"config"`
	// This will be set to false if the site config deployed does not match the given config file.
	IsDeployed *bool   `pulumi:"isDeployed"`
	Tfid       *string `pulumi:"tfid"`
	// Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
	Timeout *string `pulumi:"timeout"`
}

type SiteState struct {
	// The filesystem path of the site's JSON config.
	Config pulumi.StringPtrInput
	// This will be set to false if the site config deployed does not match the given config file.
	IsDeployed pulumi.BoolPtrInput
	Tfid       pulumi.StringPtrInput
	// Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
	Timeout pulumi.StringPtrInput
}

func (SiteState) ElementType() reflect.Type {
	return reflect.TypeOf((*siteState)(nil)).Elem()
}

type siteArgs struct {
	// The filesystem path of the site's JSON config.
	Config string `pulumi:"config"`
	// This will be set to false if the site config deployed does not match the given config file.
	IsDeployed *bool `pulumi:"isDeployed"`
	// Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
	Timeout *string `pulumi:"timeout"`
}

// The set of arguments for constructing a Site resource.
type SiteArgs struct {
	// The filesystem path of the site's JSON config.
	Config pulumi.StringInput
	// This will be set to false if the site config deployed does not match the given config file.
	IsDeployed pulumi.BoolPtrInput
	// Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
	Timeout pulumi.StringPtrInput
}

func (SiteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*siteArgs)(nil)).Elem()
}

type SiteInput interface {
	pulumi.Input

	ToSiteOutput() SiteOutput
	ToSiteOutputWithContext(ctx context.Context) SiteOutput
}

func (*Site) ElementType() reflect.Type {
	return reflect.TypeOf((**Site)(nil)).Elem()
}

func (i *Site) ToSiteOutput() SiteOutput {
	return i.ToSiteOutputWithContext(context.Background())
}

func (i *Site) ToSiteOutputWithContext(ctx context.Context) SiteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SiteOutput)
}

// SiteArrayInput is an input type that accepts SiteArray and SiteArrayOutput values.
// You can construct a concrete instance of `SiteArrayInput` via:
//
//	SiteArray{ SiteArgs{...} }
type SiteArrayInput interface {
	pulumi.Input

	ToSiteArrayOutput() SiteArrayOutput
	ToSiteArrayOutputWithContext(context.Context) SiteArrayOutput
}

type SiteArray []SiteInput

func (SiteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Site)(nil)).Elem()
}

func (i SiteArray) ToSiteArrayOutput() SiteArrayOutput {
	return i.ToSiteArrayOutputWithContext(context.Background())
}

func (i SiteArray) ToSiteArrayOutputWithContext(ctx context.Context) SiteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SiteArrayOutput)
}

// SiteMapInput is an input type that accepts SiteMap and SiteMapOutput values.
// You can construct a concrete instance of `SiteMapInput` via:
//
//	SiteMap{ "key": SiteArgs{...} }
type SiteMapInput interface {
	pulumi.Input

	ToSiteMapOutput() SiteMapOutput
	ToSiteMapOutputWithContext(context.Context) SiteMapOutput
}

type SiteMap map[string]SiteInput

func (SiteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Site)(nil)).Elem()
}

func (i SiteMap) ToSiteMapOutput() SiteMapOutput {
	return i.ToSiteMapOutputWithContext(context.Background())
}

func (i SiteMap) ToSiteMapOutputWithContext(ctx context.Context) SiteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SiteMapOutput)
}

type SiteOutput struct{ *pulumi.OutputState }

func (SiteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Site)(nil)).Elem()
}

func (o SiteOutput) ToSiteOutput() SiteOutput {
	return o
}

func (o SiteOutput) ToSiteOutputWithContext(ctx context.Context) SiteOutput {
	return o
}

// The filesystem path of the site's JSON config.
func (o SiteOutput) Config() pulumi.StringOutput {
	return o.ApplyT(func(v *Site) pulumi.StringOutput { return v.Config }).(pulumi.StringOutput)
}

// This will be set to false if the site config deployed does not match the given config file.
func (o SiteOutput) IsDeployed() pulumi.BoolOutput {
	return o.ApplyT(func(v *Site) pulumi.BoolOutput { return v.IsDeployed }).(pulumi.BoolOutput)
}

func (o SiteOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *Site) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

// Timeouts for this resource's operations. A custom timeout is a string that has a number and a units suffix, such as 30s or 1h1m1s. Valid units are "h", "m", or "s". Note that changes to custom timeouts only take effect during resource creation or update. Default: 30m.
func (o SiteOutput) Timeout() pulumi.StringOutput {
	return o.ApplyT(func(v *Site) pulumi.StringOutput { return v.Timeout }).(pulumi.StringOutput)
}

type SiteArrayOutput struct{ *pulumi.OutputState }

func (SiteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Site)(nil)).Elem()
}

func (o SiteArrayOutput) ToSiteArrayOutput() SiteArrayOutput {
	return o
}

func (o SiteArrayOutput) ToSiteArrayOutputWithContext(ctx context.Context) SiteArrayOutput {
	return o
}

func (o SiteArrayOutput) Index(i pulumi.IntInput) SiteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Site {
		return vs[0].([]*Site)[vs[1].(int)]
	}).(SiteOutput)
}

type SiteMapOutput struct{ *pulumi.OutputState }

func (SiteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Site)(nil)).Elem()
}

func (o SiteMapOutput) ToSiteMapOutput() SiteMapOutput {
	return o
}

func (o SiteMapOutput) ToSiteMapOutputWithContext(ctx context.Context) SiteMapOutput {
	return o
}

func (o SiteMapOutput) MapIndex(k pulumi.StringInput) SiteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Site {
		return vs[0].(map[string]*Site)[vs[1].(string)]
	}).(SiteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SiteInput)(nil)).Elem(), &Site{})
	pulumi.RegisterInputType(reflect.TypeOf((*SiteArrayInput)(nil)).Elem(), SiteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SiteMapInput)(nil)).Elem(), SiteMap{})
	pulumi.RegisterOutputType(SiteOutput{})
	pulumi.RegisterOutputType(SiteArrayOutput{})
	pulumi.RegisterOutputType(SiteMapOutput{})
}
