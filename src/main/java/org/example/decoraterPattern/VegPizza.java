package org.example.decoraterPattern;

public class VegPizza implements BasePizza{
    @Override
    public Integer cost() {
        return 100;
    }
}
