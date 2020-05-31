package interpreter;

public class NumExpression extends ArithmeticExpression {
    private String num;

    public NumExpression(String num) {
        this.num = num;
    }

    @Override
    public Integer interpret(Context context) {
        return Integer.parseInt(num);
    }
}