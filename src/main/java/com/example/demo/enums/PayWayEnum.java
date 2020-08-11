package com.example.demo.enums;

import com.example.demo.service.factory.PayFactory;

/**
 * 支付类型枚举类
 * <p>
 * 每增加一种支付渠道,需要同时在工厂类{@link PayFactory}里面配置
 * </p>
 */
public enum PayWayEnum {
    /**
     * WX_APP
     */
    WX_APP("WX_APP"),
    /**
     * WX_NATIVE
     */
    WX_NATIVE("WX_NATIVE"),
    /**
     * ALI_APP
     */
    ALI_APP("ALI_APP"),
    /**
     * ALI_WEB
     */
    ALI_WEB("ALI_WEB");


    PayWayEnum(String key) {
    }

}
