package cn.liangqi.work_2020_03_04;

/**
 * @author 张永琦
 * @date 2020/3/5
 * @describe
 */

public class NoLogin {
    public String NoLogin(Navigation navigation){

        navigation = new BaseMenu();
        //问答
        navigation =  new WenDaeDecorator(navigation);
        //文章
        navigation = new WenZhangDecorator(navigation);

        //精品课
        navigation = new KeChengDecorator(navigation);
        //冒泡
        navigation = new MaoPaoDecorator(navigation);
        //商城
        navigation = new ShangChengDecorator(navigation);
        return  navigation.Menu();
    }

}
