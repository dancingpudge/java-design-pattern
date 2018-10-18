package visitor;

import visitor.concrete.AccountBookViewer;
import visitor.element.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-18 10:52
 **/
public class AccountBook {
    /**
     * 单子列表
     */
    private List<Bill> billList = new ArrayList<>();

    /**
     * 添加单子
     */
    public void addBill(Bill bill) {
        billList.add(bill);
    }

    /**
     * 供账本的查看者查看账本
     */
    public void show(AccountBookViewer viewer) {
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }
}
