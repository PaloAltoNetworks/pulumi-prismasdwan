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
    public sealed class GetIpsecCryptoProfileListDataLifesizeResult
    {
        /// <summary>
        /// specify lifesize in gigabytes(GB). Value must be between 1 and 65535.
        /// </summary>
        public readonly int Gb;
        /// <summary>
        /// specify lifesize in kilobytes(KB). Value must be between 1 and 65535.
        /// </summary>
        public readonly int Kb;
        /// <summary>
        /// specify lifesize in megabytes(MB). Value must be between 1 and 65535.
        /// </summary>
        public readonly int Mb;
        /// <summary>
        /// specify lifesize in terabytes(TB). Value must be between 1 and 65535.
        /// </summary>
        public readonly int Tb;

        [OutputConstructor]
        private GetIpsecCryptoProfileListDataLifesizeResult(
            int gb,

            int kb,

            int mb,

            int tb)
        {
            Gb = gb;
            Kb = kb;
            Mb = mb;
            Tb = tb;
        }
    }
}
