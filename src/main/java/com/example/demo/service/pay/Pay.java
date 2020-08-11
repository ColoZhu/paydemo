package com.example.demo.service.pay;


import com.example.demo.entity.so.DoOrderSo;
import com.example.demo.entity.so.PayNotifySo;
import com.example.demo.entity.so.QueryRefundSo;
import com.example.demo.entity.vo.DoOrderVo;
import com.example.demo.entity.vo.PayNotifyVo;
import com.example.demo.entity.vo.QueryRefundVo;

/**
 * 支付接口, 所有支付类的接口，系统所有支付功能类都需要实现它；
 */
public interface Pay {

    /**
     * 下单
     */
    DoOrderVo doOrder(DoOrderSo so);

    /**
     * 支付或者退款通知
     */
    PayNotifyVo payNotify(PayNotifySo so);

    /**
     * 查询退款
     */
    QueryRefundVo queryRefund(QueryRefundSo so);
}
