package org.example.StateDesignPattern.VendingMachine.Entities;

import java.util.List;

public class ShelfBox {
    public List<ItemShelf> shelfList;

    public ShelfBox(List<ItemShelf> shelfList){
        this.shelfList=shelfList;
    }

}
