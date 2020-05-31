package interpreter;

public class AddExpression extends ArithmeticExpression {
    private ArithmeticExpression left, right;

    public AddExpression(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret(Context context) {
        return context.get(String.valueOf(left.interpret(context))) +
                context.get(String.valueOf(right.interpret(context)));
    }
}
