package interpreter;

public class VarExpression extends ArithmeticExpression {
    private String var;

    public VarExpression(String var) {
        this.var = var;
    }

    @Override
    public String interpret(Context context) {
        return var;
    }
}
