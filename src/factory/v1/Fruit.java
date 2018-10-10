package factory.v1;

/**
 * 工厂类：负责生成各种实例
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:56
 **/
public class Fruit {
    public Fruit FruitInit(FruitType type) {
        switch (type) {
            case APPLE:
                return new Apple();
            case ORANGE:
                return new Orange();
            default:
                return null;
        }
    }
}
