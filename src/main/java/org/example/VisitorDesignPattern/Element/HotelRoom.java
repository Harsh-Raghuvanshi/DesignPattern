package org.example.VisitorDesignPattern.Element;

import org.example.VisitorDesignPattern.Visitor.GenericFunctionality;

public interface HotelRoom {
    void accept(GenericFunctionality genericFunctionality);
}
