package decoration.one;

/**
 * 装饰者具体_1
 */
public class LettuceBurger extends Condiment {

    private Hamburger hamburger;

    public LettuceBurger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + "加 生菜";
    }

    @Override
    public String getPrice() {
        return hamburger.getPrice() + " + 2";
    }
}
