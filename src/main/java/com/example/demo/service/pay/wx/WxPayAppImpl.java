package com.example.demo.service.pay.wx;

import com.example.demo.entity.so.DoOrderSo;
import com.example.demo.entity.vo.WxDoOrderVo;
import org.springframework.stereotype.Service;

@Service
public class WxPayAppImpl extends WxPay {
    @Override
    public WxDoOrderVo doOrder(DoOrderSo so) {
        System.out.println("------微信支付-APP方式------");
        //todo
        return super.doOrder(so);
    }
}
