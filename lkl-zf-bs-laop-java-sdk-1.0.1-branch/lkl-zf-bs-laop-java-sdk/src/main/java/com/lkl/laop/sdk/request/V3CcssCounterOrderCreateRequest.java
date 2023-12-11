package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3CcssOrderGoodsFieldInfo;
import com.lkl.laop.sdk.request.model.V3CcssOrderOutSplitInfo;
import com.lkl.laop.sdk.request.model.V3CcssOrderSceneFieldInfo;

import java.util.List;

/**
 * @author nxj
 * @date 2023/8/16 10:35
 * @description 收银台订单创建
 */
public class V3CcssCounterOrderCreateRequest extends V3CommRequest {

    /**
     * 商户订单号
     * M
     */
    @JsonProperty("out_order_no")
    private String outOrderNo;

    /**
     * 银联商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 交易设备标识
     * C
     * 非合单场景必输该字段，进件返回接口中的termId字段，非API接口进件请联系业务员。
     */
    @JsonProperty("vpos_id")
    private String vposId;

    /**
     * 渠道号
     * C
     * 一般不用
     */
    @JsonProperty("channel_id")
    private String channelId;

    /**
     * 业务模式
     * C
     * ACQ-收单 默认为“ACQ-收单”
     * PAY-付款
     */
    @JsonProperty("busi_mode")
    private String busiMode;

    /**
     * 订单金额
     * M
     * 单位：分
     */
    @JsonProperty("total_amount")
    private Long totalAmount;

    /**
     * 订单有效期
     * M
     * 格式yyyyMMddHHmmss,最大支持下单时间+7天
     */
    @JsonProperty("order_efficient_time")
    private String orderEfficientTime;

    /**
     * 订单支付成功后商户接收订单通知的地址
     * C
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 是否支持撤销
     * C
     * 默认 0 不支持;busi_mode为“PAY-付款”不支持 撤销
     */
    @JsonProperty("support_cancel")
    private Integer supportCancel;

    /**
     * 是否支持退款
     * C
     * 默认0 不支持
     */
    @JsonProperty("support_refund")
    private Integer supportRefund;

    /**
     * 是否支持“多次发起支付”
     * C
     * 默认0 不支持
     */
    @JsonProperty("support_repeat_pay")
    private Integer supportRepeatPay;

    /**
     * 0:重复支付后不自动退货；1:重复支付后自动退货 （默认不送为0），注意：请详细了解字段场景后上送
     *
     * 需注意互斥条件：repeat_pay_auto_refund选择“1”重复支付后自动退货后，repeat_pay_notify仅支持选择“0”重复支付订单不通知
     * C
     * 默认0 不支持
     */
    @JsonProperty("repeat_pay_auto_refund")
    private String repeatPayAutoRefund;

    /**
     * 发起订单方的userId
     * C
     * 归属于channelId下的userId
     */
    @JsonProperty("out_user_id")
    private String outUserId;

    /**
     * 客户端下单完成支付后返回的商户网页跳转地址。
     * C
     */
    @JsonProperty("callback_url")
    private String callbackUrl;

    /**
     * 订单标题
     * M
     * 在使用收银台扫码支付时必输入，交易时送往账户端
     */
    @JsonProperty("order_info")
    private String orderInfo;

    /**
     * 结算终端号
     * C
     * 合单场景必输该字段
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 合单标识
     * C
     * “1”为合单，不填默认是为非合单
     */
    @JsonProperty("split_mark")
    private String splitMark;

    /**
     * 结算类型（非合单）
     * C
     * “0”或者空，常规结算方式 注意：该字段会影响结算方式，慎用。（调用拉卡拉分账接口需必传）
     */
    @JsonProperty("settle_type")
    private String settleType;

    /**
     * 拆单信息
     * C
     * 合单标识为“1”时必传该字段。
     */
    @JsonProperty("out_split_info")
    private List<V3CcssOrderOutSplitInfo> outSplitInfo;

    /**
     * json字符串 收银台参数
     * C
     */
    @JsonProperty("counter_param")
    private String counterParam;

    /**
     * 收银台下单备注
     * C
     */
    @JsonProperty("counter_remark")
    private String counterRemark;

    /**
     * 业务类型控制参数，jsonStr格式
     * O
     */
    @JsonProperty("busi_type_param")
    private String busiTypeParam;

    /**
     * 签约协议号列表（字符串）
     * C
     * 列表中签约协议号不能为空；列表中签约协议号不能重复
     */
    @JsonProperty("sgn_info")
    private List<String> sgnInfo;

    /**
     * 指定产品编号 （200809:线上外卡收银台）
     * O
     * 该字段默认不需要指定，特殊场景下使用，慎用
     */
    @JsonProperty("product_id")
    private String productId;

    /**
     * 商品信息标识
     * O
     * 1:含商品信息，不填默认不含商品信息
     */
    @JsonProperty("goods_mark")
    private String goodsMark;

    /**
     * 商品信息域
     * O
     * good_mark送1时该域必填，否则不送。只有线上外卡业务上送该字段
     * @see V3CcssOrderGoodsFieldInfo
     */
    @JsonProperty("goods_field")
    private String goodsField;

    /**
     * 订单场景域，特殊场景下需要上送
     * O
     */
    @JsonProperty("order_scene_field")
    private V3CcssOrderSceneFieldInfo orderSceneField;

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getVposId() {
        return vposId;
    }

    public void setVposId(String vposId) {
        this.vposId = vposId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getBusiMode() {
        return busiMode;
    }

    public void setBusiMode(String busiMode) {
        this.busiMode = busiMode;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderEfficientTime() {
        return orderEfficientTime;
    }

    public void setOrderEfficientTime(String orderEfficientTime) {
        this.orderEfficientTime = orderEfficientTime;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getSupportCancel() {
        return supportCancel;
    }

    public void setSupportCancel(Integer supportCancel) {
        this.supportCancel = supportCancel;
    }

    public Integer getSupportRefund() {
        return supportRefund;
    }

    public void setSupportRefund(Integer supportRefund) {
        this.supportRefund = supportRefund;
    }

    public Integer getSupportRepeatPay() {
        return supportRepeatPay;
    }

    public void setSupportRepeatPay(Integer supportRepeatPay) {
        this.supportRepeatPay = supportRepeatPay;
    }

    public String getRepeatPayAutoRefund() {
        return repeatPayAutoRefund;
    }

    public void setRepeatPayAutoRefund(String repeatPayAutoRefund) {
        this.repeatPayAutoRefund = repeatPayAutoRefund;
    }

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getSplitMark() {
        return splitMark;
    }

    public void setSplitMark(String splitMark) {
        this.splitMark = splitMark;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public List<V3CcssOrderOutSplitInfo> getOutSplitInfo() {
        return outSplitInfo;
    }

    public void setOutSplitInfo(List<V3CcssOrderOutSplitInfo> outSplitInfo) {
        this.outSplitInfo = outSplitInfo;
    }

    public String getCounterParam() {
        return counterParam;
    }

    public void setCounterParam(String counterParam) {
        this.counterParam = counterParam;
    }

    public String getCounterRemark() {
        return counterRemark;
    }

    public void setCounterRemark(String counterRemark) {
        this.counterRemark = counterRemark;
    }

    public String getBusiTypeParam() {
        return busiTypeParam;
    }

    public void setBusiTypeParam(String busiTypeParam) {
        this.busiTypeParam = busiTypeParam;
    }

    public List<String> getSgnInfo() {
        return sgnInfo;
    }

    public void setSgnInfo(List<String> sgnInfo) {
        this.sgnInfo = sgnInfo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getGoodsMark() {
        return goodsMark;
    }

    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark;
    }

    public String getGoodsField() {
        return goodsField;
    }

    public void setGoodsField(String goodsField) {
        this.goodsField = goodsField;
    }

    public V3CcssOrderSceneFieldInfo getOrderSceneField() {
        return orderSceneField;
    }

    public void setOrderSceneField(V3CcssOrderSceneFieldInfo orderSceneField) {
        this.orderSceneField = orderSceneField;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_CCSS_COUNTER_ORDER_CREATE;
    }
}
