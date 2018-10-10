package singleton.v2;

/**
 * 懒汉式(线程安全，同步方法)[不推荐用]
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:42
 **/
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
