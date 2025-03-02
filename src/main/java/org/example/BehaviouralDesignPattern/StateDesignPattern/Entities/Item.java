package org.example.BehaviouralDesignPattern.StateDesignPattern.Entities;


public class Item {
    public ProductType productType;
    public Integer price;

    Item(ProductType productType,Integer price){
        this.productType=productType;
        this.price=price;
    }
}
