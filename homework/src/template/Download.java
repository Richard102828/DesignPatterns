package template;

public abstract class Download {

    public void download() {
        System.out.println("开始下载任务，请选择电脑系统");
        windowsOrLinux();
    }

    protected abstract void windowsOrLinux();
}
