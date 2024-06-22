// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetRegionListDataResult
    {
        /// <summary>
        /// The Addresses param.
        /// </summary>
        public readonly ImmutableArray<string> Addresses;
        /// <summary>
        /// The GeoLocation param.
        /// </summary>
        public readonly Outputs.GetRegionListDataGeoLocationResult GeoLocation;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetRegionListDataResult(
            ImmutableArray<string> addresses,

            Outputs.GetRegionListDataGeoLocationResult geoLocation,

            string id,

            string name)
        {
            Addresses = addresses;
            GeoLocation = geoLocation;
            Id = id;
            Name = name;
        }
    }
}
