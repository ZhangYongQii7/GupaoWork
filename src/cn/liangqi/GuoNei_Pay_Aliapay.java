package cn.liangqi;

/**
 * @author 张永琦
 * @date 2020/2/24
 * @describe
 */

public class GuoNei_Pay_Aliapay implements  Alipay {
    @Override
    public void alipay_payment() {
        System.out.println("国内支付宝支付");
    }
}
