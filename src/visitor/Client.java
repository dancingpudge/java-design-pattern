package visitor;

import visitor.concrete.AccountBookViewer;
import visitor.concrete.impl.Boss;
import visitor.concrete.impl.CPA;
import visitor.element.impl.ConsumeBill;
import visitor.element.impl.IncomeBill;

/**
 * 访问者模式中的伪动态双分派
 * <p>
 * 访问者模式中使用的是伪动态双分派，所谓的动态双分派就是在运行时依据两个实际类型去判断一个方法的运行行为，而访问者模式实现的手段是进行了两次动态单分派来达到这个效果。
 * <p>
 * 回到上面例子当中账本类中的accept方法
 * <p>
 * for (Bill bill : billList) {
 * bill.accept(viewer);
 * }
 * <p>
 * 这里就是依据biil和viewer两个实际类型决定了view方法的版本，从而决定了accept方法的动作。
 * <p>
 * 分析accept方法的调用过程
 * 1.当调用accept方法时，根据bill的实际类型决定是调用ConsumeBill还是IncomeBill的accept方法。
 * <p>
 * 2.这时accept方法的版本已经确定，假如是ConsumeBill，它的accept方法是调用下面这行代码。
 * <p>
 * public void accept(AccountBookViewer viewer) {
 * viewer.view(this);
 * }
 * <p>
 * 此时的this是ConsumeBill类型，所以对应于AccountBookViewer接口的view(ConsumeBill bill)方法，此时需要再根据viewer的实际类型确定view方法的版本，如此一来，就完成了动态双分派的过程。
 * <p>
 * 以上的过程就是通过两次动态双分派，第一次对accept方法进行动态分派，第二次对view（类图中的visit方法）方法进行动态分派，从而达到了根据两个实际类型确定一个方法的行为的效果。
 * <p>
 * 而原本我们的做法，通常是传入一个接口，直接使用该接口的方法，此为动态单分派，就像策略模式一样。在这里，show方法传入的viewer接口并不是直接调用自己的view方法，而是通过bill的实际类型先动态分派一次，然后在分派后确定的方法版本里再进行自己的动态分派。
 * <p>
 * 注意：这里确定view(ConsumeBill bill)方法是静态分派决定的，所以这个并不在此次动态双分派的范畴内，而且静态分派是在编译期就完成的，所以view(ConsumeBill bill)方法的静态分派与访问者模式的动态双分派并没有任何关系。动态双分派说到底还是动态分派，是在运行时发生的，它与静态分派有着本质上的区别，不可以说一次动态分派加一次静态分派就是动态双分派，而且访问者模式的双分派本身也是另有所指。
 * <p>
 * 这里的this的类型不是动态确定的，你写在哪个类当中，它的静态类型就是哪个类，这是在编译期就确定的，不确定的是它的实际类型，请各位区分开这一点。
 *
 * @author liuh 【liuh@mail.joyowo.com】
 * @date 2018-10-18 10:52
 **/
public class Client {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(12000, "卖广告位"));
        //添加两条支出
        accountBook.addBill(new ConsumeBill(1000, "工资"));
        accountBook.addBill(new ConsumeBill(2000, "材料费"));

        AccountBookViewer boss = new Boss();
        AccountBookViewer cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();
    }
}
