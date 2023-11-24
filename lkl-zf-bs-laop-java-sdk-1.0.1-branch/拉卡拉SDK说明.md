欢迎使用 拉卡拉开放平台SDK for Java 。

拉卡拉开放平台SDK for Java让您不用复杂编程即可访拉卡拉开放平台开放的各项能力，SDK可以自动帮您满足能力调用过程中所需的证书校验、加签、验签、发送HTTP请求等非功能性要求。

## 版本管理

| 版本 | 日期 | 版本说明 | 
| --- | --- | --- | 
|v1.0.0 |    2023/08/11|    初始版本
|v1.0.1 |    2023/08/24|    增加拉卡拉回调通知验签解析方法；增加分账相关接口

## 环境要求

1. 需要使用`JDK 1.8`或其以上版本。
2. SDK接入准备

- 根据拉卡拉开放平台接入指引，生成密钥 参见 http://open.lakala.com/#/home/document/detail?id=33
- 接入方生成密钥对后，需要将公钥证书提供给拉卡拉，同时获取拉卡拉的公钥证书并保存。
- 拉卡拉为接入方分配appId
- 申请对应接口访问权限

3. 准备工作完成后，注意保存如下信息，后续将作为使用SDK的输入。`商户的私钥`、`商户的公钥`、`拉卡拉公钥证书`；

## 安装依赖

1. 将拉卡拉sdk打包deploy到自己私服仓库,通过maven管理项目 推荐通过Maven来管理项目依赖，您只需在项目的`pom.xml`文件中声明如下依赖
```
      <dependency>
         <groupId>com.lkl.laop.sdk</groupId>
         <artifactId>lkl-laop-java-sdk</artifactId>
         <version>1.0.0</version>
      </dependency>
```

2. 项目直接引入拉卡拉sdk jar包,并增加所需依赖

```   
      <dependency>
         <groupId>com.lkl.laop.sdk</groupId>
         <artifactId>lkl-laop-java-sdk</artifactId>
         <version>1.0.0</version>
         <systemPath>${project.basedir}/src/main/resources/lib/lkl-java-sdk-1.0.0.jar</systemPath>
         <scope>system</scope>
      </dependency>
      
      <dependency>
        <groupId>org.apache.httpcomponents</groupId>
        <artifactId>httpclient</artifactId>
        <version>4.5.13</version>
      </dependency>
      
      <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>1.7.30</version>
      </dependency>
      
      <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-simple</artifactId>
        <version>1.7.30</version>
      </dependency>
      
      <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.4</version>
      </dependency>
      
      <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.13.3</version>
      </dependency>
      
      <dependency>
         <groupId>javax.servlet</groupId>
         <artifactId>javax.servlet-api</artifactId>
         <version>4.0.1</version>
      </dependency>
```

## 快速使用

1. 安装好依赖库保证运行环境没问题，可直接运行SDK demo，如调用接口正常返回说明运行环境配置成功；
2. 更换接入配置(appId、序列化、私钥、拉卡拉证书)，看接口请求是否成功。如证书验证或加签验签失败，请检查相关配置；
3. DEMO中提供两种初始化接入配置参数的方式，可根据情况自行选择。

以下这段代码示例向您展示了使用拉卡拉SDK for Java调用一个API的4个主要步骤：

1. 初始SDK接入参数。系统初始化时只需做一次；
2. 创建API请求对象并设置请求参数；
3. 通过LKLSDK.httpPost()发起请求。
4. 处理响应或异常。

```java

        private static final String appId="拉卡拉开放平台进行配置开通";

        private static final String serialNo="商户证书序列号,和商户私钥对应";

        private static final String priKeyPath="商户私钥地址,用于请求签名";

        private static final String lklCerPath=" 拉卡拉公钥证书地址,用于验签";

        private static final String lklNotifyCerPath=" 拉卡拉支付平台证书地址2(用于拉卡拉通知验签，当前同lklCerPath)";
        
        private static final String serverUrl="拉卡拉开放平台服务地址";

        //初始化配置(全局只需配置一次)
        LKLSDK.init(new Config(appId,serialNo,priKeyPath,lklCerPath,lklNotifyCerPath,serverUrl));

        //根据请求接口拼装参数
        V3LabsTradeQueryRequest v3LabsTradeQueryRequest=new V3LabsTradeQueryRequest();
        v3LabsTradeQueryRequest.setMerchantNo("xxxx");
        v3LabsTradeQueryRequest.setTermNo("xxx");
        v3LabsTradeQueryRequest.setOutTradeNo("xxxx");

        //发起请求
        String response=LKLSDK.httpPost(v3LabsTradeQueryRequest);

        //处理响应
        log.info(response);


        //验签并解析请求
        String body = LKLSDK.notificationHandle(request);
        //业务逻辑
```

## 文档

[拉卡拉接口文档](http://open.lakala.com/#/home/document)