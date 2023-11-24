package com.lakala.zf.laop.java.sdk.demo;

import com.lkl.laop.sdk.Config;
import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.exception.SDKException;

/***
 * @Description 功能描述：使用Java配置方式初始化SDK
 * @Date 2023/7/19 15:41
 */
public class BaseCommonDemo {

	private static String appId = "OP00000003"; // 拉卡拉appId
	private static String serialNo = "1752b7386f8"; // 你的证书序列号
	/**
	 * 商户私钥信息地址
	 */
	private static String priKeyPath = "lkl-zf-bs-laop-java-sdk-sample/src/main/resources/OP00000003商户私钥.txt";
	/**
	 * 拉卡拉付平台证书地址
	 */
	private static String lklCerPath = "lkl-zf-bs-laop-java-sdk-sample/src/main/resources/lakala开放平台证书.cer";
	/**
	 * 拉卡拉支付平台证书地址2(用于拉卡拉通知验签)
	 */
	private static final String lklNotifyCerPath = "lkl-zf-bs-laop-java-sdk-sample/src/main/resources/lakala开放平台证书.cer";

	/**
	 * 	服务地址
	 */
	private static String serverUrl = "https://test.wsmsd.cn/sit";

	private static boolean init = false;

	/***
	 * @Description: 初始化设置商户公共参数（全局只需设置一次）
	 * @throws Exception
	 */
	public static void doInit() throws Exception {
		if(!init) {
			init = initByJava();
		}
	}

	public static boolean initByJava() throws SDKException {
		Config config = new Config();
		config.setAppId(appId);
		config.setSerialNo(serialNo);
		config.setPriKeyPath(priKeyPath);
		config.setLklCerPath(lklCerPath);
		config.setLklNotifyCerPath(lklNotifyCerPath);
		config.setServerUrl(serverUrl);
		return LKLSDK.init(config);

	}

}
