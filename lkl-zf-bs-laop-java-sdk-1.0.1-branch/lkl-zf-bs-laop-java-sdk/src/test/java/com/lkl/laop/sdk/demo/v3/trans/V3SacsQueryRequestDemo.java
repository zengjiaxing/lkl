package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3SacsQueryRequest;

/**
 * @author nxj
 * @date 2023/7/28 10:20
 * @description 分账结果查询DEMO
 */
public class V3SacsQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
    	doInit();

        V3SacsQueryRequest v3SacsQueryRequest = new V3SacsQueryRequest();
        v3SacsQueryRequest.setMerchantNo("8221210701101SB");
        v3SacsQueryRequest.setSeparateNo("20230426770188000254207000");
        v3SacsQueryRequest.setOutSeparateNo("153020230426173509288272000001");
        //响应信息
        String res = LKLSDK.httpPost(v3SacsQueryRequest);
        System.out.println(res);
    }

}
