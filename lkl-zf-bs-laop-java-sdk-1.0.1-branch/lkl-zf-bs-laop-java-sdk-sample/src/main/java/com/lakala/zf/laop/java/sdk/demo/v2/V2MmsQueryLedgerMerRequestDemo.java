package com.lakala.zf.laop.java.sdk.demo.v2;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V2MmsQueryLedgerMerRequest;

/**
 * @author nxj
 * @date 2023/8/21 15:57
 * @description 商户分账信息查询
 */
public class V2MmsQueryLedgerMerRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsQueryLedgerMerRequest req = new V2MmsQueryLedgerMerRequest();
        req.setVersion("1.0");
        req.setOrderNo("2023082214421898696034");
        req.setOrgCode("1");
        //req.setMerInnerNo("4002023082110197011");
        req.setMerCupNo("8221210701101SB");

        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }
}
