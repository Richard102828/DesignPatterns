package mediator;

public abstract class Person {
    protected HouseMediator mediator;

    public Person(HouseMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
