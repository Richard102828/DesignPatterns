package prototype.sample;

public class Producter {
    public Money pruduct(Money money) throws CloneNotSupportedException {
        Money cloneMoney = (Money) money.clone();
        return cloneMoney;
    }
}
