package adapter.objectadapter;

/**
 * 适配器
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        adaptee.specialRequest();
    }
}
