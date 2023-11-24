package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3SacsBalanceSeparateRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/8/17 14:51
 * @description 余额分账DEMO
 */
public class V3SacsBalanceSeparateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();
        //2. 装配数据
        V3SacsBalanceSeparateRequest request = new V3SacsBalanceSeparateRequest();
        request.setMerchantNo("82216905311000A");
        request.setCalType("0");
        request.setOutSeparateNo("TEST20230330001");
        request.setTotalAmt("2");
        List<V3SacsBalanceSeparateRequest.RecvData> recvDatas = new ArrayList<>();
        V3SacsBalanceSeparateRequest.RecvData recvData1 = new V3SacsBalanceSeparateRequest.RecvData();
        recvData1.setRecvNo("SR2023011215004");
        recvData1.setSeparateValue("1");
        recvDatas.add(recvData1);

        request.setRecvDatas(recvDatas);
        //3. 发送请求
        String response = LKLSDK.httpPost(request);
        //4. 响应
        System.out.println(response);
    }
}
