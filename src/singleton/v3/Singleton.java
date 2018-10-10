package singleton.v3;

/**
 * 双重检查[推荐用]
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:44
 **/
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
