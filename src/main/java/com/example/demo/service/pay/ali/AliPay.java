package com.example.demo.service.pay.ali;

import com.example.demo.entity.so.*;
import com.example.demo.entity.vo.*;
import com.example.demo.service.pay.Pay;
import com.example.demo.utils.PaymenUtils;

public abstract class AliPay implements Pay {
    //=============================下面是支付的业务功能接口==================
    @Override
    public DoOrderVo doOrder(DoOrderSo so) {
        //子类实现  todo

        return null;
    }

    @Override
    public PayNotifyVo payNotify(PayNotifySo so) {
        //子类实现  todo

        return null;
    }

    @Override
    public QueryRefundVo queryRefund(QueryRefundSo so) {
        //子类实现  todo

        return null;
    }

    //=============================下面是支付的基础API和相关方法==================

    /**
     * 统一下单接口
     *
     * @param so
     */
    public AliUnifiedOrderVo unifiedOrder(AliUnifiedOrderSo so) {
        System.out.println("AliPay->unifiedOrder :" + so.toString());

        /**
         * 这里调用支付宝-支付API 发送下单请求,返回二维码链接等信息 ,
         */
        //todo 需要impl实现类里面组装好,通过参数传到本函数中....
        // 参数: 'body'  'appid  'mch_id'  'total_fee'  'trade_type'  'out_trade_no'   'notify_url'  'nonce_str'
        //  'trade_type'=='NATIVE'    'product_id'  'spbill_create_ip'
        //create_noncestr(32);  //创建随机数
        // 创建签名
        createSign(so.toString());

        //发送请求
        String resultXml = PaymenUtils.doPost("www.alipay/unifiedOrder", so.toString());

        //解析结果成实体,并返回
        AliUnifiedOrderVo unifiedOrderVo = PaymenUtils.parseAliUnifiedOrderResult(resultXml);

        return unifiedOrderVo;
    }


    /**
     * 生成签名
     */
    public void createSign(String params) {
        System.out.println("AliPay->createSign :" + params);
    }

    /**
     * 验证签名
     */
    public void checkSign(String params) {
        System.out.println("AliPay->checkSign :" + params);
    }


}
