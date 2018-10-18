package Visitor;

/**
 * ${DESCRIPTION}
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-18 10:50
 **/
public class IncomeBill implements Bill {
    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
