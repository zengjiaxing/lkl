package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3LabsTransRelationRefundRequest;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/7/21 17:35
 * @description v3交易查询DEMO
 */
public class V3LabsTransRelationRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
    	doInit();

        V3LabsTransRelationRefundRequest v3LabsTransRelationRefundRequest = new V3LabsTransRelationRefundRequest();
        v3LabsTransRelationRefundRequest.setMerchantNo("8222900701106DH");
        v3LabsTransRelationRefundRequest.setTermNo("D1041218");
        v3LabsTransRelationRefundRequest.setOutTradeNo("7089279514841777702");
        v3LabsTransRelationRefundRequest.setRefundAmount("1");
        v3LabsTransRelationRefundRequest.setRefundReason("测试退款");
        v3LabsTransRelationRefundRequest.setOriginOutTradeNo("000002390028906602");
        v3LabsTransRelationRefundRequest.setOriginLogNo("66210309280368");
        v3LabsTransRelationRefundRequest.setOriginTradeNo("2023072766210309280368");

        V3LabsTradeLocationInfo v3LabsTradeLocationInfo = new V3LabsTradeLocationInfo("12.34.56.78", null, "+37.123456789,-121.123456789");
        v3LabsTransRelationRefundRequest.setLocationInfo(v3LabsTradeLocationInfo);

      //响应信息
        String res = LKLSDK.httpPost(v3LabsTransRelationRefundRequest);
        System.out.println(res);
    }


}
