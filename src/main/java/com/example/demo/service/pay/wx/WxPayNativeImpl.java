package com.example.demo.service.pay.wx;

import com.example.demo.config.WxNativeConfig;
import com.example.demo.entity.so.DoOrderSo;
import com.example.demo.entity.so.WxUnifiedOrderSo;
import com.example.demo.entity.vo.WxUnifiedOrderVo;
import com.example.demo.entity.vo.WxDoOrderVo;
import com.example.demo.entity.vo.WxNativeDoOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信Native支付中间层
 * <p>系统支付功能类，调用抽象类的各基础方法，为系统提供支付、查询、退款、退款查询等功能；</p>
 */
@Service
public class WxPayNativeImpl extends WxPay {

    /**
     * 微信相关配置
     */
    @Autowired
    protected WxNativeConfig wxNativeConfig;

    @Override
    public WxDoOrderVo doOrder(DoOrderSo so) {
        System.out.println("------微信支付-Native方式------");

        //微信支付统一下单,组装一波参数,包括wxNativeConfig中配置参数
        // todo
        WxUnifiedOrderSo unifiedOrderSo = new WxUnifiedOrderSo();
        unifiedOrderSo.setTrade_no(so.getTradeNo());
        unifiedOrderSo.setPay_body("商品描述: " + so.getOrderNo());

        //调用统一下单
        WxUnifiedOrderVo wxUnifiedOrderVo = super.unifiedOrder(unifiedOrderSo);

        //定义返回的数据格式,用于记录DB等后处理
        WxNativeDoOrderVo wxNativeDoOrderVo = new WxNativeDoOrderVo();
        wxNativeDoOrderVo.setWxUnifiedOrderVo(wxUnifiedOrderVo);
        wxNativeDoOrderVo.setQrCodeUrl("微信支付-Native方式-qrcodeurl-www//wechat.com/huggwdw");
        wxNativeDoOrderVo.setNativeFlag("Native方式-flag");

        return wxNativeDoOrderVo;
    }


}
