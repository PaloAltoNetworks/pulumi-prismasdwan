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
    public sealed class GetExternalDynamicListTypeDomainRecurringResult
    {
        /// <summary>
        /// The Daily param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListTypeDomainRecurringDailyResult Daily;
        /// <summary>
        /// The FiveMinute param.
        /// </summary>
        public readonly bool FiveMinute;
        /// <summary>
        /// The Hourly param.
        /// </summary>
        public readonly bool Hourly;
        /// <summary>
        /// The Monthly param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListTypeDomainRecurringMonthlyResult Monthly;
        /// <summary>
        /// The Weekly param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListTypeDomainRecurringWeeklyResult Weekly;

        [OutputConstructor]
        private GetExternalDynamicListTypeDomainRecurringResult(
            Outputs.GetExternalDynamicListTypeDomainRecurringDailyResult daily,

            bool fiveMinute,

            bool hourly,

            Outputs.GetExternalDynamicListTypeDomainRecurringMonthlyResult monthly,

            Outputs.GetExternalDynamicListTypeDomainRecurringWeeklyResult weekly)
        {
            Daily = daily;
            FiveMinute = fiveMinute;
            Hourly = hourly;
            Monthly = monthly;
            Weekly = weekly;
        }
    }
}
