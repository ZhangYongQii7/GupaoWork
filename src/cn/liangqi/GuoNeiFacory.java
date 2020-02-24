package cn.liangqi;

/**
 * @author 张永琦
 * @date 2020/2/24
 * @describe
 */

public class GuoNeiFacory extends PayFactory {

    //国内的支付产品族

    @Override
    protected Alipay createAlipay() {
        return new GuoNei_Pay_Aliapay() ;
    }

    @Override
    protected WeChat createWeChat() {
        return new GuoNei_Pay_WeChat();
    }
}
