package proxy.v1;

public class Main {

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
}
