package org.example.InterpreterDesignPattern;

public class NumberTerminalExpression implements AbstractExpression{
    String variableName;

    public NumberTerminalExpression(String variableName){
        this.variableName=variableName;
    }

    @Override
    public int interpret(Context context) {
        return context.get(variableName);
    }
}
