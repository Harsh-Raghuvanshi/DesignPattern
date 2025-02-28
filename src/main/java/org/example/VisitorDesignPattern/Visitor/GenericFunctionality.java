package org.example.VisitorDesignPattern.Visitor;

import org.example.VisitorDesignPattern.Element.DoubleBedRoom;
import org.example.VisitorDesignPattern.Element.PremiumRoom;
import org.example.VisitorDesignPattern.Element.SingleBedRoom;

public interface GenericFunctionality {
    void visit(SingleBedRoom singleBedRoom);
    void visit(DoubleBedRoom doubleBedRoom);
    void visit(PremiumRoom premiumRoom);
}