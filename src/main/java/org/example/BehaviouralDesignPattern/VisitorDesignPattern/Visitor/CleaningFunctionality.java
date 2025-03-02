package org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DoubleBedRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.PremiumRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.SingleBedRoom;

public class CleaningFunctionality implements GenericFunctionality{
    @Override
    public void visit(SingleBedRoom singleBedRoom) {
        System.out.println("Cleaning service for SINGLE bed room!!!");
    }

    @Override
    public void visit(DoubleBedRoom doubleBedRoom) {
        System.out.println("Cleaning service for DOUBLE bed room!!!");
    }

    @Override
    public void visit(PremiumRoom premiumRoom) {
        System.out.println("Cleaning service for PREMIUM bed room!!!");
    }
}
