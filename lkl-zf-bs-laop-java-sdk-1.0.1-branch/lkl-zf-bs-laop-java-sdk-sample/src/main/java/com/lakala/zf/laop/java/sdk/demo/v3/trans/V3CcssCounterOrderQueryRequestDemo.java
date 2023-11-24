package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3CcssCounterOrderQueryRequest;

/**
 * @author nxj
 * @date 2023/8/16 16:06
 * @description 收银台订单查询DEMO
 */
public class V3CcssCounterOrderQueryRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V3CcssCounterOrderQueryRequest req = new V3CcssCounterOrderQueryRequest();
        req.setOutOrderNo("KFPT20230816160009228907299");
        req.setMerchantNo("8222900701106PZ");
        req.setChannelId("2021052614391");

        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }
}
