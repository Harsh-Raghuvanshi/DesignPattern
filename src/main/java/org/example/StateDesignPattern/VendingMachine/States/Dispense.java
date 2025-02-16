package org.example.StateDesignPattern.VendingMachine.States;

import org.example.StateDesignPattern.VendingMachine.Entities.VendingMachine;

public class Dispense implements VendingStates{

    public Dispense(){
        System.out.println("Vending Machine in DISPENSE state ... ");
    }

    @Override
    public void clickAddCash(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void clickCancelAndRefund(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void clickGetProduct(VendingMachine vendingMachine,Integer code) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void refundLeftAmount(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void enterShelfCode(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void dispatchCan(VendingMachine vendingMachine) throws Exception {
        System.out.println("Your can is Dispatched to tray HURRAY!!!! ");
    }
}
