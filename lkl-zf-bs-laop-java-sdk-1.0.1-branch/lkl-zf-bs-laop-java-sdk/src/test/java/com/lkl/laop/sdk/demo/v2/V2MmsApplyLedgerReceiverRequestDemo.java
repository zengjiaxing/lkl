package com.lkl.laop.sdk.demo.v2;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.request.V2MmsApplyLedgerReceiverRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/8/22 16:28
 * @description 分账接收方创建申请(账户模式)demo
 */
public class V2MmsApplyLedgerReceiverRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsApplyLedgerReceiverRequest req = new V2MmsApplyLedgerReceiverRequest();
        req.setVersion("1.0");
        req.setOrderNo("20230821153025407882811");
        req.setOrgCode("1");

        req.setContactMobile("15659720037");
        req.setReceiverName("wedcat");
        req.setAcctCertificateNo("350521199908121516");
        req.setAcctOpenBankCode("105397100984");
        req.setAcctOpenBankName("中国建设银行股份有限公司惠安支行");
        req.setAcctName("曾嘉兴");
        req.setAcctNo("6217001830045975961");
        req.setAcctTypeCode("58");
        req.setAcctCertificateType("17");
        List<V2MmsApplyLedgerReceiverRequest.AttachInfo> attachList = new ArrayList<>();
        V2MmsApplyLedgerReceiverRequest.AttachInfo attachInfo = new V2MmsApplyLedgerReceiverRequest.AttachInfo();
        attachInfo.setAttachName("附件1");
        attachInfo.setAttachStorePath("MMS/20230817/20230817171141-234b3a8ef3c443ae806464d5a954d719.jpg");
        attachInfo.setAttachType("1");
        attachList.add(attachInfo);
        req.setAttachList(attachList);
        //3. 发送请求
        String response = LKLSDK.httpPost(req);

        //4. 响应
        System.out.println(response);
    }
}
