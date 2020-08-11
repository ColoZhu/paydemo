package com.example.demo.entity.vo;


import lombok.Data;

/**
 * AliPay-Web-下单
 */
@Data
public class AliWebDoOrderVo extends AliDoOrderVo {

    private String webFlag;

    private AliUnifiedOrderVo aliUnifiedOrderVo;


}
