package decoration.two;

public class Person extends Human {
    @Override
    public void wareClothes() {
        System.out.println("今天该穿点什么呢?");
    }

    @Override
    public void walkToWhere() {
        System.out.println("今天该去哪里玩耍呢?");
    }
}
