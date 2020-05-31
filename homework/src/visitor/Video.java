package visitor;

public class Video extends Web {

    public Video(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void playVideo() {
        System.out.println("播放视频~");
    }

    public void download() {
        System.out.println("下载视频，有空再看~");
    }
}
