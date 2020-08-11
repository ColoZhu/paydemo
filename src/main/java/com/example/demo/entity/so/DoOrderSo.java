package com.example.demo.entity.so;


import lombok.Data;

/**
 * 下单
 */
@Data
public class DoOrderSo {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 外部交易单号
     */
    private String tradeNo;

}
