package proxy.v1;

public class ProxyV1Main {

    /**
     * 最简单的静态代理
     *
     * @param args
     */
    public static void main(String[] args) {
        //目标对象
        Book book = new Book();
        //代理对象
        BookProxy proxy = new BookProxy(book);
        //执行代理方法
        proxy.sail();
    }

    /**
     * 代理模式优点：
     *
     * 职责清晰 真实角色只需关注业务逻辑的实现，非业务逻辑部分，后期通过代理类完成即可。
     * 高扩展性 不管真实角色如何变化，由于接口是固定的，代理类无需做任何改动。
     */
}
