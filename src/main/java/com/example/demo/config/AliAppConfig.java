package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 阿里- app 支付的配置yml中信息
 * 这里简单配置部分...
 */
@Component
@ConfigurationProperties(prefix = "ali.app")
@Data
public class AliAppConfig {
    /**
     * 商户id
     */
    private String mchid;
    /**
     * appid
     */
    private String appid;
    /**
     * appkey
     */
    private String appkey;
}
