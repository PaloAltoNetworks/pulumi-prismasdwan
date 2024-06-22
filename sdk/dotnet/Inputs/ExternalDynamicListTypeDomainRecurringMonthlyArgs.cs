// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ExternalDynamicListTypeDomainRecurringMonthlyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `"00"`.
        /// </summary>
        [Input("at")]
        public Input<string>? At { get; set; }

        /// <summary>
        /// The DayOfMonth param. Value must be between 1 and 31.
        /// </summary>
        [Input("dayOfMonth", required: true)]
        public Input<int> DayOfMonth { get; set; } = null!;

        public ExternalDynamicListTypeDomainRecurringMonthlyArgs()
        {
        }
        public static new ExternalDynamicListTypeDomainRecurringMonthlyArgs Empty => new ExternalDynamicListTypeDomainRecurringMonthlyArgs();
    }
}
