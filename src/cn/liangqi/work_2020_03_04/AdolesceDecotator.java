package cn.liangqi.work_2020_03_04;

/**
 * @author 张永琦
 * @date 2020/3/5
 * @describe
 */

public class AdolesceDecotator extends  BaseMenuDecotator {

    public AdolesceDecotator(Navigation navigation) {
        super(navigation);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String Menu() {
        return super.Menu()+" 成长墙 ";
    }
}
