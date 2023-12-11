package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3SacsQueryAmtRequest;

/**
 * @author nxj
 * @date 2023/7/28 10:36
 * @description 可分账金额查询
 */
public class V3SacsQueryAmtRequestDemo extends BaseCommonDemo{
    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
    	doInit();

        V3SacsQueryAmtRequest v3SacsQueryAmtRequest = new V3SacsQueryAmtRequest();
        v3SacsQueryAmtRequest.setMerchantNo("8221210594300JY");
        v3SacsQueryAmtRequest.setLogNo("66210311396387");
        v3SacsQueryAmtRequest.setLogDate("20231211");
      //响应信息
        String res = LKLSDK.httpPost(v3SacsQueryAmtRequest);
        System.out.println(res);
    }

}
