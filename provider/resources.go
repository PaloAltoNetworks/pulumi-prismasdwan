// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package provider

import (
	"fmt"
	"path/filepath"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"

	"github.com/paloaltonetworks/pulumi-prismasdwan/provider/pkg/version"
	"github.com/paloaltonetworks/terraform-provider-prismasdwan/prismasdwan"
)

//go:embed cmd/pulumi-resource-prismasdwan/bridge-metadata.json
var bridgeMetadata []byte

// all of the token components used below.
const (
	mainPkg = "prismasdwan"
	mainMod = "index"
)

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pf.ShimProvider(prismasdwan.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "prismasdwan",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Prisma SD-WAN",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL:     "https://raw.githubusercontent.com/paloaltonetworks/pulumi-prismasdwan/main/docs/logo.png",
		Description: "A Pulumi package for managing resources for Prisma SD-WAN.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords: []string{
			"pulumi",
			"prismasdwan",
			"paloaltonetworks",
			"category/network",
		},
		License:    "Apache-2.0",
		Homepage:   "https://www.paloaltonetworks.com/sase/sd-wan",
		Repository: "https://github.com/paloaltonetworks/pulumi-prismasdwan",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg:         "PaloAltoNetworks",
		UpstreamRepoPath:  "./upstream",
		MetadataInfo:      tfbridge.NewProviderMetadata(bridgeMetadata),
		TFProviderVersion: "0.1.0",
		Version:           version.Version,
		Config:            map[string]*tfbridge.SchemaInfo{},
		Resources:         map[string]*tfbridge.ResourceInfo{},
		DataSources:       map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/prismasdwan",

			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
				Requires: map[string]string{
					"pulumi": ">=3.0.0,<4.0.0",
				},
			}
			i.PyProject.Enabled = true
			return i
		})(),
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/paloaltonetworks/pulumi-%[1]s/sdk/", "prismasdwan"),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				"prismasdwan",
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.pulumi",
		},
	}

	prov.MustComputeTokens(
		tfbridgetokens.SingleModule(
			"prismasdwan",
			mainMod,
			tfbridgetokens.MakeStandard(mainPkg),
		),
	)

	prov.SetAutonaming(255, "-")
	prov.MustApplyAutoAliases()

	return prov
}
