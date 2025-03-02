package org.example.BehaviouralDesignPattern.ObserverDesignPattern.observer;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.observable.ProductObservable;

public class SmsObserver implements Observer{
    String phone;

    public SmsObserver(String phone){
        this.phone= phone;
    }

    @Override
    public void update() {
        System.out.println("Got updated via SMS : "+phone);
    }
}
