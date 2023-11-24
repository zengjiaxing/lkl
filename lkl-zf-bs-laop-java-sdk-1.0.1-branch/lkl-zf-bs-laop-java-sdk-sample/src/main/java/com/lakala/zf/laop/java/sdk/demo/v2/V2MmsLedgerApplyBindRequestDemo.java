package com.lakala.zf.laop.java.sdk.demo.v2;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V2MmsLedgerApplyBindRequest;

/**
 * @author nxj
 * @date 2023/8/22 16:07
 * @description 分账关系绑定申请(账户模式)demo
 */
public class V2MmsLedgerApplyBindRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsLedgerApplyBindRequest req = new V2MmsLedgerApplyBindRequest();
        req.setVersion("1.0");
        req.setOrderNo("2023082214373584317716");
        req.setOrgCode("1");
        req.setMerInnerNo("4002023082110197011");
        //req.setMerCupNo("8222900581201PA");
        req.setReceiverNo("SR2023081514001");
        req.setRetUrl("https://5436i50a67.zicp.fun/account/applyBind/notify");
        req.setEntrustFileName("酒店供应商系统培训文档说明书.pdf");
        req.setEntrustFilePath("MMS/20230821/20230821095301-1c87bc71bdf64870a5359f032e3d40fd.pdf");
        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }

}
