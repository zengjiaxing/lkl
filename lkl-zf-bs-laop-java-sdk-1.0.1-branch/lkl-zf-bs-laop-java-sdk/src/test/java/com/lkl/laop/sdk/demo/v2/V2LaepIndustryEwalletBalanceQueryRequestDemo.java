package com.lkl.laop.sdk.demo.v2;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V2LaepIndustryEwalletBalanceQueryRequest;

public class V2LaepIndustryEwalletBalanceQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        V2LaepIndustryEwalletBalanceQueryRequest request = new V2LaepIndustryEwalletBalanceQueryRequest();
        request.setOrgNo("1");
        request.setMerchantNo("8221210594300JY");
        request.setPayType("03");










        //3. 发送请求
        String response = LKLSDK.httpPost(request);

        //4. 响应
        System.out.println(response);
    }

}
