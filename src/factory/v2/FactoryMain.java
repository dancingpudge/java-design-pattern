package factory.v2;

/**
 * 测试类，客户端使用
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 14:06
 **/
public class FactoryMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.FruitInit(Apple.class);
        fruit.FruitInit(Orange.class);
    }
}
