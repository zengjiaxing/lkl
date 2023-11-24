package com.lakala.zf.laop.java.sdk.demo.notify;

import com.lakala.zf.laop.java.sdk.demo.BaseCommonDemo;
import com.lkl.laop.sdk.LKLSDK;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author nxj
 * @date 2023/8/18 17:02
 * @description 处理拉卡拉推送DEMO
 */
@RestController
public class NotificationHandlerDemo extends BaseCommonDemo {

    @RequestMapping("/messageHandle")
    public ResponseEntity<?> messageHandle(HttpServletRequest request) throws Exception {
        // 1. 配置初始化
        doInit();

        //验签并解析请求
        String body = LKLSDK.notificationHandle(request);
        System.out.println("验签成功,请求body：" + body);

        //业务处理


        return ResponseEntity.ok(body);
    }

}
