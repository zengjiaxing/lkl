package com.lkl.laop.sdk.demo.v3.trans;

import java.util.ArrayList;
import java.util.List;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3SacsSeparateRequest;
import com.lkl.laop.sdk.request.model.V3SacsSeparateRecvDatas;

/**
 * @author nxj
 * @date 2023/7/28 11:24
 * @description 分账指令
 */
public class V3SacsSeparateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 数据初始化
    	doInit();

        V3SacsSeparateRequest v3SacsSeparateRequest = new V3SacsSeparateRequest();
        v3SacsSeparateRequest.setMerchantNo("8221210594300JY");
        v3SacsSeparateRequest.setLogNo("66210311396387");
        v3SacsSeparateRequest.setLogDate("20231211");
        v3SacsSeparateRequest.setOutSeparateNo("FZ7371122195881234420");
        v3SacsSeparateRequest.setTotalAmt("2");
        v3SacsSeparateRequest.setLklOrgNo("1");
        v3SacsSeparateRequest.setCalType("0");
        //分账接收数据对象
        List<V3SacsSeparateRecvDatas> recvDatas = new ArrayList<>();
        V3SacsSeparateRecvDatas recvData = new V3SacsSeparateRecvDatas();
        recvData.setRecvNo("SR2024000008703");
        //recvData.setRecvMerchantNo("SR2024000008703");
        recvData.setSeparateValue("2");
        recvDatas.add(recvData);
        v3SacsSeparateRequest.setRecvDatas(recvDatas);
      //响应信息
        String res = LKLSDK.httpPost(v3SacsSeparateRequest);
        System.out.println(res);
    }


}
