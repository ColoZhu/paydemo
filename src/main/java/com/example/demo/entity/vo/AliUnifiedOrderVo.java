package com.example.demo.entity.vo;


import lombok.Data;

/**
 * 统一下单返回结果
 */
@Data
public class AliUnifiedOrderVo {

    /**
     * 商品描述
     */
    private String body;
    /**
     * 商户订单号
     */
    private String outTradeNo;
    /**
     * 标价金额
     */
    private String totalFee;
    /**
     * 终端IP
     */
    private String spbillCreateIp;
    /**
     * 交易起始时间
     */
    private String timeStart;
    /**
     * 交易结束时间
     */
    private String timeExpire;
    /**
     * 交易类型
     */
    private String tradeType;
    /**
     * 通知地址
     */
    private String notifyUrl;
    /**
     * 商品ID(trade_type=NATIVE时，此参数必传。此参数为二维码中包含的商品ID，商户自行定义)
     */
    private String productId;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 返回状态码
     */
    private String returnCode;
    /**
     * 返回信息
     */
    private String returnMsg;
    /**
     * 二维码链接
     */
    private String codeUrl;
    /**
     * 随机字符串
     */
    private String nonceStr;

}
