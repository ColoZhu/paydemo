package com.example.demo.entity.vo;


import lombok.Data;

import java.util.Date;

/**
 * 下单
 */
@Data
public class DoOrderVo {
    /**
     * 二维码
     */
    private String qrCodeUrl;
    /**
     * 二维码创建时间
     */
    private Date qrCodeCreateTime;


}
