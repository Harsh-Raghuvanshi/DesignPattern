package org.example.VisitorDesignPattern.Visitor;

import org.example.VisitorDesignPattern.Element.DoubleBedRoom;
import org.example.VisitorDesignPattern.Element.PremiumRoom;
import org.example.VisitorDesignPattern.Element.SingleBedRoom;

public class PricingFunctionality implements GenericFunctionality{
    @Override
    public void visit(SingleBedRoom singleBedRoom) {
        System.out.println("Pricing of Single Bed Room is : "+200);
    }

    @Override
    public void visit(DoubleBedRoom doubleBedRoom) {
        System.out.println("Pricing of Double Bed Room is : "+350);
    }

    @Override
    public void visit(PremiumRoom premiumRoom) {
        System.out.println("Pricing of Premium Room is : "+500);
    }
}
