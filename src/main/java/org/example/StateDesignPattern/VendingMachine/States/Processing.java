package org.example.StateDesignPattern.VendingMachine.States;

import org.example.StateDesignPattern.VendingMachine.Entities.VendingMachine;

public class Processing implements VendingStates {
    public Integer amountEntered;
    public Integer priceOfCan;

    public Processing(Integer amountEntered, Integer priceOfCan) {
        this.amountEntered = amountEntered;
        this.priceOfCan = priceOfCan;
        System.out.println("Vending Machine in PROCESSING state ... ");
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
        if (amountEntered - priceOfCan <= 0) return;
        System.out.println("Refunding the left Amount");
        System.out.println("Amount Refunded : " + (amountEntered - priceOfCan));
        vendingMachine.vendingState=new Dispense();
    }

    @Override
    public void enterShelfCode(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void dispatchCan(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }
}
