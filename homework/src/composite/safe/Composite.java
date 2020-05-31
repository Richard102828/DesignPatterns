package composite.safe;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String name;

    private List<Component> children;

    public Composite(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(int index) {
        children.remove(index);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void printStruct() {
        System.out.println("preStr" + "+" + this.name);

        if (children != null) {
            for (Component c : children) {
                System.out.println(c);
            }
        }
    }
}
