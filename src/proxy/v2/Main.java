package proxy.v2;

public class Main {

    /**
     * 动态代理
     *
     * @param args
     */
    public static void main(String[] args) {
        Book1 book1 = new Book1();
        //代理对象
        BookConcern proxy = new BookProxy(book1).getProxyInstance();
        //执行代理方法
        proxy.function1();

        Book2 book2 = new Book2();
        //代理对象
        BookConcern proxy2 = new BookProxy(book2).getProxyInstance();
        //执行代理方法
        proxy2.function2();
    }

    /**
     * 总结一下，一个典型的动态代理可分为以下四个步骤：
     *
     * 创建抽象角色
     * 创建真实角色
     * 通过实现InvocationHandler接口创建中介类
     * 通过场景类，动态生成代理类
     */

}
