package visitor;

public abstract class Visitor {
    String name;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void visit(Music music);

    public abstract void visit(Video video);
}
