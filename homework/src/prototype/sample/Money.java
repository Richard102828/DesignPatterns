package prototype.sample;

/**
 * 这里抽像原型就是Cloneable
 */
public class Money implements Cloneable{
    private int valueface;
    private String unit;

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Money{" +
                "valueface=" + valueface +
                ", unit='" + unit + '\'' +
                '}';
    }
}
