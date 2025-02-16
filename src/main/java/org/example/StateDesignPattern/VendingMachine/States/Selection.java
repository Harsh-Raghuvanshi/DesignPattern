package org.example.StateDesignPattern.VendingMachine.States;

import org.example.StateDesignPattern.VendingMachine.Entities.Item;
import org.example.StateDesignPattern.VendingMachine.Entities.ItemShelf;
import org.example.StateDesignPattern.VendingMachine.Entities.VendingMachine;

import java.util.Optional;
import java.util.Scanner;

public class Selection implements VendingStates{

    Integer amountEntered;

    public static Scanner sc=new Scanner(System.in);

    public Selection(Integer amountEntered){
        this.amountEntered=amountEntered;
        System.out.println("Vending Machine in SELECTION state ... ");
    }

    @Override
    public void clickAddCash(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void clickCancelAndRefund(VendingMachine vendingMachine) throws Exception {
        System.out.println("Amount Refunded : "+amountEntered);
        vendingMachine.vendingState=new Ideal();
    }

    @Override
    public void clickGetProduct(VendingMachine vendingMachine,Integer code) throws Exception {
        System.out.println("You finalized you purchase");
        Integer priceOfCan=0;
        for(ItemShelf i:vendingMachine.shelfBox.shelfList){
            if(i.shelfCode.equals(code)) {
                priceOfCan=i.item.price;
                i.quantity--;
                break;
            }
        }
        vendingMachine.vendingState=new Processing(amountEntered,priceOfCan);
    }

    @Override
    public void refundLeftAmount(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }

    @Override
    public void enterShelfCode(VendingMachine vendingMachine) throws Exception {
        System.out.print("Enter Shelf Code : ");
        Integer code=sc.nextInt();
        Optional<ItemShelf> opt=vendingMachine.shelfBox.shelfList.stream().filter(x->x.shelfCode.equals(code)).findFirst();
        if(opt.isEmpty()){
            System.out.println("No such Shelf with this code : "+code);
            clickCancelAndRefund(vendingMachine);
            return;
        }
        ItemShelf itemShelf=opt.get();
        if(itemShelf.quantity<=0){
            System.out.println("This shelf is empty : "+code);
            clickCancelAndRefund(vendingMachine);
            return;
        }
        clickGetProduct(vendingMachine,code);
    }

    @Override
    public void dispatchCan(VendingMachine vendingMachine) throws Exception {
        throw new Exception("This function is NOT VALID for given State");
    }
}
