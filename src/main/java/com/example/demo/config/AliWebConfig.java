package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 阿里-web支付的配置yml中信息
 * 这里简单配置部分...
 */
@Component
@ConfigurationProperties(prefix = "ali.web")
@Data
public class AliWebConfig {
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
