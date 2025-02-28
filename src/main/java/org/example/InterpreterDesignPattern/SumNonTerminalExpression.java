package org.example.InterpreterDesignPattern;

public class SumNonTerminalExpression implements AbstractExpression{
    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public SumNonTerminalExpression(AbstractExpression left,AbstractExpression right){
        this.leftExpression=left;
        this.rightExpression=right;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context)+ rightExpression.interpret(context);
    }
}
