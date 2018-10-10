package singleton.v2;

/**
 * 懒汉式(线程不安全)[不可用]
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:40
 **/
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
