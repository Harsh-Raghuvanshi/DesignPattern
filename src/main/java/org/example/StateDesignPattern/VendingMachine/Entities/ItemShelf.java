package org.example.StateDesignPattern.VendingMachine.Entities;

import java.util.Arrays;
import java.util.List;

public class ItemShelf {
    public Item item;
    public Integer shelfCode;
    public Integer quantity;

    ItemShelf(Item item,Integer shelfCode,Integer quantity){
        this.item=item;
        this.shelfCode=shelfCode;
        this.quantity=quantity;
    }

    public static List<ItemShelf> getShelfList(){
        ItemShelf itemShelf=new ItemShelf(new Item(ProductType.COKE,100),101,5);
        ItemShelf itemShelf1=new ItemShelf(new Item(ProductType.PEPSI,120),102,7);
        ItemShelf itemShelf2=new ItemShelf(new Item(ProductType.WATER,40),103,10);
        ItemShelf itemShelf3=new ItemShelf(new Item(ProductType.SODA,80),104,8);
        return Arrays.asList(itemShelf,itemShelf1,itemShelf2,itemShelf3);
    }

}
