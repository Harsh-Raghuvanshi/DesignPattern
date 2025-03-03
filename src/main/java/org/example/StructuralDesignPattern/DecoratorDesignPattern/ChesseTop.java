package org.example.StructuralDesignPattern.DecoratorDesignPattern;

public class ChesseTop implements Toppings{
    BasePizza basePizza;

    public ChesseTop(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer cost() {
        return basePizza.cost()+10;
    }
}
