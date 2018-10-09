package proxy.v1;

/**
 * RealSubject:真实主题角色。业务逻辑的具体执行者。
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-08 15:57
 **/
public class Book implements BookConcern {
    @Override
    public void sail() {
        System.out.println("卖书");
    }

}
