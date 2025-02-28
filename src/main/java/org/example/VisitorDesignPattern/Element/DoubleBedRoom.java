package org.example.VisitorDesignPattern.Element;

import org.example.VisitorDesignPattern.Visitor.GenericFunctionality;

public class DoubleBedRoom implements HotelRoom{
    @Override
    public void accept(GenericFunctionality genericFunctionality) {
        genericFunctionality.visit(this);
    }
}
