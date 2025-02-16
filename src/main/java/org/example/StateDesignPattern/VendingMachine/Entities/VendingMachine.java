package org.example.StateDesignPattern.VendingMachine.Entities;

import org.example.StateDesignPattern.VendingMachine.States.Ideal;
import org.example.StateDesignPattern.VendingMachine.States.VendingStates;

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
