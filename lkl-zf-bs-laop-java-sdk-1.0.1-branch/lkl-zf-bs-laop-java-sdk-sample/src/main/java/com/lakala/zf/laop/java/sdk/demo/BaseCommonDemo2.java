package com.lakala.zf.laop.java.sdk.demo;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.exception.SDKException;

/***
 * @Description 功能描述：使用properties文件配置方式初始化SDK
 * @Date 2023/7/19 15:41
 */
public class BaseCommonDemo2 {

	private static String configPath = "./src/test/java/resources/lkl-sdk-config.properties";

	private static boolean init = false;

	/***
	 * @Description: 初始化设置商户公共参数（全局只需设置一次）
	 * @throws Exception
	 */
	public static void doInit() throws Exception {
		if (!init) {
			init = initByFile();
		}
	}

	public  static boolean initByFile() throws SDKException {
		return LKLSDK.init(configPath);
	}
}
