package decoration.one;

/**
 * 被装饰者基类
 */
public abstract class Hamburger {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract String getPrice();
}
