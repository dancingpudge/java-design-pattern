package factory.v2;

/**
 * 工厂类：负责生成各种实例
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:56
 **/
public class Fruit {
    public Fruit FruitInit(Class cl) {
        if (cl.equals(Apple.class)) {
            return new Apple();
        }
        if (cl.equals(Orange.class)) {
            return new Orange();
        }
        return null;
    }
}
