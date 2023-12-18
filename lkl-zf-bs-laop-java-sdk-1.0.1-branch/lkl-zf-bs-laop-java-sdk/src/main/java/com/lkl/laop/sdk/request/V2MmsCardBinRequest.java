package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;


/**
 * @description 卡BIN查询
 */
public class V2MmsCardBinRequest extends V2CommRequest {

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
     * 银行卡号
     * M
     */
    @JsonProperty("cardNo")
    private String cardNo;


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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MMS_OPENAPI_CARDBIN;
    }
}
