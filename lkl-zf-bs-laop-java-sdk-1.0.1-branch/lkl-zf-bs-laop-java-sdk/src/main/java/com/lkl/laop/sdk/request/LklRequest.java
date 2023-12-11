package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

import java.util.Map;

public interface LklRequest {


    /**
     * functionCode对应接口url
     *
     * @return
     */
	@JsonIgnore
    FunctionCodeEnum getFunctionCode();


	/**
	 *转换为请求报文内容
	 * @return
	 */
	Map<String, Object> toBody();
}
