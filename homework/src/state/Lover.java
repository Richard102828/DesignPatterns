package state;

public class Lover implements Person {
    @Override
    public void movie() {
        System.out.println("和女朋友一起去影院看爱情电影~");
    }

    @Override
    public void shopping() {
        System.out.println("陪女朋友一起逛街~");
    }
}
