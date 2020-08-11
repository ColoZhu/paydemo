package com.example.demo.entity.so;

import lombok.Data;

/**
 * 统一下单
 */
@Data
public class AliUnifiedOrderSo {

    private String trade_type;
    private String trade_no;
    private String pay_body;

}
