package bridge;

/**
 * 修正抽象化角色
 */
public class RefineAbstraction extends Abstraction {
    @Override
    public void abs() {
        System.out.println("修正抽象：");
        implementor.imp();
    }
}
