package com.lkl.laop.sdk.demo.v2;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V2LaepIndustryEwalletWithdrawRequest;

public class V2LaepIndustryEwalletWithdrawRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        V2LaepIndustryEwalletWithdrawRequest request = new V2LaepIndustryEwalletWithdrawRequest();
        request.setOrgNo("1");
        request.setMerchantNo("8221210594300JY");
        request.setDrawAmt("0.01");
        request.setDrawMode("D0");
        //request.setMerOrderNo("1111111111123333333333");
        request.setPayType("01");










        //3. 发送请求
        String response = LKLSDK.httpPost(request);

        //4. 响应
        System.out.println(response);
    }
}
