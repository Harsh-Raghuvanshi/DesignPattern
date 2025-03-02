package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.GenericFunctionality;

public interface HotelRoom {
    void accept(GenericFunctionality genericFunctionality);
}
