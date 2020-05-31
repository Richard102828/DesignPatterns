package factory;

public class BuleFactory implements Factory {
    @Override
    public Color createColor() {
        return new Bule();
    }
}
