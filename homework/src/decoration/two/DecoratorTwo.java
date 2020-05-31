package decoration.two;

public class DecoratorTwo extends Decorator {

    public DecoratorTwo(Human human) {
        super(human);
    }

    @Override
    public void wareClothes() {
        super.wareClothes();
        System.out.println("衣服穿好了");
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        System.out.println("地图上的洪崖洞不错，我们就去那吧！");
    }
}
