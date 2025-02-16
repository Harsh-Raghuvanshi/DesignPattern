package org.example.CompositDesignPattern.CalculatorDesign;

public class Number implements ArithmeticExpression{
    Integer value;

    public Number(Integer value){
        this.value=value;
    }

    @Override
    public Integer evaluate() {
        return value;
    }
}
