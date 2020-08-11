package com.example.demo.utils;

import com.example.demo.entity.vo.AliUnifiedOrderVo;
import com.example.demo.entity.vo.WxUnifiedOrderVo;

/**
 * Payment_utils可封装xml数据解析、各种加密解密函数等第三方支付平台所需的方法；
 */
public class PaymenUtils {


    /**
     * 发送HTTP
     *
     * @param url
     * @param params
     * @return
     */
    public static String doPost(String url, String params) {
        System.out.println("发送HTTP请求-url: " + url);
        System.out.println("发送HTTP请求-params: " + params);
        //todo  这里发送http.....
        return "发送HTTP请求后的xml格式数据";
    }


    /**
     * xml解析成实体
     *
     * @param resultXml
     * @return
     */
    public static WxUnifiedOrderVo parseWxUnifiedOrderResult(String resultXml) {
        //todo 这里去解析...
        WxUnifiedOrderVo result = new WxUnifiedOrderVo();

        return result;
    }

    /**
     * xml解析成实体
     *
     * @param resultXml
     * @return
     */
    public static AliUnifiedOrderVo parseAliUnifiedOrderResult(String resultXml) {
        //todo 这里去解析...
        AliUnifiedOrderVo result = new AliUnifiedOrderVo();

        return result;
    }
}
