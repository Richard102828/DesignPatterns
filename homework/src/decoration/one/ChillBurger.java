package decoration.one;

/**
 * 装饰者具体_2
 */
public class ChillBurger extends Condiment {

    private Hamburger hamburger;

    public ChillBurger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + "加 辣椒";
    }

    @Override
    public String getPrice() {
        return hamburger.getPrice() + " + 2.5";
    }
}
