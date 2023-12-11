package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author zjx
 * @date 2023/12/11 11:07
 * @description 账户余额查询
 */
public class V2LaepIndustryEwalletBalanceQueryRequest extends V2CommRequest {

    /**
     * bmcp机构号
     * M
     * 机构号
     */
    @JsonProperty("orgNo")
    private String orgNo;

    /**
     * 商户号
     * M
     * 822商户号，
     * SR分账接收方编号
     */
    @JsonProperty("merchantNo")
    private String merchantNo;

    /**
     * 账号（若该参数上送，则payType将无效）
     * C
     */
    @JsonProperty("payNo")
    private String payNo;

    /**
     * 	账号类型（01：收款账户，02：付款账户，03：分账商户账户，04：分账接收方账户，05：充值代付账户，06：结算代付账户）- 未上送则默认为01
     * C
     */
    @JsonProperty("payType")
    private String payType;


    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_EWALLETBALANCEQUERY;
    }

}
