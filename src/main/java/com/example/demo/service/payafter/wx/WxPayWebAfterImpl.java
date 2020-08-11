package com.example.demo.service.payafter.wx;

import com.example.demo.entity.vo.DoOrderVo;
import com.example.demo.entity.vo.WxWebDoOrderVo;
import org.springframework.stereotype.Service;

@Service
public class WxPayWebAfterImpl extends WxPayAfter {

    @Override
    public void doOrderAfter(DoOrderVo vo) {
        //vo转换成对应的具体vo
        WxWebDoOrderVo result = (WxWebDoOrderVo) vo;
        System.out.println("微信-web-结果 :" + result.toString());

        //db操作
        System.out.println("微信-web-结果, DB记录一下相关数据:" + result.toString());
    }
}
