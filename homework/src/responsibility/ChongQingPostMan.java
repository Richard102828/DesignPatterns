package responsibility;

public class ChongQingPostMan extends PostMan {
    @Override
    public void handleCourier(String address) {
        if (address.equals("重庆")) {
            System.out.println(this + "派送到重庆");
        } else {
            assert mNextPostMan != null;
            mNextPostMan.handleCourier(address);
        }
    }

    @Override
    public String toString() {
        return "ChongQingPostMan{}";
    }
}
