package com.lkl.laop.sdk.request;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author nxj
 * @date 2023/8/21 14:54
 * @description V2账管家通用公共参数
 */
public abstract class V2LeapRequest implements LklRequest {

    @Override
    public  Map<String, Object> toBody() {
        Map<String, Object> param = new HashMap<>();
        param.put("reqId", UUID.randomUUID().toString().replace("-", ""));
        param.put("timestamp", System.currentTimeMillis());
        param.put("ver", "2.0");
        param.put("reqData", this);
        return param;
    }
}
