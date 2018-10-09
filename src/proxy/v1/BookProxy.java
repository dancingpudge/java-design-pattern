package proxy.v1;

/**
 * ProxySubject:代理主题角色。内部含有RealSubject的引用,负责对真实角色的调用，并在真实主题角色处理前后做预处理和善后工作。
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-09 14:31
 **/
public class BookProxy implements BookConcern {
    Book book;

    BookProxy(Book book) {
        this.book = book;
    }

    @Override
    public void sail() {
        //do something
        book.sail();
        //do something
    }
}
