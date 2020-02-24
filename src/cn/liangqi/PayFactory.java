package cn.liangqi;

/**
 * @author 张永琦
 * @date 2020/2/24
 * @describe
 */

public abstract class PayFactory {
    protected abstract Alipay createAlipay();
    protected abstract WeChat createWeChat();
}
