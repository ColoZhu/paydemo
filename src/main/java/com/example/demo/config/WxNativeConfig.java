package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 微信-native支付的配置yml中信息
 * 这里简单配置部分...
 */
@Component
@ConfigurationProperties(prefix = "wx.native")
@Data
public class WxNativeConfig {
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
