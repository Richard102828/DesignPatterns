package state;

public class SingelDog implements Person {
    @Override
    public void movie() {
        System.out.println("一个人偷偷的看岛国大片···");
    }

    @Override
    public void shopping() {
        System.out.println("开门，签收快递，关门···");
    }
}
