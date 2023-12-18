package com.lkl.laop.sdk.enums;

/**
 * 接口地址
 */
public enum FunctionCodeEnum {

    /**
     * V3接口
     */

    API_V3_LABS_TRADE_QUERY("api.v3.labs.query.tradequery", "聚合扫码-交易查询"),

    API_V3_LABS_TRANS_PREORDER("api.v3.labs.trans.preorder", "聚合扫码-聚合主扫"),

    API_V3_LABS_TRANS_MICROPAY("api.v3.labs.trans.micropay", "聚合扫码-聚合被扫"),

    API_V3_LABS_RELATION_REFUND("api.v3.labs.relation.refund", "聚合扫码-退款交易"),

    API_V3_SACS_SEPARATE("api.v3.sacs.separate", "分账指令V3接口-订单分账"),

    API_V3_SACS_QUERYAMT("api.v3.sacs.queryAmt", "分账指令V3接口-可分账金额查询"),

    API_V3_SACS_QUERY("api.v3.sacs.query", "分账指令V3接口-分账结果查询"),

    API_V3_LABS_QUERY_IDMREFUNDQUERY("api.v3.labs.query.idmrefundquery", "商户订单退款查询"),

    API_V3_LABS_RELATION_IDMREFUND("api.v3.labs.relation.idmrefund", "商户订单退款交易"),

    API_V3_LABS_RELATION_CLOSE("api.v3.labs.relation.close", "聚合扫码-关单"),

    API_V3_LABS_RELATION_REVOKED("api.v3.labs.relation.revoked", "扫码-撤销"),

    API_V3_CCSS_COUNTER_ORDER_CREATE("api.v3.ccss.counter.order.create", "收银台订单创建"),

    API_V3_CCSS_COUNTER_ORDER_QUERY("api.v3.ccss.counter.order.query", "收银台订单查询"),

    API_V3_CCSS_COUNTER_ORDER_CLOSE("api.v3.ccss.counter.order.close", "收银台订单关闭"),

    API_V3_SACS_CANCEL("api.v3.sacs.cancel", "订单分账撤销"),

    API_V3_SACS_FALLBACK("api.v3.sacs.fallback", "订单分账回退"),

    API_V3_SACS_BALANCESEPARATE("api.v3.sacs.balanceSeparate", "余额分账"),

    API_V3_SACS_BALANCECANCEL("api.v3.sacs.balanceCancel", "余额分账撤销"),

    API_V3_SACS_BALANCEFALLBACK("api.v3.sacs.balanceFallback", "余额分账回退"),

    API_V3_SACS_BALANCESEPARATEQUERY("api.v3.sacs.balanceSeparateQuery", "余额分账结果查询"),

    /**
     * V2接口
     */

    API_V2_MMS_OPENAPI_LEDGER_APPLYLEDGERMER("api.v2.mms.openApi.ledger.applyLedgerMer", "商户分账业务开通申请"),

    API_V2_MMS_OPENAPI_LEDGER_MODIFYLEDGERMER("api.v2.mms.openApi.ledger.modifyLedgerMer", "商户分账信息变更申请"),

    API_V2_MMS_OPENAPI_LEDGER_QUERYLEDGERMER("api.v2.mms.openApi.ledger.queryLedgerMer", "分账商户信息查询"),

    API_V2_MMS_OPENAPI_LEDGER_APPLYLEDGERRECEIVER("api.v2.mms.openApi.ledger.applyLedgerReceiver", "分账接收方开通申请"),

    API_V2_MMS_OPENAPI_LEDGER_MODIFYLEDGERRECEIVER("api.v2.mms.openApi.ledger.modifyLedgerReceiver", "分账接收方信息变更申请"),

    API_V2_MMS_OPENAPI_LEDGER_APPLYBIND("api.v2.mms.openApi.ledger.applyBind", "分账关系绑定申请"),

    API_V2_MMS_OPENAPI_LEDGER_APPLYUNBIND("api.v2.mms.openApi.ledger.applyUnBind", "分账关系解绑申请"),

    API_V2_MMS_OPENAPI_ACTIVESETTLE_APPLY("api.v2.mms.openApi.activeSettle.apply", "商户开通主动结算业务"),

    API_V2_LAEP_INDUSTRY_EWALLETWITHDRAW("api.v2.laep.industry.ewalletWithdraw", "账户提现"),

    API_V2_LAEP_INDUSTRY_EWALLETWITHDRAWQUERY("api.v2.laep.industry.ewalletWithdrawQuery", "账户提现查询"),

    API_V2_LAEP_INDUSTRY_EWALLETBALANCEQUERY("api.v2.laep.industry.ewalletBalanceQuery", "账户余额查询"),

    API_V2_MMS_OPENAPI_CARDBIN("api.v2.mms.openApi.cardBin", "卡BIN查询"),

    API_V2_MMS_OPENAPI_UPLOADFILE("api.v2.mms.openApi.uploadFile", "附件上传");

    private final String code;

    private final String name;


    FunctionCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return code.replaceAll("\\.", "/");
    }
}
