package com.lkl.laop.sdk;

import java.io.Serializable;

/**
 * Config
 *
 * @author zhangqiang
 * @version 1.0
 * 2021/10/12 9:06
 **/
public class Config implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 拉卡拉appId
     */
    protected String appId;
    /**
     * 商户证书序列号
     */
    protected String serialNo;
    /**
     * 商户私钥信息地址
     */
    protected String priKeyPath;
    /**
     * 拉卡拉支付平台证书地址(用于拉卡拉响应验签)
     */
    protected String lklCerPath;
    /**
     * 拉卡拉支付平台证书地址2(用于拉卡拉通知推送验签)
     */
    protected String lklNotifyCerPath;
    /**
     * 连接超时时间
     */
    protected Integer connectTimeout;
    /**
     * 建立连接后超时时间
     */
    protected Integer readTimeout;
    /**
     * 读取数据超时时间
     */
    protected Integer socketTimeout;

    /**
     * API服务地址
     */
    protected String serverUrl;

    public Config() {
    }

    public Config(String appId, String serialNo, String priKeyPath, String lklCerPath, String notifyLklCerPath, String serverUrl) {
        this.appId = appId;
        this.serialNo = serialNo;
        this.priKeyPath = priKeyPath;
        this.lklCerPath = lklCerPath;
        this.lklNotifyCerPath = notifyLklCerPath;
        this.serverUrl = serverUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPriKeyPath() {
        return priKeyPath;
    }

    public void setPriKeyPath(String priKeyPath) {
        this.priKeyPath = priKeyPath;
    }

    public String getLklCerPath() {
        return lklCerPath;
    }

    public void setLklCerPath(String lklCerPath) {
        this.lklCerPath = lklCerPath;
    }

    public String getLklNotifyCerPath() {
        return lklNotifyCerPath;
    }

    public void setLklNotifyCerPath(String lklNotifyCerPath) {
        this.lklNotifyCerPath = lklNotifyCerPath;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

}
