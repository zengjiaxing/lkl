package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/8/16 15:24
 * @description 收银台订单-订单场景域
 */
public class V3CcssOrderSceneFieldInfo {

    /**
     * 订单场景类型
     * M
     * HB_FQ：花呗分期场景
     */
    @JsonProperty("order_scene_type")
    private String orderSceneType;

    /**
     * 订单场景信息
     * C
     * 订单场景信息（json字符串格式），不同的订单场景类型需要上送的结构不一样（详见具体场景）
     * @see HbFqSceneInfo
     */
    @JsonProperty("scene_info")
    private String sceneInfo;

    public String getOrderSceneType() {
        return orderSceneType;
    }

    public void setOrderSceneType(String orderSceneType) {
        this.orderSceneType = orderSceneType;
    }

    public String getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    public static class HbFqSceneInfo{
        /**
         * 花呗分期期数
         * M
         * 支付宝花呗分期必送字段: 花呗分期数 3：3期 6：6期 12：12期
         */
        @JsonProperty("hbFqNum")
        private String hbFqNum;

        /**
         * 卖家承担手续费比例
         * M
         * 支付宝花呗分期必送字段: 卖家承担收费比例，商家承担手续费传入100，用户承担手续费传入0，仅支持传入100、0两种，其他比例暂不支持 100：代表商家贴息 0：代表用户承担手续费
         */
        @JsonProperty("hbFqSellerPercent")
        private String hbFqSellerPercent;

        public String getHbFqNum() {
            return hbFqNum;
        }

        public void setHbFqNum(String hbFqNum) {
            this.hbFqNum = hbFqNum;
        }

        public String getHbFqSellerPercent() {
            return hbFqSellerPercent;
        }

        public void setHbFqSellerPercent(String hbFqSellerPercent) {
            this.hbFqSellerPercent = hbFqSellerPercent;
        }
    }
}
