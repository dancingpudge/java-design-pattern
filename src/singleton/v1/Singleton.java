package singleton.v1;

/**
 * 饿汉式（静态常量）[可用]
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:30
 **/
public class Singleton {
    /**
     * 静态常量保证对象只有一个实例
     */
    private static Singleton singleton = new Singleton();

    /**
     * 构造函数私有化：作用 限制new方法实例化此对象
     */
    private Singleton() {
    }

    /**
     * 静态方法获取唯一的静态常量
     */
    public static Singleton getSingleton() {
        return singleton;
    }
}
