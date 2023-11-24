package com.lakala.zf.laop.java.sdk.demo.v3.trans;


import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3LabsTransPreorderRequest;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;
import com.lkl.laop.sdk.request.model.V3LabsTradePreorderAlipayBus;
import com.lkl.laop.sdk.request.model.V3LabsTradePreorderUnionPayBus;
import com.lkl.laop.sdk.request.model.V3LabsTradePreorderWechatBus;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/7/20 10:41
 * @description 主扫交易接口DEMO
 */
public class V3LabsTransPreorderRequestDemo extends BaseCommonDemo {
    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();
        //2. 装配数据
        /*** 微信主扫场景示例 */
        V3LabsTransPreorderRequest v3LabsTransPreorderWechatReq = new V3LabsTransPreorderRequest();
        v3LabsTransPreorderWechatReq.setMerchantNo("8222900594309B8");
        v3LabsTransPreorderWechatReq.setTermNo("A1135688");
        v3LabsTransPreorderWechatReq.setOutTradeNo("7089279514841774401");
        v3LabsTransPreorderWechatReq.setAccountType("WECHAT");
        v3LabsTransPreorderWechatReq.setTransType("51");
        v3LabsTransPreorderWechatReq.setTotalAmount("50");
        v3LabsTransPreorderWechatReq.setNotifyUrl("https://testca/notify");
        v3LabsTransPreorderWechatReq.setRemark("备注");

        //地址位置信息
        V3LabsTradeLocationInfo v3LabsTradePreorderLocationInfo1 = new V3LabsTradeLocationInfo("12.34.56.78");
        v3LabsTransPreorderWechatReq.setLocationInfo(v3LabsTradePreorderLocationInfo1);

        //微信主扫场景下acc_busi_fields域内容
        V3LabsTradePreorderWechatBus wechatBus = new V3LabsTradePreorderWechatBus();
        wechatBus.setSubAppid("wx68edd02e");
        wechatBus.setUserId("oO2Dq0ny0C");
        wechatBus.setGoodsTag("ceshi");
        wechatBus.setSceneInfo("{\"store_info\":{\"id\": \"123\",\"name\": \"456\",\"area_code\": \"2345\",\"address\": \"地址\" }}");

        V3LabsTradePreorderWechatBus.AccBusiDetail accBusiDetail = new V3LabsTradePreorderWechatBus.AccBusiDetail();
        List<V3LabsTradePreorderWechatBus.WechatGoodsDetail> wechatGoodsDetails = new ArrayList<>();
        V3LabsTradePreorderWechatBus.WechatGoodsDetail wechatGoodsDetail = new V3LabsTradePreorderWechatBus.WechatGoodsDetail();
        wechatGoodsDetail.setGoodsId("100734033");
        wechatGoodsDetail.setPrice(50);
        wechatGoodsDetail.setQuantity(1);
        wechatGoodsDetails.add(wechatGoodsDetail);
        accBusiDetail.setCostPrice(555);
        accBusiDetail.setGoodsDetail(wechatGoodsDetails);
        wechatBus.setDetail(accBusiDetail);
        v3LabsTransPreorderWechatReq.setAccBusiFields(wechatBus);


        /*** 支付宝主扫场景示例 */
        V3LabsTransPreorderRequest v3LabsTransPreorderAlipayReq = new V3LabsTransPreorderRequest();
        v3LabsTransPreorderAlipayReq.setMerchantNo("8222900594309B8");
        v3LabsTransPreorderAlipayReq.setTermNo("A1135688");
        v3LabsTransPreorderAlipayReq.setOutTradeNo("7089279514841779911");
        v3LabsTransPreorderAlipayReq.setAccountType("ALIPAY");
        v3LabsTransPreorderAlipayReq.setTransType("41");
        v3LabsTransPreorderAlipayReq.setTotalAmount("1");
        v3LabsTransPreorderAlipayReq.setNotifyUrl("http://sit-lama-msa-api.lakala.sh.in/messageHandle");
        v3LabsTransPreorderAlipayReq.setRemark("备注2");

        //地址位置信息
        V3LabsTradeLocationInfo v3LabsTradePreorderLocationInfo2 = new V3LabsTradeLocationInfo();
        v3LabsTradePreorderLocationInfo2.setLocation("117.88.221.22");
        v3LabsTradePreorderLocationInfo2.setBaseStation("00+LAC:6361+CID:58130");
        v3LabsTradePreorderLocationInfo2.setRequestIp("+37.123456789/-121.123456789");
        v3LabsTransPreorderAlipayReq.setLocationInfo(v3LabsTradePreorderLocationInfo2);


        //支付宝主扫场景下acc_busi_fields域内容
        V3LabsTradePreorderAlipayBus alipayBus = new V3LabsTradePreorderAlipayBus();
        alipayBus.setStoreId("11111");
        alipayBus.setUserId("22222");
        alipayBus.setDisablePayChannels("credit_group");
        alipayBus.setBusinessParams("{“enable_thirdpar ty_subsidy”:”N”}");
        alipayBus.setQuitUrl("www.test.com");
        alipayBus.setTimeoutExpress("10");
        //支付宝extend_params字段说明
//        V3LabsTradePreorderAlipayBus.AlipayExtendParamInfo extendParamInfo = new V3LabsTradePreorderAlipayBus.AlipayExtendParamInfo();
//        extendParamInfo.setHbFqNum("3");
//        extendParamInfo.setSysServiceProviderId("2088511833207846");
//        extendParamInfo.setFoodOrderType("qr_order");
//        extendParamInfo.setHbFqSellerPercent("100");
//        alipayBus.setExtendParams(extendParamInfo);

        //支付宝goods_detail字段说明
        List<V3LabsTradePreorderAlipayBus.AlipayGoodsDeTail> goodsDeTails = new ArrayList<>();
        V3LabsTradePreorderAlipayBus.AlipayGoodsDeTail alipayGoodsDeTail1 = new V3LabsTradePreorderAlipayBus.AlipayGoodsDeTail();
        alipayGoodsDeTail1.setAlipayGoodsId("6666");
        alipayGoodsDeTail1.setGoodsId("123");
        alipayGoodsDeTail1.setGoodsName("测试商品");
        alipayGoodsDeTail1.setQuantity("1.11");
        alipayGoodsDeTail1.setPrice("666.33");
        alipayGoodsDeTail1.setShowUrl("www.test.com");
        goodsDeTails.add(alipayGoodsDeTail1);
        alipayBus.setGoodsDetail(goodsDeTails);
        v3LabsTransPreorderAlipayReq.setAccBusiFields(alipayBus);


        /*** 银联主扫场景示例 */
        V3LabsTransPreorderRequest v3LabsTransPreorderUnionPayReq = new V3LabsTransPreorderRequest();
        v3LabsTransPreorderUnionPayReq.setMerchantNo("8222900594309B8");
        v3LabsTransPreorderUnionPayReq.setTermNo("A1135688");
        v3LabsTransPreorderUnionPayReq.setOutTradeNo("7089279514841773301");
        v3LabsTransPreorderUnionPayReq.setAccountType("UQRCODEPAY");
        v3LabsTransPreorderUnionPayReq.setTransType("51");
        v3LabsTransPreorderUnionPayReq.setTotalAmount("10");
        v3LabsTransPreorderUnionPayReq.setNotifyUrl("http://www.test.com");
        v3LabsTransPreorderUnionPayReq.setRemark("备注");

        //地址位置信息
        V3LabsTradeLocationInfo v3LabsTradePreorderLocationInfo3 = new V3LabsTradeLocationInfo();
        v3LabsTradePreorderLocationInfo3.setRequestIp("117.88.221.21");
        v3LabsTradePreorderLocationInfo3.setLocation("+37.123456789,-121.123456789");
        v3LabsTransPreorderUnionPayReq.setLocationInfo(v3LabsTradePreorderLocationInfo3);


        //银联主扫场景下acc_busi_fields域内容
        V3LabsTradePreorderUnionPayBus unionPayBus = new V3LabsTradePreorderUnionPayBus();
        unionPayBus.setUserId("23425");
        unionPayBus.setFrontUrl("www.front.com");
        unionPayBus.setFrontFailUrl("www.fail.com");
        v3LabsTransPreorderUnionPayReq.setAccBusiFields(unionPayBus);

        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsTransPreorderAlipayReq);
        //4. 响应
        System.out.println(response);
    }

}
