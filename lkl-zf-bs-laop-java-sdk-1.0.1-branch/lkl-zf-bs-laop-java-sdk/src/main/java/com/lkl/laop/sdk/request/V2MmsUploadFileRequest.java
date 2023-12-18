package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @description 附件上传
 */
public class V2MmsUploadFileRequest extends V2CommRequest {

    /**
     * 接口版本号
     * M
     */
    @JsonProperty("version")
    private String version;

    /**
     * 订单编号
     * M
     * 14位年月日时（24小时制）分秒+8位的随机数（不重复）如：2021020112000012345678
     * 便于后续跟踪排查问题及回调消息匹配
     */
    @JsonProperty("orderNo")
    private String orderNo;

    /**
     * 分账接收方所属机构代码
     * M
     */
    @JsonProperty("orgCode")
    private String orgCode;

    /**
     * 附件类型
     * M
     * 附件类型枚举，ID_CARD_FRONT
     */
    @JsonProperty("attType")
    private String attType;

    /**
     * 附件扩展名称
     * M
     * jpg，png，pdf；5M以内
     */
    @JsonProperty("attExtName")
    private String attExtName;

    /**
     * 附件内容
     * M
     * 	文件内容 BASE64  【后端使用spring的Base64Utils.decodeFromString() 方法解析，建议前端使用 Base64Utils.encodeToString() 方法编码或者等效工具类】
     */
    @JsonProperty("attContext")
    private String attContext;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getAttType() {
        return attType;
    }

    public void setAttType(String attType) {
        this.attType = attType;
    }

    public String getAttExtName() {
        return attExtName;
    }

    public void setAttExtName(String attExtName) {
        this.attExtName = attExtName;
    }

    public String getAttContext() {
        return attContext;
    }

    public void setAttContext(String attContext) {
        this.attContext = attContext;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MMS_OPENAPI_UPLOADFILE;
    }
}
