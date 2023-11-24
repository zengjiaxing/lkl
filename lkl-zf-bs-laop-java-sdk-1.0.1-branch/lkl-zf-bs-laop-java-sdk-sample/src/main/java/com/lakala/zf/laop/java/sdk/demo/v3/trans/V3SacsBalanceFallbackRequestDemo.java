package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3SacsBalanceFallbackRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/8/17 16:05
 * @description 余额分账回退DEMO
 */
public class V3SacsBalanceFallbackRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
        doInit();

        V3SacsBalanceFallbackRequest v3SacsBalanceFallbackRequest = new V3SacsBalanceFallbackRequest();
        v3SacsBalanceFallbackRequest.setMerchantNo("82229005943096D");
        v3SacsBalanceFallbackRequest.setOriginOutSeparateNo("72848874029489665216847386099008");
        v3SacsBalanceFallbackRequest.setOutSeparateNo("99309535159529517424743080321778");
        v3SacsBalanceFallbackRequest.setTotalAmt("1");
        v3SacsBalanceFallbackRequest.setFallbackReason("分账回退测试");
        List<V3SacsBalanceFallbackRequest.OriginRecvData> originRecvDatas = new ArrayList<>();
        V3SacsBalanceFallbackRequest.OriginRecvData originRecvData = new V3SacsBalanceFallbackRequest.OriginRecvData();
        originRecvData.setRecvNo("SR2022120117001");
        originRecvData.setAmt("1");
        originRecvDatas.add(originRecvData);
        v3SacsBalanceFallbackRequest.setOriginRecvDatas(originRecvDatas);
        //响应信息
        String res = LKLSDK.httpPost(v3SacsBalanceFallbackRequest);
        System.out.println(res);
    }
}
