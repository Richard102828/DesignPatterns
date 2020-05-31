package factory;

public class RedFactory implements Factory {
    @Override
    public Color createColor() {
        return new Red();
    }
}
