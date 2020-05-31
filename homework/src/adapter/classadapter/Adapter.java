package adapter.classadapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void Request() {
        this.specialRequset();
    }
}
