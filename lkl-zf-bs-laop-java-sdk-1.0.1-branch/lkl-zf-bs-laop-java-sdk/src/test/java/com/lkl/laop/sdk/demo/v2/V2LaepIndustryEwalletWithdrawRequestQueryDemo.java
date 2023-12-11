package com.lkl.laop.sdk.demo.v2;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V2LaepIndustryEwalletWithdrawQueryRequest;

public class V2LaepIndustryEwalletWithdrawRequestQueryDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        V2LaepIndustryEwalletWithdrawQueryRequest request = new V2LaepIndustryEwalletWithdrawQueryRequest();

        request.setDrawJnl("231211151431135588778867");
        request.setOrgNo("1");
        request.setMerchantNo("8221210594300JY");








        //3. 发送请求
        String response = LKLSDK.httpPost(request);

        //4. 响应
        System.out.println(response);
    }
}
