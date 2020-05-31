package mediator;

public class PersonB extends Person {

    public PersonB(HouseMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("PersonB" + "发出消息: " + message);
        mediator.notice(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("PersonB" + "接收消息: " + message);
    }
}
