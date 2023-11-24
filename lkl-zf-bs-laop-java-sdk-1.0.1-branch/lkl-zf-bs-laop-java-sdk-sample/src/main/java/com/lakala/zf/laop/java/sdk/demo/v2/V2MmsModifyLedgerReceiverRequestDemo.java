package com.lakala.zf.laop.java.sdk.demo.v2;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.request.V2MmsModifyLedgerReceiverRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nxj
 * @date 2023/8/22 16:58
 * @description 分账接收方信息变更(账户模式)demo
 */
public class V2MmsModifyLedgerReceiverRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {
        // 1. 配置初始化
        doInit();

        //2. 装配数据
        V2MmsModifyLedgerReceiverRequest req = new V2MmsModifyLedgerReceiverRequest();
        req.setVersion("1.0");
        req.setOrderNo("2022052314154312973010");
        req.setOrgCode("1");
        req.setContactMobile("13728421998");
        req.setReceiverName("账接收方测试008账接收方测试008");
        req.setAcctOpenBankCode("03050000");
        req.setAcctOpenBankName("民生银行");
        req.setAcctNo("6222020230110171117");
        req.setAcctTypeCode("58");
        req.setReceiverNo("SR2023081514001");
        req.setReceiverName("分账接收方20220523768");
        req.setAcctOpenBankCode("102100000030");
        req.setAcctOpenBankName("中国工商银行股份有限公司北京市分行营业部");
        req.setAcctClearBankCode("102100099996");
        List<V2MmsModifyLedgerReceiverRequest.AttachInfo> attachList = new ArrayList<>();
        V2MmsModifyLedgerReceiverRequest.AttachInfo attachInfo = new V2MmsModifyLedgerReceiverRequest.AttachInfo();
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
