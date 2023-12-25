package com.lkl.laop.sdk.demo.v2;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V2MmsLedgerApplyUnBindRequest;
import com.lkl.laop.sdk.request.V2MmsModifyLedgerMerRequest;

/**
 * @author nxj
 * @date 2023/8/22 16:56
 * @description 商户分账信息变更申请(账户模式)DEMO
 */
public class V2MmsModifyLedgerMerRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsModifyLedgerMerRequest req = new V2MmsModifyLedgerMerRequest();
        req.setVersion("1.0");
        req.setOrderNo("2023082214373584315515");
        req.setOrgCode("1");
        //req.setMerInnerNo("8221210594300JY");
        req.setSplitLowestRatio("0");
        req.setMerCupNo("8221210594300JY");
        req.setRetUrl("https://5436i50a67.zicp.fun/account/applyBind/notify");
        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }

}
