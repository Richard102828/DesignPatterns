package responsibility;

public abstract class PostMan {
    protected PostMan mNextPostMan;

    public void setmNextPostMan(PostMan mNextPostMan) {
        this.mNextPostMan = mNextPostMan;
    }

    public abstract void handleCourier(String address);
}
