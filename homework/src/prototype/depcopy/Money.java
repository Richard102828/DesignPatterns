package prototype.depcopy;

/**
 * 这里抽像原型就是Cloneable
 */
public class Money implements Cloneable{
    private int valueface;
    private String unit;
    private User user;

    public int getValueface() {
        return valueface;
    }

    public void setValueface(int valueface) {
        this.valueface = valueface;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Money cloneMoney = (Money) super.clone();
        cloneMoney.user = (User) this.user.clone();
        return cloneMoney;
    }


    @Override
    public String toString() {
        return "Money{" +
                "valueface=" + valueface +
                ", unit='" + unit + '\'' +
                ", user=" + user +
                '}';
    }
}
