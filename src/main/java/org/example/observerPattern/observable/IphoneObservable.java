package org.example.observerPattern.observable;

import org.example.observerPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements ProductObservable{
    List<Observer> observerList;
    Integer quantity;

    public IphoneObservable(){
        observerList=new ArrayList<>();
        quantity=0;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Going to notify all observers ....");
        for(Observer observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setData(Integer addedQuantity) {
        quantity+=addedQuantity;
        notifyObserver();
    }

    @Override
    public Integer getData() {
        return quantity;
    }
}
