package factory;

public class B implements AbFactory {
    @Override
    public Color createBule() {
        return new Bule();
    }

    @Override
    public Color createRed() {
        return null;
    }
}
