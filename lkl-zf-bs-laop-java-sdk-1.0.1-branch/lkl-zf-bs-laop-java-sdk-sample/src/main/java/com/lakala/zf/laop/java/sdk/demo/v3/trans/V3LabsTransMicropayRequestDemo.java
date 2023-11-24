package com.lakala.zf.laop.java.sdk.demo.v3.trans;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V3LabsTransMicropayRequest;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;
import com.lkl.laop.sdk.request.model.V3LabsTradeMicropayAlipayBus;
import com.lkl.laop.sdk.request.model.V3LabsTradeMicropayWechatBus;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/7/21 17:07
 * @description v3被扫交易测试-DEMO
 */
public class V3LabsTransMicropayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();
        //2. 装配数据
        /*** 微信被扫场景示例 */
        V3LabsTransMicropayRequest v3LabsTransMicropayWechatReq = new V3LabsTransMicropayRequest();
        v3LabsTransMicropayWechatReq.setMerchantNo("8222900701106DH");
        v3LabsTransMicropayWechatReq.setTermNo("D1041218");
        v3LabsTransMicropayWechatReq.setOutTradeNo("000002390028901103");
        v3LabsTransMicropayWechatReq.setAuthCode("121818380539644444");
        v3LabsTransMicropayWechatReq.setTotalAmount("1");
        v3LabsTransMicropayWechatReq.setNotifyUrl("https://testca/notify");
        v3LabsTransMicropayWechatReq.setRemark("备注");

        V3LabsTradeLocationInfo v3LabsTradeLocationInfo1 = new V3LabsTradeLocationInfo("12.34.56.78");
        v3LabsTransMicropayWechatReq.setLocationInfo(v3LabsTradeLocationInfo1);

        V3LabsTradeMicropayWechatBus wechatBus = new V3LabsTradeMicropayWechatBus();
        wechatBus.setSubAppid("wx68edd02e");
        wechatBus.setGoodsTag("ceshi");
        wechatBus.setGoodsTag("1");
        wechatBus.setSceneInfo("{\"store_info\":{\"id\": \"123\",\"name\": \"456\",\"area_code\": \"2345\",\"address\": \"地址\" }}");

        V3LabsTradeMicropayWechatBus.AccBusiDetail accBusiDetail = new V3LabsTradeMicropayWechatBus.AccBusiDetail();
        List<V3LabsTradeMicropayWechatBus.WechatGoodsDetail> wechatGoodsDetails = new ArrayList<>();
        V3LabsTradeMicropayWechatBus.WechatGoodsDetail wechatGoodsDetail = new V3LabsTradeMicropayWechatBus.WechatGoodsDetail();
        wechatGoodsDetail.setGoodsId("100734033");
        wechatGoodsDetail.setPrice(50);
        wechatGoodsDetail.setQuantity(1);
        wechatGoodsDetails.add(wechatGoodsDetail);
        accBusiDetail.setCostPrice(555);
        accBusiDetail.setGoodsDetail(wechatGoodsDetails);
        wechatBus.setDetail(accBusiDetail);
        v3LabsTransMicropayWechatReq.setAccBusiFields(wechatBus);


        /*** 支付宝被扫场景示例 */
        V3LabsTransMicropayRequest v3LabsTransMicropayAlipayReq = new V3LabsTransMicropayRequest();
        v3LabsTransMicropayAlipayReq.setMerchantNo("8222900701106DH");
        v3LabsTransMicropayAlipayReq.setTermNo("D1041218");
        v3LabsTransMicropayAlipayReq.setOutTradeNo("000002390028906602");
        v3LabsTransMicropayAlipayReq.setAuthCode("284073545277972786");
        v3LabsTransMicropayAlipayReq.setTotalAmount("1");
        v3LabsTransMicropayAlipayReq.setNotifyUrl("https://testca/notify");
        v3LabsTransMicropayAlipayReq.setRemark("备注");

        V3LabsTradeLocationInfo v3LabsTradeLocationInfo2 = new V3LabsTradeLocationInfo("12.34.56.79");
        v3LabsTransMicropayAlipayReq.setLocationInfo(v3LabsTradeLocationInfo2);


        V3LabsTradeMicropayAlipayBus alipayBus = new V3LabsTradeMicropayAlipayBus();
        alipayBus.setStoreId("11111");

        //支付宝goods_detail字段说明
        List<V3LabsTradeMicropayAlipayBus.AlipayGoodsDeTail> goodsDeTails = new ArrayList<>();
        V3LabsTradeMicropayAlipayBus.AlipayGoodsDeTail alipayGoodsDeTail1 = new V3LabsTradeMicropayAlipayBus.AlipayGoodsDeTail();
        alipayGoodsDeTail1.setAlipayGoodsId("6666");
        alipayGoodsDeTail1.setGoodsId("123");
        alipayGoodsDeTail1.setGoodsName("测试商品");
        alipayGoodsDeTail1.setQuantity("1");
        alipayGoodsDeTail1.setPrice("666");
        alipayGoodsDeTail1.setShowUrl("www.baidu.com");
        V3LabsTradeMicropayAlipayBus.AlipayGoodsDeTail alipayGoodsDeTail2 = new V3LabsTradeMicropayAlipayBus.AlipayGoodsDeTail();
        alipayGoodsDeTail2.setAlipayGoodsId("5555");
        alipayGoodsDeTail2.setGoodsId("7899");
        alipayGoodsDeTail2.setGoodsName("测试商品2");
        alipayGoodsDeTail2.setQuantity("2");
        alipayGoodsDeTail2.setPrice("555");
        alipayGoodsDeTail2.setShowUrl("www.baidu.com");
        goodsDeTails.add(alipayGoodsDeTail1);
        goodsDeTails.add(alipayGoodsDeTail2);
        alipayBus.setGoodsDetail(goodsDeTails);

        v3LabsTransMicropayAlipayReq.setAccBusiFields(alipayBus);

        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsTransMicropayAlipayReq);
        //4. 响应
        System.out.println(response);
    }
}
