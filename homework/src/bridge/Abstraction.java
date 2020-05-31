package bridge;

/**
 * 抽象化角色
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public abstract void abs();

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
