package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.GenericFunctionality;

public class SingleBedRoom implements HotelRoom{
    @Override
    public void accept(GenericFunctionality genericFunctionality) {
        genericFunctionality.visit(this);
    }
}
