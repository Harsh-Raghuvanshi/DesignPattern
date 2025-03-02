package org.example.BehaviouralDesignPattern.StateDesignPattern.States;

import org.example.BehaviouralDesignPattern.StateDesignPattern.Entities.VendingMachine;

public interface VendingStates {
    void clickAddCash(VendingMachine vendingMachine) throws Exception;
    void clickCancelAndRefund(VendingMachine vendingMachine) throws Exception;
    void enterShelfCode(VendingMachine vendingMachine) throws Exception;
    void clickGetProduct(VendingMachine vendingMachine,Integer code) throws Exception;
    void refundLeftAmount(VendingMachine vendingMachine) throws Exception;
    void dispatchCan(VendingMachine vendingMachine) throws Exception;
}
