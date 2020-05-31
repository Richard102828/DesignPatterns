package template;

public class Linux extends Download {
    @Override
    protected void windowsOrLinux() {
        System.out.println("选择系统为Linux， 开始下载···");
    }
}
