package com.lkl.laop.sdk.demo.v3.trans;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V3LabsQueryIdmrefundqueryRequest;

/**
 * @author nxj
 * @date 2023/8/15 15:51
 * @description 商户订单退款查询
 */
public class V3LabsQueryIdmrefundqueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V3LabsQueryIdmrefundqueryRequest v3LabsQueryIdmrefundqueryRequest = new V3LabsQueryIdmrefundqueryRequest();
        v3LabsQueryIdmrefundqueryRequest.setMerchantNo("8222900581201QB");
        v3LabsQueryIdmrefundqueryRequest.setTermNo("D0027598");
        v3LabsQueryIdmrefundqueryRequest.setOutRefundOrderNo("2023081411032240975");

        //3. 发送请求
        String response = LKLSDK.httpPost(v3LabsQueryIdmrefundqueryRequest);

        //4. 响应
        System.out.println(response);
    }
}
