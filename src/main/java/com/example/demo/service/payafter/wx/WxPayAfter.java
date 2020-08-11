package com.example.demo.service.payafter.wx;

import com.example.demo.entity.vo.DoOrderVo;
import com.example.demo.entity.vo.PayNotifyVo;
import com.example.demo.entity.vo.QueryRefundVo;
import com.example.demo.service.payafter.PayAfter;

public abstract class WxPayAfter implements PayAfter {

    @Override
    public void doOrderAfter(DoOrderVo vo) {
        //子类实现
    }

    @Override
    public void payNotifyAfter(PayNotifyVo vo) {
        //子类实现
    }

    @Override
    public void queryRefundAfter(QueryRefundVo vo) {
        //子类实现
    }
}
