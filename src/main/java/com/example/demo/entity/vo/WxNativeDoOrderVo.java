package com.example.demo.entity.vo;


import lombok.Data;

/**
 * 微信Native-下单
 */
@Data
public class WxNativeDoOrderVo extends WxDoOrderVo {

    private String nativeFlag;

    private WxUnifiedOrderVo wxUnifiedOrderVo;


}
