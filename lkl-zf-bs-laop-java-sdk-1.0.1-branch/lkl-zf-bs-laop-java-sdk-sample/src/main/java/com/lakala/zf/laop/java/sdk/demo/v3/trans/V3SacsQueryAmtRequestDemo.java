package com.lakala.zf.laop.java.sdk.demo.v3.trans;


import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3SacsQueryAmtRequest;

/**
 * @author nxj
 * @date 2023/7/28 10:36
 * @description 可分账金额查询
 */
public class V3SacsQueryAmtRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();
        //2. 装配数据
        V3SacsQueryAmtRequest v3SacsQueryAmtRequest = new V3SacsQueryAmtRequest();
        v3SacsQueryAmtRequest.setMerchantNo("82249305399000A");
        v3SacsQueryAmtRequest.setLogNo("66210309205189");
        v3SacsQueryAmtRequest.setLogDate("20230724");

        //3. 发送请求
        String response = LKLSDK.httpPost(v3SacsQueryAmtRequest);
        //4. 响应
        System.out.println(response);

    }

}
