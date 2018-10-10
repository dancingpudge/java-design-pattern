package singleton.v2;

/**
 * 懒汉式(线程安全，同步代码块)[不可用]
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:43
 **/
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton.class) {
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }
}
