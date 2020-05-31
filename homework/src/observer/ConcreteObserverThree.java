package observer;

public class ConcreteObserverThree implements Observer{
    @Override
    public void update() {
        System.out.println("观察者三号已接受到被观察者的数据更新通知");
    }
}
