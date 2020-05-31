package builder.simple;

import java.util.ArrayList;

public class Computer {

    private ArrayList<String> ports = new ArrayList<>();

    public void addPorts(String s) {
        ports.add(s);
    }

    public void show() {
        for (int i = 0; i < ports.size(); i++) {
            System.out.println("组件：" + ports.get(i));
        }
    }
}
