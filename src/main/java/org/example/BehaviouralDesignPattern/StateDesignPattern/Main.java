package org.example.BehaviouralDesignPattern.StateDesignPattern;

import org.example.BehaviouralDesignPattern.StateDesignPattern.Entities.ItemShelf;
import org.example.BehaviouralDesignPattern.StateDesignPattern.Entities.ShelfBox;
import org.example.BehaviouralDesignPattern.StateDesignPattern.Entities.VendingMachine;

public class Main {
    public static void main(String[] args) throws Exception{

        ShelfBox shelfBox=new ShelfBox(ItemShelf.getShelfList());
        VendingMachine vendingMachine=new VendingMachine(shelfBox);

        vendingMachine.vendingState.clickAddCash(vendingMachine);
        vendingMachine.vendingState.enterShelfCode(vendingMachine);
        vendingMachine.vendingState.refundLeftAmount(vendingMachine);
        vendingMachine.vendingState.dispatchCan(vendingMachine);

    }
}
