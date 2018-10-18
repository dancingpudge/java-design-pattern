package Visitor;

/**
 * ${DESCRIPTION}
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-18 10:50
 **/
public interface Bill {
    void accept(AccountBookViewer viewer);
}
