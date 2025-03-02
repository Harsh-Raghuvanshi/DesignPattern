package org.example.BehaviouralDesignPattern.InterpreterDesignPattern;

public class MultiplyNonTerminalExpression implements AbstractExpression{
    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public MultiplyNonTerminalExpression(AbstractExpression left,AbstractExpression right){
        this.leftExpression=left;
        this.rightExpression=right;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context)* rightExpression.interpret(context);
    }
}
