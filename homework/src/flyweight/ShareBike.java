package flyweight;

public class ShareBike implements IBike {

    private int singlePrice = 1;
    private int totalPrice;

    @Override
    public void cost(int time) {
        //这里显然是不符合实际逻辑的，但是为了简单，不考虑这么多
        totalPrice = singlePrice * time;
        System.out.println(totalPrice);
    }
}
