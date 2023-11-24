package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3SacsBalanceCancelRequest;

/**
 * @author nxj
 * @date 2023/8/17 16:09
 * @description
 */
public class V3SacsBalanceCancelRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
        doInit();

        V3SacsBalanceCancelRequest v3SacsBalanceCancelRequest = new V3SacsBalanceCancelRequest();
        v3SacsBalanceCancelRequest.setMerchantNo("82229005943096D");
        v3SacsBalanceCancelRequest.setOriginOutSeparateNo("54471058747519933416466970232160");
        v3SacsBalanceCancelRequest.setOutSeparateNo("37976981651545908115103210344732");
        v3SacsBalanceCancelRequest.setTotalAmt("9900");
        //响应信息
        String res = LKLSDK.httpPost(v3SacsBalanceCancelRequest);
        System.out.println(res);
    }
}
