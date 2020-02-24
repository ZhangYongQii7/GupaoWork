package cn.liangqi;

/**
 * @author 张永琦
 * @date 2020/2/24
 * @describe
 */

public class PayTest {
    public static void main(String[] args) {
        GuoNeiFacory guoNeiFacory = new GuoNeiFacory();
        guoNeiFacory.createAlipay().alipay_payment();
        guoNeiFacory.createWeChat().wechat_payment();
    }
}
