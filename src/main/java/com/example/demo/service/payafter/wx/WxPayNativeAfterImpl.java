package com.example.demo.service.payafter.wx;

import com.example.demo.entity.vo.DoOrderVo;
import com.example.demo.entity.vo.WxNativeDoOrderVo;
import org.springframework.stereotype.Service;

@Service
public class WxPayNativeAfterImpl extends WxPayAfter {

    @Override
    public void doOrderAfter(DoOrderVo vo) {
        //vo转换成对应的具体vo
        WxNativeDoOrderVo result = (WxNativeDoOrderVo) vo;
        System.out.println("微信-native-结果 :" + result.toString());

        //db操作
        System.out.println("微信-native-结果, DB记录一下相关数据:" + result.toString());
    }
}
