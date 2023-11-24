package com.lakala.zf.laop.java.sdk.demo.v2;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V2MmsApplyLedgerMerRequest;

/**
 * @author nxj
 * @date 2023/8/21 15:30
 * @description 商户分账业务开通申请DEMO
 */
public class V2MmsApplyLedgerMerRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsApplyLedgerMerRequest req = new V2MmsApplyLedgerMerRequest();
        req.setVersion("2.0");
        req.setOrderNo("KFPT20230821153025407888813");
        req.setOrgCode("1");
        req.setMerInnerNo("4002021033012340711");
        req.setMerCupNo("8222900701100Z1");
        req.setContactMobile("13790147644");
        req.setSplitLowestRatio("0");
        req.setSplitEntrustFileName("授权委托书1.pdf");
        req.setSplitEntrustFilePath("G1/M00/00/16/CrFdEl0wGu6AHwGQAAAz1tt6luo1947.jpg");
        req.setRetUrl("http://run.mocky.io/v3/b02c9448-20a2-4ff6-a678-38ecab30161d");

        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }

}
