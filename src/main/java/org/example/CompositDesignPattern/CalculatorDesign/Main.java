package org.example.CompositDesignPattern.CalculatorDesign;

public class Main {
    public static void main(String[] args){
        Number n1=new Number(2);
        Number n2=new Number(3);
        Number n3=new Number(4);

        ArithmeticExpression expression1=new Expression(n2,n3,Operation.ADD);
        ArithmeticExpression expression=new Expression(n1,expression1,Operation.MULTIPLY);
        ArithmeticExpression expression2=new Expression(new Number(24),expression,Operation.SUBTRACT);
        ArithmeticExpression expression3=new Expression(expression2,new Number(5),Operation.DIVIDE);

        System.out.println(expression3.evaluate());

    }
}
