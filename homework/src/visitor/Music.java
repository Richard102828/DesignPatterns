package visitor;

public class Music extends Web {

    public Music(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void playMusic() {
        System.out.println("播放音乐~");
    }

    public void download() {
        System.out.println("下载音乐，有空再看~");
    }
}
