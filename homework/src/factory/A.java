package factory;

public class A implements AbFactory {
    @Override
    public Color createBule() {
        return null;
    }

    @Override
    public Color createRed() {
        return new Red();
    }
}
