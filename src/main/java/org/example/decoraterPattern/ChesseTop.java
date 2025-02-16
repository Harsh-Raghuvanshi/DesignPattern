package org.example.decoraterPattern;

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
