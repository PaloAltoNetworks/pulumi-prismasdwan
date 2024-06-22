// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetIpsecTunnelListData;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpsecTunnelListResult {
    /**
     * @return The Data param.
     * 
     */
    private List<GetIpsecTunnelListData> datas;
    /**
     * @return The Device param.
     * 
     */
    private @Nullable String device;
    /**
     * @return The Folder param.
     * 
     */
    private @Nullable String folder;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Limit param. A limit of -1 will return all configured items. Default: `200`.
     * 
     */
    private Integer limit;
    /**
     * @return The Name param.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Offset param. Default: `0`.
     * 
     */
    private Integer offset;
    /**
     * @return The Snippet param.
     * 
     */
    private @Nullable String snippet;
    private String tfid;
    /**
     * @return The Total param.
     * 
     */
    private Integer total;

    private GetIpsecTunnelListResult() {}
    /**
     * @return The Data param.
     * 
     */
    public List<GetIpsecTunnelListData> datas() {
        return this.datas;
    }
    /**
     * @return The Device param.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The Folder param.
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Limit param. A limit of -1 will return all configured items. Default: `200`.
     * 
     */
    public Integer limit() {
        return this.limit;
    }
    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Offset param. Default: `0`.
     * 
     */
    public Integer offset() {
        return this.offset;
    }
    /**
     * @return The Snippet param.
     * 
     */
    public Optional<String> snippet() {
        return Optional.ofNullable(this.snippet);
    }
    public String tfid() {
        return this.tfid;
    }
    /**
     * @return The Total param.
     * 
     */
    public Integer total() {
        return this.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecTunnelListResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetIpsecTunnelListData> datas;
        private @Nullable String device;
        private @Nullable String folder;
        private String id;
        private Integer limit;
        private @Nullable String name;
        private Integer offset;
        private @Nullable String snippet;
        private String tfid;
        private Integer total;
        public Builder() {}
        public Builder(GetIpsecTunnelListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datas = defaults.datas;
    	      this.device = defaults.device;
    	      this.folder = defaults.folder;
    	      this.id = defaults.id;
    	      this.limit = defaults.limit;
    	      this.name = defaults.name;
    	      this.offset = defaults.offset;
    	      this.snippet = defaults.snippet;
    	      this.tfid = defaults.tfid;
    	      this.total = defaults.total;
        }

        @CustomType.Setter
        public Builder datas(List<GetIpsecTunnelListData> datas) {
            if (datas == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListResult", "datas");
            }
            this.datas = datas;
            return this;
        }
        public Builder datas(GetIpsecTunnelListData... datas) {
            return datas(List.of(datas));
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {

            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder folder(@Nullable String folder) {

            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder limit(Integer limit) {
            if (limit == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListResult", "limit");
            }
            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder offset(Integer offset) {
            if (offset == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListResult", "offset");
            }
            this.offset = offset;
            return this;
        }
        @CustomType.Setter
        public Builder snippet(@Nullable String snippet) {

            this.snippet = snippet;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder total(Integer total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListResult", "total");
            }
            this.total = total;
            return this;
        }
        public GetIpsecTunnelListResult build() {
            final var _resultValue = new GetIpsecTunnelListResult();
            _resultValue.datas = datas;
            _resultValue.device = device;
            _resultValue.folder = folder;
            _resultValue.id = id;
            _resultValue.limit = limit;
            _resultValue.name = name;
            _resultValue.offset = offset;
            _resultValue.snippet = snippet;
            _resultValue.tfid = tfid;
            _resultValue.total = total;
            return _resultValue;
        }
    }
}
