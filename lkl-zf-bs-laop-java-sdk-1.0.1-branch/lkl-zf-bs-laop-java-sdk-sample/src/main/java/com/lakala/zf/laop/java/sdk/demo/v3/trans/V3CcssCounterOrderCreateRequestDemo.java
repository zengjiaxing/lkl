package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3CcssCounterOrderCreateRequest;
import com.lkl.laop.sdk.request.model.V3CcssOrderGoodsFieldInfo;
import com.lkl.laop.sdk.request.model.V3CcssOrderOutSplitInfo;
import com.lkl.laop.sdk.request.model.V3CcssOrderSceneFieldInfo;
import com.lkl.laop.sdk.utils.JsonUtils;

import java.util.ArrayList;
import java.util.List;

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
        req.setOutOrderNo("8221210594300JY20230823151137012");
        req.setMerchantNo("8221210594300JY");
        req.setTotalAmount(1L);
        req.setOrderEfficientTime("20230824155923");
        req.setNotifyUrl("http://run.mocky.io/v3/b02c9448-20a2-4ff6-a678-38ecab30161d");
        req.setSupportRefund(1);
        req.setSupportRepeatPay(1);
        req.setCounterParam("{\"pay_mode\":\"ALIPAY\"}");
        req.setGoodsMark("1");
        V3CcssOrderGoodsFieldInfo v3CcssOrderGoodsFieldInfo = new V3CcssOrderGoodsFieldInfo();
        v3CcssOrderGoodsFieldInfo.setGoodsAmt(1L);
        v3CcssOrderGoodsFieldInfo.setGoodsNum(1);
        v3CcssOrderGoodsFieldInfo.setGoodsPricingUnit("4");
        v3CcssOrderGoodsFieldInfo.setGoodsName("外网交易充值");
        v3CcssOrderGoodsFieldInfo.setTePlatformType("1");
        v3CcssOrderGoodsFieldInfo.setTePlatformName("E-BAY");
        v3CcssOrderGoodsFieldInfo.setGoodsType("4");
        req.setGoodsField(JsonUtils.toJSONString(v3CcssOrderGoodsFieldInfo));
        req.setSupportCancel(0);
        req.setBusiTypeParam("[{\"busi_type\":\"UPCARD\",\"params\":{\"crd_flg\":\"CRDFLG_D|CRDFLG_C|CRDFLG_OTH\"}},{\"busi_type\":\"SCPAY\",\"params\":{\"pay_mode\":\"WECHAT\",\"crd_flg\":\"CRDFLG_D\"}}]");
        req.setOrderInfo("测试12313131");
        req.setSplitMark("1");
        req.setTermNo("T12331234");
        List<V3CcssOrderOutSplitInfo> outSplitInfos = new ArrayList<>();
        V3CcssOrderOutSplitInfo outSplitInfo = new V3CcssOrderOutSplitInfo();
        outSplitInfo.setMerchantNo("8221210594300JY");
        outSplitInfo.setOutSubOrderNo("8221210594300JY20230823151137008");
        outSplitInfo.setAmount("100");
        outSplitInfo.setTermNo("T12331234");
        outSplitInfos.add(outSplitInfo);
        req.setOutSplitInfo(outSplitInfos);
        List<String> sgnInfos = new ArrayList<>();
        sgnInfos.add("1");
        req.setSgnInfo(sgnInfos);

        V3CcssOrderSceneFieldInfo info = new V3CcssOrderSceneFieldInfo();
        V3CcssOrderSceneFieldInfo.HbFqSceneInfo hbFqSceneInfo = new V3CcssOrderSceneFieldInfo.HbFqSceneInfo();
        hbFqSceneInfo.setHbFqNum("3");
        hbFqSceneInfo.setHbFqSellerPercent("0");
        info.setSceneInfo(JsonUtils.toJSONString(hbFqSceneInfo));
        info.setOrderSceneType("HB_FQ");
        req.setOrderSceneField(info);
        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }
}
