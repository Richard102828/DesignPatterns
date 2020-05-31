package decoration.two;

public class DecoratorOne extends Decorator {

    public DecoratorOne(Human human) {
        super(human);
    }

    @Override
    public void wareClothes() {
        super.wareClothes();
        System.out.println("找到了一件nike体恤");
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        System.out.println("打开地图，看看有什么好玩的地方");
    }

}
