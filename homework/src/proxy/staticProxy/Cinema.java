package proxy.staticProxy;

public class Cinema implements Movie {

    private RealMovie movie;

    public Cinema(RealMovie movie) {
        this.movie = movie;
    }

    @Override
    public void play() {
        System.out.println("影院准备播放电影···");
        movie.play();
        end();
    }

    private void end() {
        System.out.println("122分钟已到，电影播放完毕···");
        System.out.println("影院已获利1000元");
    }
}
