package mediator;

public class Mediator implements HouseMediator {

    private PersonA a;
    private PersonB b;

    public void setA(PersonA a) {
        this.a = a;
    }

    public void setB(PersonB b) {
        this.b = b;
    }

    @Override
    public void notice(Person person, String message) {
        if (person instanceof PersonA) {
            b.receive(message);
        } else if (person instanceof PersonB) {
            a.receive(message);
        }
    }
}
