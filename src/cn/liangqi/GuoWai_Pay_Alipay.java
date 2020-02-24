package cn.liangqi;

/**
 * @author 张永琦
 * @date 2020/2/24
 * @describe
 */

public class GuoWai_Pay_Alipay implements Alipay{
    @Override
    public void alipay_payment() {
        System.out.println("国外的支付宝支付");
    }
}
