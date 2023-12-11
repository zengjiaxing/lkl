package com.lkl.laop.sdk.request;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.lkl.laop.sdk.utils.JsonUtils;

/**
 * @Description: V3接口通用公共参数
 * @Author: lj
 * @Date 2021/6/22 18:10
 */
public  abstract class V3CommRequest implements LklRequest{


	public Map<String, Object> toBody() {
		Map<String, Object> param = new HashMap<>();
		param.put("req_time", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		param.put("version", "3.0");
		param.put("req_data", this);
		return param;
	}

}
