package proxy.v2;

public class Main {

    /**
     * 动态代理
     *
     * @param args
     */
    public static void main(String[] args) {
        Book book = new Book();
        //代理对象
        BookConcern proxy = new BookProxy(book).getProxyInstance();
        //执行代理方法
        proxy.function1();
        proxy.function2();
    }
}
