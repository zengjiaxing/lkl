package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3SacsFallbackRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/8/17 11:03
 * @description 订单分账回退DEMO
 */
public class V3SacsFallbackRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
        doInit();

        V3SacsFallbackRequest v3SacsFallbackRequest = new V3SacsFallbackRequest();
        v3SacsFallbackRequest.setMerchantNo("82229005943096D");
        v3SacsFallbackRequest.setOriginOutSeparateNo("72848874029489665216847386099008");
        v3SacsFallbackRequest.setOutSeparateNo("99309535159529517424743080321778");
        v3SacsFallbackRequest.setTotalAmt("1");
        v3SacsFallbackRequest.setFallbackReason("分账回退测试");
        List<V3SacsFallbackRequest.OriginRecvData> originRecvDatas = new ArrayList<>();
        V3SacsFallbackRequest.OriginRecvData originRecvData = new V3SacsFallbackRequest.OriginRecvData();
        originRecvData.setRecvNo("SR2022120117001");
        originRecvData.setAmt("1");
        originRecvDatas.add(originRecvData);
        v3SacsFallbackRequest.setOriginRecvDatas(originRecvDatas);
        //响应信息
        String res = LKLSDK.httpPost(v3SacsFallbackRequest);
        System.out.println(res);
    }
}
