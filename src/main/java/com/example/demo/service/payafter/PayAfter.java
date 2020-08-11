package com.example.demo.service.payafter;


import com.example.demo.entity.vo.DoOrderVo;
import com.example.demo.entity.vo.PayNotifyVo;
import com.example.demo.entity.vo.QueryRefundVo;

/**
 * 系统业务处理接口,主要是对DB的数据操作
 * 支付后置业务
 */
public interface PayAfter {

    /**
     * 下单-后处理逻辑
     *
     * @param vo
     */
    void doOrderAfter(DoOrderVo vo);

    /**
     * 支付或者退款通知-后处理逻辑
     *
     * @param
     */
    void payNotifyAfter(PayNotifyVo vo);

    /**
     * 查询退款-后处理逻辑
     *
     * @param vo
     */
    void queryRefundAfter(QueryRefundVo vo);
}
