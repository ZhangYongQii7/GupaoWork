package cn.liangqi.work_2020_03_04;

/**
 * @author 张永琦
 * @date 2020/3/5
 * @describe
 */

public abstract class BaseMenuDecotator extends Navigation {

    private Navigation navigation;

    public BaseMenuDecotator(Navigation navigation) {
        this.navigation = navigation;
    }

    protected abstract void doSomething();

    @Override
    protected String Menu() {
        return this.navigation.Menu();
    }


}
