package decoration.one;

/**
 * 被装饰者初始状态
 */
public class ChickenBurger extends Hamburger{

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public String getPrice() {
        return "10";
    }
}
