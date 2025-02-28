package org.example.VisitorDesignPattern.Element;

import org.example.VisitorDesignPattern.Visitor.GenericFunctionality;

public class PremiumRoom implements HotelRoom{
    @Override
    public void accept(GenericFunctionality genericFunctionality) {
        genericFunctionality.visit(this);
    }
}
