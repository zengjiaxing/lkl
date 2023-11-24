package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3CcssCounterOrderCreateRequest;

/**
 * @author nxj
 * @date 2023/8/16 15:33
 * @description 收银台订单创建 DEMO
 */
public class V3CcssCounterOrderCreateRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V3CcssCounterOrderCreateRequest req = new V3CcssCounterOrderCreateRequest();
        req.setOutOrderNo("KFPT20230816160009228907299");
        req.setMerchantNo("8222900701106PZ");
        req.setVposId("587305941625155584");
        req.setChannelId("2021052614391");
        req.setTotalAmount(1L);
        req.setBusiMode("PAY");
        req.setOrderEfficientTime("20230816170009");
        req.setNotifyUrl("http://run.mocky.io/v3/b02c9448-20a2-4ff6-a678-38ecab30161d");
        req.setSupportCancel(0);
        req.setSupportRefund(1);
        req.setSupportRepeatPay(1);
        req.setBusiTypeParam("[{\"busi_type\":\"UPCARD\",\"params\":{\"crd_flg\":\"CRDFLG_D|CRDFLG_C|CRDFLG_OTH\"}},{\"busi_type\":\"SCPAY\",\"params\":{\"pay_mode\":\"WECHAT\",\"crd_flg\":\"CRDFLG_D\"}}]");
        req.setCounterParam("{\"pay_mode\":\"ALIPAY\"}");
        req.setOrderInfo("测试");

        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }
}
