package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3LabsRelationCloseRequest;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/8/16 10:07
 * @description 聚合扫码-关单DEMO
 */
public class V3LabsRelationCloseRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V3LabsRelationCloseRequest v3LabsRelationCloseRequest = new V3LabsRelationCloseRequest();
        v3LabsRelationCloseRequest.setMerchantNo("822290070111135");
        v3LabsRelationCloseRequest.setTermNo("29034705");
        v3LabsRelationCloseRequest.setOriginOutTradeNo("order-202307120002");
        v3LabsRelationCloseRequest.setLocationInfo(new V3LabsTradeLocationInfo("36.45.36.95"));

        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsRelationCloseRequest);

        //4. 响应
        System.out.println(response);
    }
}
