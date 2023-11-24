package com.lkl.laop.sdk.demo;

import com.lkl.laop.sdk.LKLSDK;
import com.lkl.laop.sdk.exception.SDKException;

/***
 * @Description 功能描述：使用properties文件配置方式初始化SDK。自行组装请求报文方式调用接口，请参考各API文档，该方法适用所有接口。
 * @Date 2023/7/19 15:41
 */
public class LKLSDKDemo {
	private static String configPath = "./src/test/java/resources/lkl-sdk-config.properties";

	private static boolean init = false;

	private static String reqData = "{\"req_data\":{\"merchant_no\":\"3222900594309B8\",\"term_no\":\"A1135688\",\"out_trade_no\":\"7089279514841771109\",\"trade_no\":\"2023072666210309260100\"},\"version\":\"3.0\",\"req_time\":\"20230810163100\"}";


	public static void main(String[] args) {
		try {
			doInit();
			String res = LKLSDK.httpPost("https://test.wsmsd.cn/sit/api/v3/labs/query/tradequery",reqData);
	        System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

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
