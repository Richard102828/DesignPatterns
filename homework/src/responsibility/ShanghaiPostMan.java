package responsibility;

public class ShanghaiPostMan extends PostMan {
    @Override
    public void handleCourier(String address) {
        if (address.equals("上海")) {
            System.out.println(this + "派送到上海");
        } else {
            assert mNextPostMan != null;
            mNextPostMan.handleCourier(address);
        }
    }

    @Override
    public String toString() {
        return "ShanghaiPostMan{}";
    }
}
