package singleton.v1;

/**
 * 饿汉式（静态代码块块）[可用]
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:34
 **/
public class Singleton2 {
    private static Singleton2 singleton2;

    static {
        singleton2 = new Singleton2();
    }

    /**
     * 构造函数私有化：作用 限制new方法实例化此对象
     */
    private Singleton2() {
    }

    /**
     * 静态方法获取唯一的静态常量
     */
    public static Singleton2 getBook2() {
        return singleton2;
    }
}
