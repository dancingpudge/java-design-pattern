package proxy.v2;

import java.lang.reflect.Proxy;

/**
 * 代理类
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-09 14:31
 **/
public class BookProxy {

    private Object target;

    public BookProxy(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     */
    public BookConcern getProxyInstance() {
        return (BookConcern) Proxy.newProxyInstance(
                target.getClass().getClassLoader()
                , target.getClass().getInterfaces(),
                (proxy, method, args) -> method.invoke(target, args)
        );
    }
}
