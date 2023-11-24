package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3SacsSeparateRequest;
import com.lkl.laop.sdk.request.model.V3SacsSeparateRecvDatas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/7/28 11:24
 * @description 分账指令
 */
public class V3SacsSeparateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();
        //2. 装配数据
        V3SacsSeparateRequest v3SacsSeparateRequest = new V3SacsSeparateRequest();
        v3SacsSeparateRequest.setMerchantNo("8221210581200AW");
        v3SacsSeparateRequest.setLogNo("66210309130752");
        v3SacsSeparateRequest.setLogDate("20230718");
        v3SacsSeparateRequest.setOutSeparateNo("FZ737268195882684416");
        v3SacsSeparateRequest.setTotalAmt("1");
        v3SacsSeparateRequest.setLklOrgNo("1");
        v3SacsSeparateRequest.setCalType("0");
        //分账接收数据对象
        List<V3SacsSeparateRecvDatas> recvDatas = new ArrayList<>();
        V3SacsSeparateRecvDatas recvData = new V3SacsSeparateRecvDatas();
        recvData.setRecvNo("8221210581200AW");
        recvData.setSeparateValue("1");
        recvDatas.add(recvData);
        v3SacsSeparateRequest.setRecvDatas(recvDatas);

        //3. 发送请求
        String response = LKLSDK.httpPost(v3SacsSeparateRequest);
        //4. 响应
        System.out.println(response);
    }
}
