package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3SacsBalanceSeparateQueryRequest;

/**
 * @author nxj
 * @date 2023/8/23 16:07
 * @description 余额分账结果查询DEMO
 */
public class V3SacsBalanceSeparateQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();
        //2. 装配数据
        V3SacsBalanceSeparateQueryRequest request = new V3SacsBalanceSeparateQueryRequest();
        request.setOutSeparateNo("4604d4a7906a4c289de3c5ff45b403dd");
        request.setSeparateNo("20230823770188000271201900");
        request.setMerchantNo("82216905311000A");
        //3. 发送请求
        String response = LKLSDK.httpPost(request);
        //4. 响应
        System.out.println(response);
    }

}
