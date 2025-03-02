package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DoubleBedRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.PremiumRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.SingleBedRoom;

public interface GenericFunctionality {
    void visit(SingleBedRoom singleBedRoom);
    void visit(DoubleBedRoom doubleBedRoom);
    void visit(PremiumRoom premiumRoom);
}