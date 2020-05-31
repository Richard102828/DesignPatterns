package observer;

public class ConcreteSubject extends Subject {

    @Override
    public void doSomething() {
        System.out.println("被观察者通知观察者数据更新了");
        notifyObservers();
    }
}
