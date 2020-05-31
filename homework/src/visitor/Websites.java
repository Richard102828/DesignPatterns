package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Websites {
    private List<Web> webs;

    public Websites() {
        webs = new ArrayList<>();
    }

    public void addWeb(Web web) {
        webs.add(web);
    }

    public void accept(Visitor visitor) {
        Iterator<Web> iterator = webs.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }
}
