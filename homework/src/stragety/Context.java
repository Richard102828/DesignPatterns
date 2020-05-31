package stragety;

/**
 * 注意与状态模式对比，这里对象的传入是由客户端实现的，客户端必须知道所有的策略
 */
public class Context {
    private Stragety stragety;

    public Context(Stragety stragety) {
        this.stragety = stragety;
    }

    public void setStragety(Stragety stragety) {
        this.stragety = stragety;
    }

    public void show() {
        stragety.show();
    }
}
