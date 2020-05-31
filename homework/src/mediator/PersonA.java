package mediator;

public class PersonA extends Person {

    public PersonA(HouseMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("PersonA" + "发出消息: " + message);
        mediator.notice(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("PersonA" + "接收消息: " + message);
    }
}
