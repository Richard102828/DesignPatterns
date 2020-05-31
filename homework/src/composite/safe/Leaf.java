package composite.safe;

public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct() {
        System.out.println("preStr" + name);
    }
}
