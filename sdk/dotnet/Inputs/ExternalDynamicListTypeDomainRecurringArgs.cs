// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ExternalDynamicListTypeDomainRecurringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Daily param. Ensure that only one of the following is specified: `daily`, `five_minute`, `hourly`, `monthly`, `weekly`
        /// </summary>
        [Input("daily")]
        public Input<Inputs.ExternalDynamicListTypeDomainRecurringDailyArgs>? Daily { get; set; }

        /// <summary>
        /// The FiveMinute param. Ensure that only one of the following is specified: `daily`, `five_minute`, `hourly`, `monthly`, `weekly`
        /// </summary>
        [Input("fiveMinute")]
        public Input<bool>? FiveMinute { get; set; }

        /// <summary>
        /// The Hourly param. Ensure that only one of the following is specified: `daily`, `five_minute`, `hourly`, `monthly`, `weekly`
        /// </summary>
        [Input("hourly")]
        public Input<bool>? Hourly { get; set; }

        /// <summary>
        /// The Monthly param. Ensure that only one of the following is specified: `daily`, `five_minute`, `hourly`, `monthly`, `weekly`
        /// </summary>
        [Input("monthly")]
        public Input<Inputs.ExternalDynamicListTypeDomainRecurringMonthlyArgs>? Monthly { get; set; }

        /// <summary>
        /// The Weekly param. Ensure that only one of the following is specified: `daily`, `five_minute`, `hourly`, `monthly`, `weekly`
        /// </summary>
        [Input("weekly")]
        public Input<Inputs.ExternalDynamicListTypeDomainRecurringWeeklyArgs>? Weekly { get; set; }

        public ExternalDynamicListTypeDomainRecurringArgs()
        {
        }
        public static new ExternalDynamicListTypeDomainRecurringArgs Empty => new ExternalDynamicListTypeDomainRecurringArgs();
    }
}
