package cn.liangqi.work_2020_03_04;

/**
 * @author 张永琦
 * @date 2020/3/5
 * @describe
 */

public  class BaseMenuTest {

    public static void main(String[] args) {

        Navigation navigation;
        //登录状态
        Boolean falg = true;
        //未登录的时候
        navigation = new BaseMenu();
        if (!falg){
            VipLogin vipLogin = new VipLogin();
            System.out.println("登录的导航栏按钮: "+vipLogin.NoLogin(navigation));

        }else {
            NoLogin noLogin = new NoLogin();
            System.out.println("未登录的导航栏按钮: "+noLogin.NoLogin(navigation));
        }
    }


}
