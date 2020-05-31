package prototype.sample.register;

import prototype.sample.Money;

import java.util.ArrayList;

/**
 * 登记
 */
public class ProductManager {
    private ArrayList list = new ArrayList();

    public void add(Money money) {
        list.add(money);
    }

    public Money get(int order) {
        return (Money) list.get(order);
    }
}
