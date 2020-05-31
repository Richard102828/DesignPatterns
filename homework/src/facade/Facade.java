package facade;

public class Facade {
    private static Facade instance;

    private SystemA a;
    private SystemB b;
    private SystemC c;

    private Facade() {
        a = new SystemA();
        b = new SystemB();
        c = new SystemC();
    }

    public void on() {
        a.on();
        b.on();
        c.on();
    }

    public void off() {
        a.off();
        b.off();
        c.off();
    }

    public static Facade getInstance() {
        if (instance == null) {
            synchronized (Facade.class) {
                if (instance == null) {
                    instance = new Facade();
                }
            }
        }
        return instance;
    }
}
