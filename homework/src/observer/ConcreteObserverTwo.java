package observer;

public class ConcreteObserverTwo implements Observer{
    @Override
    public void update() {
        System.out.println("观察者二号已接受到被观察者的数据更新通知");
    }
}
