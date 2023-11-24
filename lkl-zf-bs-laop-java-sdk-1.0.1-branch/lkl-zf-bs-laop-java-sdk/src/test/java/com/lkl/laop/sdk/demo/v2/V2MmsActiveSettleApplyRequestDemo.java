package com.lkl.laop.sdk.demo.v2;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V2MmsActiveSettleApplyRequest;

/**
 * @author nxj
 * @date 2023/9/11 15:10
 * @description 商户开通主动结算业务demo
 */
public class V2MmsActiveSettleApplyRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsActiveSettleApplyRequest req = new V2MmsActiveSettleApplyRequest();
        req.setVersion("2.0");
        req.setOrderNo("20230821153025407888851");
        req.setOrgCode("1");
        req.setMerInnerNo("4002021033012340711");
        req.setMerCupNo("8222900701100Z1");

        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }
}
