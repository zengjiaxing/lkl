package com.lkl.laop.sdk.demo.v2;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V2MmsLedgerApplyUnBindRequest;

/**
 * @author nxj
 * @date 2023/8/22 16:17
 * @description
 */
public class V2MmsLedgerApplyUnBindRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsLedgerApplyUnBindRequest req = new V2MmsLedgerApplyUnBindRequest();
        req.setVersion("1.0");
        req.setOrderNo("2023082214373584317714");
        req.setOrgCode("1");
        req.setMerInnerNo("4002023082110197011");
        req.setMerCupNo("8222900581201PA");
        req.setReceiverNo("SR2023081514001");
        req.setRetUrl("https://5436i50a67.zicp.fun/account/applyBind/notify");
        req.setEntrustFileName("酒店供应商系统培训文档说明书.pdf");
        req.setEntrustFilePath("MMS/20230821/20230821095301-1c87bc71bdf64870a5359f032e3d40fd.pdf");
        req.setRemark("测试");
        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }

}
