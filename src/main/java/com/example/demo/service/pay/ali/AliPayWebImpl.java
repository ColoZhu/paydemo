package com.example.demo.service.pay.ali;

import com.example.demo.config.AliWebConfig;
import com.example.demo.entity.so.AliUnifiedOrderSo;
import com.example.demo.entity.so.DoOrderSo;
import com.example.demo.entity.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliPayWebImpl extends AliPay {


    /**
     * ali相关配置
     */
    @Autowired
    protected AliWebConfig aliWebConfig;

    @Override
    public AliDoOrderVo doOrder(DoOrderSo so) {
        System.out.println("------支付宝支付-WEB方式------");

        //支付宝-支付统一下单,组装一波参数,包括 aliWebConfig 中配置参数
        AliUnifiedOrderSo unifiedOrderSo = new AliUnifiedOrderSo();
        unifiedOrderSo.setTrade_no(so.getTradeNo());
        unifiedOrderSo.setPay_body("商品描述: " + so.getOrderNo());

        //调用统一下单
        AliUnifiedOrderVo unifiedOrderVo = super.unifiedOrder(unifiedOrderSo);
        ;
        //定义返回的数据格式,用于记录DB等后处理
        AliWebDoOrderVo doOrderVo = new AliWebDoOrderVo();
        doOrderVo.setAliUnifiedOrderVo(unifiedOrderVo);
        doOrderVo.setQrCodeUrl("支付宝支付-WEB方式-qrcodeurl-www//alipay.com/huggwdw");
        doOrderVo.setWebFlag("WEB方式-flag");

        return doOrderVo;
    }


}
