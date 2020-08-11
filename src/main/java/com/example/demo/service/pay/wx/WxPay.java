package com.example.demo.service.pay.wx;

import com.example.demo.entity.so.DoOrderSo;
import com.example.demo.entity.so.PayNotifySo;
import com.example.demo.entity.so.QueryRefundSo;
import com.example.demo.entity.so.WxUnifiedOrderSo;
import com.example.demo.entity.vo.PayNotifyVo;
import com.example.demo.entity.vo.QueryRefundVo;
import com.example.demo.entity.vo.WxUnifiedOrderVo;
import com.example.demo.entity.vo.WxDoOrderVo;
import com.example.demo.service.pay.Pay;
import com.example.demo.utils.PaymenUtils;

/**
 * 微信支付底层抽象类
 * <p>为对接第三方支付接口的支付抽象类，需要实现第三方支付接口的所有API交互，为支付功能类提供功能方法</p>
 * <p>每一种支付方法，都可以继承该抽象类，并拥有自己的独立的支付流程,</p>
 */
public abstract class WxPay implements Pay {

    //=============================下面是支付的业务功能接口==================

    @Override
    public WxDoOrderVo doOrder(DoOrderSo so) {
        //子类实现
        return null;
    }


    @Override
    public PayNotifyVo payNotify(PayNotifySo so) {
        //子类实现
        return null;
    }


    @Override
    public QueryRefundVo queryRefund(QueryRefundSo so) {
        //子类实现
        return null;
    }

    //=============================下面是微信支付的基础API和相关方法==================

    /**
     * 统一下单接口
     *
     * @param so
     */
    public WxUnifiedOrderVo unifiedOrder(WxUnifiedOrderSo so) {
        System.out.println("WxPay->unifiedOrder :" + so.toString());

        /**
         * 这里调用微信支付API 发送下单请求,返回二维码链接等信息 ,
         */
        //todo 需要impl实现类里面组装好,通过参数传到本函数中....
        // 参数: 'body'  'appid  'mch_id'  'total_fee'  'trade_type'  'out_trade_no'   'notify_url'  'nonce_str'
        //  'trade_type'=='NATIVE'    'product_id'  'spbill_create_ip'
        //create_noncestr(32);  //创建随机数
        // 创建签名
        createSign(so.toString());

        //发送请求
        String resultXml = PaymenUtils.doPost("www.weixinpay/unifiedOrder", so.toString());

        //解析结果成实体,并返回
        WxUnifiedOrderVo wxUnifiedOrderVo = PaymenUtils.parseWxUnifiedOrderResult(resultXml);

        return wxUnifiedOrderVo;
    }


    /**
     * 生成签名
     */
    public void createSign(String params) {
        System.out.println("WxPay->createSign :" + params);
    }

    /**
     * 验证签名
     */
    public void checkSign(String params) {
        System.out.println("WxPay->checkSign :" + params);
    }

}
