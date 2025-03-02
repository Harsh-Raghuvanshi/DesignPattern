package org.example.BehaviouralDesignPattern.StateDesignPattern.Entities;

import org.example.BehaviouralDesignPattern.StateDesignPattern.States.VendingStates;
import org.example.BehaviouralDesignPattern.StateDesignPattern.States.Ideal;

public class VendingMachine {
    public VendingStates vendingState;
    public ShelfBox shelfBox;

    public VendingMachine(ShelfBox shelfBox){
        this.vendingState =new Ideal();
        this.shelfBox=shelfBox;
    }

    public void changeState(VendingStates vendingStates){
        this.vendingState=vendingStates;
    }

}
