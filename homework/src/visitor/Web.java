package visitor;

public abstract class Web {
    String name;

    public Web(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(Visitor visitor);
}
