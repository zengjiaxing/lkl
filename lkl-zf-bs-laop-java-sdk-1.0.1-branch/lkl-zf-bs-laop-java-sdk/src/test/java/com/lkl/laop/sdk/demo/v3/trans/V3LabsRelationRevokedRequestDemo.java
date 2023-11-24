package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo2;
import com.lkl.laop.sdk.request.V3LabsRelationRevokedRequest;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/8/16 10:21
 * @description 扫码-撤销DEMO
 */
public class V3LabsRelationRevokedRequestDemo extends BaseCommonDemo2 {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V3LabsRelationRevokedRequest v3LabsRelationRevokedRequest = new V3LabsRelationRevokedRequest();
        v3LabsRelationRevokedRequest.setMerchantNo("822290070111135");
        v3LabsRelationRevokedRequest.setTermNo("29034705");
        v3LabsRelationRevokedRequest.setOutTradeNo("cx-20230712700012");
        v3LabsRelationRevokedRequest.setOriginTradeNo("23081111012001101011001101163");
        v3LabsRelationRevokedRequest.setLocationInfo(new V3LabsTradeLocationInfo("127.0.0.1"));
        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsRelationRevokedRequest);

        //4. 响应
        System.out.println(response);

    }
}
