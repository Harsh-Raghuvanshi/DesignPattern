package org.example.BehaviouralDesignPattern.StateDesignPattern.States;

import org.example.BehaviouralDesignPattern.StateDesignPattern.Entities.VendingMachine;

import java.util.Scanner;

public class Ideal implements VendingStates{

    public Ideal(){
        System.out.println("Vending Machine in IDEAL state ... ");
    }

    public static Scanner sc=new Scanner(System.in);

    @Override
    public void clickAddCash(VendingMachine vendingMachine) {
        System.out.println("Enter your amount : ");
        Integer amount=sc.nextInt();
        vendingMachine.vendingState=new Selection(amount);
    }

    @Override
    public void clickCancelAndRefund(VendingMachine vendingMachine) throws Exception{
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void clickGetProduct(VendingMachine vendingMachine,Integer code) throws Exception{
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void refundLeftAmount(VendingMachine vendingMachine) throws Exception{
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void enterShelfCode(VendingMachine vendingMachine) throws Exception{
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void dispatchCan(VendingMachine vendingMachine) throws Exception{
        throw new Exception("This function is NOT VALID for given State");
    }
}
