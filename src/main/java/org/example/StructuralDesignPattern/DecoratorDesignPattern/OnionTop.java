package org.example.StructuralDesignPattern.DecoratorDesignPattern;

public class OnionTop implements Toppings{
    BasePizza basePizza;

    public OnionTop(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer cost() {
        return basePizza.cost()+20;
    }
}
