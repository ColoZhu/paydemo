package com.example.demo.entity.vo;


import lombok.Data;

/**
 * 微信- web-下单
 */
@Data
public class WxWebDoOrderVo extends WxDoOrderVo {

    private String nativeFlag;

    private WxUnifiedOrderVo wxUnifiedOrderVo;


}
