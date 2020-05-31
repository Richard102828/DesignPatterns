package proxy.staticProxy;

public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("电影播放中···");
    }
}
