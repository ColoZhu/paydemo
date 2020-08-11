package com.example.demo.service.pay.ali;

import com.example.demo.entity.so.DoOrderSo;
import com.example.demo.entity.vo.DoOrderVo;
import org.springframework.stereotype.Service;

@Service
public class AliPayAppImpl extends AliPay {

    @Override
    public DoOrderVo doOrder(DoOrderSo so) {
        System.out.println("------支付宝支付-APP方式-------");
        //todo 具体实现省略
        return null;
    }
}
