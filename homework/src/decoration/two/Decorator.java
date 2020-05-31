package decoration.two;

public class Decorator extends Human {

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wareClothes() {
        human.wareClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
