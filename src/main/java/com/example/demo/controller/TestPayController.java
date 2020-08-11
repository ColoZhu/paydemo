package com.example.demo.controller;

import com.example.demo.entity.so.DoOrderSo;
import com.example.demo.entity.vo.DoOrderVo;
import com.example.demo.enums.PayWayEnum;
import com.example.demo.service.pay.Pay;
import com.example.demo.service.factory.PayFactory;
import com.example.demo.service.payafter.PayAfter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testpay")
public class TestPayController {
    @Autowired
    private PayFactory payFactory;


    // http://localhost:8088/demo/testpay/hellopay
    //http://localhost:8088/demo/testpay/hellopay/WX_APP
    //http://localhost:8088/demo/testpay/hellopay/WX_NATIVE
    //http://localhost:8088/demo/testpay/hellopay/ZFB_APP
    //http://localhost:8088/demo/testpay/hellopay/ZFB_WEB
    @GetMapping("/hellopay/{typeEnum}")
    public String hello(@PathVariable("typeEnum") String typeEnumStr) {

        PayWayEnum typeEnum = PayWayEnum.valueOf(typeEnumStr);

        System.out.println("payFactory:" + payFactory);
        System.out.println("payFactory内存地址:" + System.identityHashCode(payFactory));

        Pay pay = payFactory.getPay(typeEnum);
        System.out.println("pay:" + pay);

        DoOrderSo doOrderSo = new DoOrderSo();
        doOrderSo.setOrderNo("下单的单号OrderNo_00001");
        doOrderSo.setTradeNo("下单的外部单号TradeNo_111111");

        //获取处理结果,这里实际或转换成具体的结果实现类
        DoOrderVo doOrderVo = pay.doOrder(doOrderSo);
        // 这里其实是具体的vo
        System.out.println("调用doOrder返回结果:doOrderVo :" + doOrderVo);

        //工厂获取支付后处理的实现类
        PayAfter payAfter = payFactory.getPayAfter(typeEnum);
        System.out.println("payAfter:" + payAfter);
        payAfter.doOrderAfter(doOrderVo);
        return null;
    }


}
