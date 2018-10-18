package visitor;

import visitor.concrete.AccountBookViewer;
import visitor.element.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * 总结
 * 优点：
 *
 * 1、使得数据结构和作用于结构上的操作解耦，使得操作集合可以独立变化。
 *
 * 2、添加新的操作或者说访问者会非常容易。
 *
 * 3、将对各个元素的一组操作集中在一个访问者类当中。
 *
 * 4、使得类层次结构不改变的情况下，可以针对各个层次做出不同的操作，而不影响类层次结构的完整性。
 *
 * 5、可以跨越类层次结构，访问不同层次的元素类，做出相应的操作。
 *
 * 缺点：
 *
 * 1、增加新的元素会非常困难。
 *
 * 2、实现起来比较复杂，会增加系统的复杂性。
 *
 * 3、破坏封装，如果将访问行为放在各个元素中，则可以不暴露元素的内部结构和状态，但使用访问者模式的时候，为了让访问者能获取到所关心的信息
 * ，元素类不得不暴露出一些内部的状态和结构，就像收入和支出类必须提供访问金额和单子的项目的方法一样。
 *
 * 适用性：
 *
 * 1、数据结构稳定，作用于数据结构的操作经常变化的时候。
 *
 * 2、当一个数据结构中，一些元素类需要负责与其不相关的操作的时候，为了将这些操作分离出去，以减少这些元素类的职责时，可以使用访问者模式。
 *
 * 3、有时在对数据结构上的元素进行操作的时候，需要区分具体的类型，这时使用访问者模式可以针对不同的类型，在访问者类中定义不同的操作，从而去除掉类型判断。
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
