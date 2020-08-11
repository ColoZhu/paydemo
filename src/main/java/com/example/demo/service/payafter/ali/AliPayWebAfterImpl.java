package com.example.demo.service.payafter.ali;


import com.example.demo.entity.vo.AliWebDoOrderVo;
import com.example.demo.entity.vo.DoOrderVo;
import org.springframework.stereotype.Service;

@Service
public class AliPayWebAfterImpl extends AliPayAfter {

    @Override
    public void doOrderAfter(DoOrderVo vo) {
        //vo转换成对应的具体vo
        AliWebDoOrderVo result = (AliWebDoOrderVo) vo;
        System.out.println("支付宝-web-结果 :" + result.toString());

        //db操作
        System.out.println("支付宝-web-结果, DB记录一下相关数据:" + result.toString());
    }

}
