package factory.v1;

/**
 * 具体对象
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 14:08
 **/
public class Orange extends Fruit {
    static {
        System.out.println("生产   Orange");
    }
}
