package Visitor;

/**
 * ${DESCRIPTION}
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-18 10:51
 **/
public interface AccountBookViewer {
    //查看消费的单子
    void view(ConsumeBill bill);

    //查看收入的单子
    void view(IncomeBill bill);
}
