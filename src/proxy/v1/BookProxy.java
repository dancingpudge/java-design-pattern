package proxy.v1;

/**
 * 代理类
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
