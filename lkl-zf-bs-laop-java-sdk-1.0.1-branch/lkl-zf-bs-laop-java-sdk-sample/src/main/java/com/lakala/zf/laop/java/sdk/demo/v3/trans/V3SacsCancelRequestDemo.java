package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3SacsCancelRequest;

/**
 * @author nxj
 * @date 2023/8/16 17:32
 * @description
 */
public class V3SacsCancelRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
        doInit();

        V3SacsCancelRequest v3SacsCancelRequest = new V3SacsCancelRequest();
        v3SacsCancelRequest.setMerchantNo("82229005943096D");
        v3SacsCancelRequest.setOriginOutSeparateNo("54471058747519933416466970232160");
        v3SacsCancelRequest.setOutSeparateNo("37976981651545908115103210344732");
        v3SacsCancelRequest.setTotalAmt("9900");
        //响应信息
        String res = LKLSDK.httpPost(v3SacsCancelRequest);
        System.out.println(res);
    }
}
