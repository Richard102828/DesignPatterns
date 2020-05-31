package visitor;

public class BusyMan extends Visitor {

    public BusyMan(String name) {
        super(name);
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "游览音乐网站" + music.getName());
        music.download();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "游览视频网站" + video.getName());
        video.download();
    }
}
