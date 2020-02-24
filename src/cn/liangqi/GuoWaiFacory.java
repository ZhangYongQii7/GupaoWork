package cn.liangqi;

/**
 * @author 张永琦
 * @date 2020/2/24
 * @describe
 */

public class GuoWaiFacory extends PayFactory {
    //国外的产品族

    @Override
    protected Alipay createAlipay() {
        return new GuoWai_Pay_Alipay();
    }

    @Override
    protected WeChat createWeChat() {
        return new GuoWai_Pay_WeChat();
    }
}
