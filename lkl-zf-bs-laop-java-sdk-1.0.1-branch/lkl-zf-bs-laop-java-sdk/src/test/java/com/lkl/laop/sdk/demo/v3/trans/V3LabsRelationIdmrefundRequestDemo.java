package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3LabsRelationIdmrefundRequest;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/8/15 17:03
 * @description 商户订单退款交易
 */
public class V3LabsRelationIdmrefundRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {

        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V3LabsRelationIdmrefundRequest v3LabsRelationIdmrefundRequest = new V3LabsRelationIdmrefundRequest();
        v3LabsRelationIdmrefundRequest.setMerchantNo("8222900701106PZ");
        v3LabsRelationIdmrefundRequest.setTermNo("A1040538");
        v3LabsRelationIdmrefundRequest.setOutRefundOrderNo("bb87b9559fc545609424123cbd9cf056");
        v3LabsRelationIdmrefundRequest.setRefundAmount("1");
        v3LabsRelationIdmrefundRequest.setOriginTradeNo("2023122566210311643571");
        //v3LabsRelationIdmrefundRequest.setOutRefundOrderNo("a23ccf292d934c6ab5bf2a14b29e4a81");
        v3LabsRelationIdmrefundRequest.setLocationInfo(new V3LabsTradeLocationInfo("127.0.0.1"));
        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsRelationIdmrefundRequest);

        //4. 响应
        System.out.println(response);


    }
}
