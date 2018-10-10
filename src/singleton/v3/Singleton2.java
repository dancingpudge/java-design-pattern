package singleton.v3;

/**
 * 静态内部类[推荐用]
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-10 13:45
 **/
public class Singleton2 {
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}
