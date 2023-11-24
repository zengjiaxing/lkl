package com.lkl.laop.sdk;

import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.exception.SDKException;
import com.lkl.laop.sdk.exception.SDKExceptionEnums;
import com.lkl.laop.sdk.notification.NotificationHandler;
import com.lkl.laop.sdk.request.LklRequest;
import com.lkl.laop.sdk.utils.FileUtils;
import com.lkl.laop.sdk.utils.PemUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;

/**
 * LKLSDK
 *
 * @author zhangqiang
 * @version 1.0 2021/10/12 9:30
 **/
public class LKLSDK {

    private static final Logger log = LoggerFactory.getLogger(LKLSDK.class);

    private static CloseableHttpClient httpClient;

    private static NotificationHandler notificationHandler;

    /**
     * 连接超时时间
     */
    private static Integer sdkConnectTimeout = 50000;
    /**
     * 建立连接后超时时间
     */
    private static Integer sdkReadTimeout = 100000;
    /**
     * 读取数据超时时间
     */
    private static Integer sdkSocketTimeout = 50000;

    /**
     * 服务地址
     */
    private static String sdkServerUrl;

    public LKLSDK() {

    }

    /**
     * 配置文件--初始化SDK
     *
     * @param configPath
     * @return
     * @throws SDKException
     */
    public static boolean init(String configPath) throws SDKException {
        Config config = new Config();
        Properties properties = FileUtils.getProperties(configPath);
        config.setAppId(properties.getProperty("appId", ""));
        config.setSerialNo(properties.getProperty("serialNo", ""));
        config.setPriKeyPath(properties.getProperty("priKeyPath", ""));
        config.setLklCerPath(properties.getProperty("lklCerPath", ""));
        config.setLklNotifyCerPath(properties.getProperty("lklNotifyCerPath", ""));
        config.setConnectTimeout(Integer.parseInt(properties.getProperty("connectTimeout", "5000")));
        config.setReadTimeout(Integer.parseInt(properties.getProperty("readTimeout", "10000")));
        config.setSocketTimeout(Integer.parseInt(properties.getProperty("socketTimeout", "5000")));
        config.setServerUrl(properties.getProperty("serverUrl", ""));
        return init(config);
    }

    /**
     * Config--初始化SDK
     *
     * @param config
     * @return
     * @throws SDKException
     */
    public static boolean init(Config config) throws SDKException {
        return init(config.appId, config.serialNo, FileUtils.readFile(config.priKeyPath),
                FileUtils.readFile(config.lklCerPath), FileUtils.readFile(config.lklNotifyCerPath), config.getConnectTimeout(), config.getReadTimeout(),
                config.getSocketTimeout(), config.getServerUrl());
    }

    public static boolean init(String appId, String serialNo, String privateKey, String certificate, String notifyCertificate,
                               Integer connectTimeout, Integer readTimeout, Integer socketTimeout, String serverUrl) {
        try {
            if (StringUtils.isBlank(appId)) {
                log.error("SDK000009 拉卡拉appId");
                throw new SDKException(SDKExceptionEnums.CHECK_FAIL);
            }
            if (StringUtils.isBlank(serialNo)) {
                log.error("SDK000009 商户证书序列号");
                throw new SDKException(SDKExceptionEnums.CHECK_FAIL);
            }
            if (StringUtils.isBlank(privateKey)) {
                log.error("SDK000009 商户私钥信息");
                throw new SDKException(SDKExceptionEnums.CHECK_FAIL);
            }
            if (StringUtils.isBlank(certificate)) {
                log.error("SDK000009 拉卡拉平台证书");
                throw new SDKException(SDKExceptionEnums.CHECK_FAIL);
            }
            if (StringUtils.isBlank(notifyCertificate)) {
                log.error("SDK000009 拉卡拉平台通知验签证书");
                throw new SDKException(SDKExceptionEnums.CHECK_FAIL);
            }
            if (StringUtils.isBlank(serverUrl)) {
                log.error("SDK000009 拉卡拉serverUrl");
                throw new SDKException(SDKExceptionEnums.CHECK_FAIL);
            } else {
                sdkServerUrl = serverUrl;
            }
            if (!Objects.isNull(connectTimeout)) {
                sdkConnectTimeout = connectTimeout;
            }
            if (!Objects.isNull(readTimeout)) {
                sdkReadTimeout = readTimeout;
            }
            if (!Objects.isNull(socketTimeout)) {
                sdkSocketTimeout = socketTimeout;
            }
            PrivateKey merchantPrivateKey = PemUtil
                    .loadPrivateKey(new ByteArrayInputStream(privateKey.getBytes(StandardCharsets.UTF_8)));
            X509Certificate paySignatureCertificate = PemUtil
                    .loadCertificate(new ByteArrayInputStream(certificate.getBytes(StandardCharsets.UTF_8)));
            ArrayList<X509Certificate> listCertificates = new ArrayList<>();
            listCertificates.add(paySignatureCertificate);
            X509Certificate paySignatureNotifyCertificate = PemUtil
                    .loadCertificate(new ByteArrayInputStream(notifyCertificate.getBytes(StandardCharsets.UTF_8)));
            httpClient = LklHttpClientBuilder.create().withMerchant(appId, serialNo, merchantPrivateKey)
                    .withLklpay(listCertificates).build();
            notificationHandler = new NotificationHandler(paySignatureNotifyCertificate);
        } catch (Exception e) {
            log.error("初始化失败...", e);
            return false;
        }
        log.info("初始化成功...");
        return true;
    }

    /**
     * SDK get 请求
     *
     * @param url
     * @return
     * @throws SDKException
     *
     *                      public static String httpGet(String url) throws
     *                      SDKException { try { HttpGet httpGet = new HttpGet(url);
     *                      RequestConfig requestConfig = RequestConfig.custom()
     *                      .setConnectTimeout(sdkConnectTimeout)
     *                      .setConnectionRequestTimeout(sdkReadTimeout)
     *                      .setSocketTimeout(sdkSocketTimeout).build();
     *                      httpGet.setConfig(requestConfig);
     *                      httpGet.addHeader("Accept", "application/json");
     *                      CloseableHttpResponse response =
     *                      httpClient.execute(httpGet); if (response == null) {
     *                      log.error("response is null."); throw new
     *                      SDKException(SDKExceptionEnums.RES_IS_NULL); } int
     *                      responseCode = response.getStatusLine().getStatusCode();
     *                      if (responseCode != 200) { log.error("NC发送失败 --> {} ",
     *                      responseCode); throw new
     *                      SDKException(SDKExceptionEnums.BAD_REQ, "状态码:" +
     *                      responseCode); } HttpEntity entity =
     *                      response.getEntity(); response.close(); return
     *                      EntityUtils.toString(entity); } catch (SDKException se)
     *                      { throw se; } catch (Exception e) { log.error("未知异常 -->
     *                      url:{},err --> {}", url, e); throw new
     *                      SDKException(SDKExceptionEnums.ERROR.getCode(),
     *                      e.getMessage() == null ? "" : e.getMessage() +
     *                      e.getCause().getMessage() == null ? "" :
     *                      e.getCause().getMessage()); } }
     */

    /**
     * SDK post 请求
     *
     * @param request
     * @return
     * @throws SDKException
     */
    public static String httpPost(LklRequest request) throws SDKException {
        FunctionCodeEnum fcode = request.getFunctionCode();
        String url = fcode.getUrl();
        StringBuilder requestUrl = new StringBuilder(sdkServerUrl);
        if (!sdkServerUrl.endsWith("/")) {
            requestUrl.append("/");
        }
        requestUrl.append(url);
        String body = request.toBody();
        String response = httpPost(requestUrl.toString(), body);
        return response;
    }

    /**
     * SDK post 请求
     *
     * @param fullUrl API url 全路径
     * @param body    报文内容
     * @return
     * @throws SDKException
     */
    public static String httpPost(String fullUrl, String body) throws SDKException {
        try {
            log.info("httpPost url:" + fullUrl);
            HttpPost httpPost = new HttpPost(fullUrl);
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(sdkConnectTimeout)
                    .setConnectionRequestTimeout(sdkReadTimeout).setSocketTimeout(sdkSocketTimeout).build();
            InputStream stream = new ByteArrayInputStream(body.getBytes("utf-8"));
            InputStreamEntity reqEntity = new InputStreamEntity(stream);
            reqEntity.setContentType("application/json");
            httpPost.setEntity(reqEntity);
            httpPost.addHeader("Accept", "application/json");
            httpPost.setConfig(requestConfig);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            if (response == null) {
                log.error("response is null.");
                throw new SDKException(SDKExceptionEnums.RES_IS_NULL);
            }
            HttpEntity entity = response.getEntity();
            response.close();
            return EntityUtils.toString(entity);
        } catch (SDKException se) {
            throw se;
        } catch (Exception e) {
            log.error("异常 --> url:{},err --> {}", fullUrl, e);
            throw new SDKException(SDKExceptionEnums.ERROR.getCode(), e.getMessage() == null ? ""
                    : e.getMessage() + e.getCause().getMessage() == null ? "" : e.getCause().getMessage());
        }
    }

    public static String notificationHandle(HttpServletRequest request) throws SDKException {
        return notificationHandler.parse(request);
    }

}
