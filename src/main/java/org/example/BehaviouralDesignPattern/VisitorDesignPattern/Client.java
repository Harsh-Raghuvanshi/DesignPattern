package org.example.BehaviouralDesignPattern.VisitorDesignPattern;

import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.DoubleBedRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.HotelRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.PremiumRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Element.SingleBedRoom;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.CleaningFunctionality;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.GenericFunctionality;
import org.example.BehaviouralDesignPattern.VisitorDesignPattern.Visitor.PricingFunctionality;

public class Client {
    public static void main(String[] args){
        // See What we have done is breaking down Hotel Room into three entities
        // 1. premium 2. single 3. double
        // Now generally all of these room have similar functions which is like cleaning the room , price of the room , laundry service etc.
        // So instead of adding function to these class individually we now can create a class
        // This class will implement generic functionality and write the function for each room in created class at one place without effecting other code
        // Also if you want to add a new room you just need to create a room and register it to generic functionality so that you can define it's all required function which other rooms have

        //Two functionality is initialized
        GenericFunctionality roomCleaningService=new CleaningFunctionality();
        GenericFunctionality priceCalculationService=new PricingFunctionality();
        //Now invoke for any of room


        //Creating room first
        HotelRoom singleBedRoom=new SingleBedRoom();
        HotelRoom doubleBedRoom=new DoubleBedRoom();
        HotelRoom premiumBedRoom=new PremiumRoom();

        singleBedRoom.accept(priceCalculationService); // calculate price of single bedroom
        singleBedRoom.accept(roomCleaningService); // clean this room as i have to book now

        doubleBedRoom.accept(priceCalculationService);
        doubleBedRoom.accept(roomCleaningService);

        premiumBedRoom.accept(priceCalculationService);
        premiumBedRoom.accept(roomCleaningService);
    }
}
