package interpreter;

public class Calculator {
    private Context mContext = new Context();
    private ArithmeticExpression mExpression;

    public void read(String expression) {
        String[] strings = expression.split(" ");
        switch (strings[1]) {
            case "=":
                mExpression = new EqualExpression(new VarExpression(strings[0]),
                        new NumExpression(strings[2]));
                break;
            case "+":
                mExpression = new AddExpression(new VarExpression(strings[0]),
                        new VarExpression(strings[2]));
                break;
            case "-":
                mExpression = new SubExpression(new VarExpression(strings[0]),
                        new VarExpression(strings[2]));
                break;
                default:
                    break;
        }
    }

    public int calculate() {
        return (int) mExpression.interpret(mContext);
    }
}
