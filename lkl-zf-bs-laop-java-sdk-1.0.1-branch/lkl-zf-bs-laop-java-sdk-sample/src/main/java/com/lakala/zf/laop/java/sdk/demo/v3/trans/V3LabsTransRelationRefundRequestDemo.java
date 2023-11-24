package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3LabsTransRelationRefundRequest;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/7/21 17:35
 * @description v3交易查询DEMO
 */
public class V3LabsTransRelationRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();
        //2. 装配数据
        V3LabsTransRelationRefundRequest v3LabsTransRelationRefundRequest = new V3LabsTransRelationRefundRequest();
        v3LabsTransRelationRefundRequest.setMerchantNo("8222900594309B8");
        v3LabsTransRelationRefundRequest.setTermNo("A1135688");
        v3LabsTransRelationRefundRequest.setOutTradeNo("7089279664841771003");
        v3LabsTransRelationRefundRequest.setRefundAmount("1");
        v3LabsTransRelationRefundRequest.setRefundReason("测试退款");
        v3LabsTransRelationRefundRequest.setOriginOutTradeNo("7089279514841779911");
        v3LabsTransRelationRefundRequest.setOriginLogNo("66210309675613");
        v3LabsTransRelationRefundRequest.setOriginTradeNo("2023082166210309675613");

        V3LabsTradeLocationInfo v3LabsTradeLocationInfo = new V3LabsTradeLocationInfo("12.34.56.78", null, "+37.123456789,-121.123456789");
        v3LabsTransRelationRefundRequest.setLocationInfo(v3LabsTradeLocationInfo);

        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsTransRelationRefundRequest);
        //4. 响应
        System.out.println(response);
    }

}
