package com.example.demo.service.factory;

import com.example.demo.service.pay.Pay;
import com.example.demo.enums.PayWayEnum;
import com.example.demo.service.payafter.PayAfter;
import com.example.demo.utils.SpringContextUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;


/**
 * 工厂类
 * <p>
 * 工厂模式
 * <p>
 * 好处：
 * •一个调用者想创建一个对象，只要知道其名称就可以了
 * •扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以
 * •屏蔽产品的具体实现，调用者只关心产品的接口
 * 为什么用工厂模式呢？由于支付渠道很多，而且不同的支付渠道其实是有共性的，比如：支付、回调、查询、退款、退款查询等。
 * 把这些共同的东西抽出来当成一个 IPayChannel 接口，任何支付渠道都需要实现这个接口。
 * 接着上面的聚合支付，使用工厂模式可以将所有的支付渠道抽出一个模型出来，把它们的共同点全部封装成一个接口，不同的支付渠道都需要实现这个接口
 * <p>
 * 说明：
 * unifiedOrder是统一下单入口、
 * parsePayNotify是处理回调的、
 * orderQuery订单查询、
 * closeOrder订单关闭、
 * refund退款、
 * refundQuery退款查询
 * <p>
 * 根据支付类型{@link PayWayEnum} 返回Pay接口的具体实现
 * </p>
 */
@Service
public class PayFactory {
    /**
     * 具体支付方式的配置
     * key 表示支付方式,
     * value 表示支付具体实现类,** 注意这里类名小写
     */
    public static final Map<PayWayEnum, String> PAY_MAP = new HashMap<>(8);
    public static final Map<PayWayEnum, String> PAY_AFTER_MAP = new HashMap<>(8);

    static {
        PAY_MAP.put(PayWayEnum.WX_APP, "wxPayAppImpl");
        PAY_MAP.put(PayWayEnum.WX_NATIVE, "wxPayNativeImpl");
        PAY_MAP.put(PayWayEnum.ALI_APP, "aliPayAppImpl");
        PAY_MAP.put(PayWayEnum.ALI_WEB, "aliPayWebImpl");

        PAY_AFTER_MAP.put(PayWayEnum.WX_APP, "wxPayAppAfterImpl");
        PAY_AFTER_MAP.put(PayWayEnum.WX_NATIVE, "wxPayNativeAfterImpl");
        PAY_AFTER_MAP.put(PayWayEnum.ALI_APP, "aliPayAppAfterImpl");
        PAY_AFTER_MAP.put(PayWayEnum.ALI_WEB, "aliPayWebAfterImpl");
    }

    // 根据类型获取支付渠道的实现类
    public Pay getPay(PayWayEnum payWayEnum) {
        Assert.notNull(payWayEnum, "付款渠道不能为空");
        return (Pay) SpringContextUtil.getBean(PAY_MAP.get(payWayEnum));
    }

    //根据类型获取结果处理的实现类
    public PayAfter getPayAfter(PayWayEnum payWayEnum) {
        Assert.notNull(payWayEnum, "付款渠道不能为空");
        return (PayAfter) SpringContextUtil.getBean(PAY_AFTER_MAP.get(payWayEnum));
    }
}
