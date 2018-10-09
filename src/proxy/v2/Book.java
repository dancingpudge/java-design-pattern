package proxy.v2;

/**
 * 具体实现
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-08 15:57
 **/
public class Book implements BookConcern {
    @Override
    public void function1() {
        System.out.println("卖书");
    }

    @Override
    public void function2() {

    }

}
