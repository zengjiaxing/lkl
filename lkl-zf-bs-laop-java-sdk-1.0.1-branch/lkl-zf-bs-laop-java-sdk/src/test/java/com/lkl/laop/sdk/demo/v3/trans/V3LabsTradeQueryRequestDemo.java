package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3LabsTradeQueryRequest;

/**
 * @author nxj
 * @date 2023/7/19 10:36
 * @description 聚合扫码-交易查询 demo
 */
public class V3LabsTradeQueryRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
    	doInit();
    	//2. 装配数据
        V3LabsTradeQueryRequest v3LabsTradeQueryRequest = new V3LabsTradeQueryRequest();
        v3LabsTradeQueryRequest.setMerchantNo("3222900594309B8");
        v3LabsTradeQueryRequest.setTermNo("A1135688");
        v3LabsTradeQueryRequest.setOutTradeNo("7089279514841771109");
        v3LabsTradeQueryRequest.setTradeNo("2023072666210309260100");
        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsTradeQueryRequest);
        //4. 响应
        System.out.println(response);

    }
}
