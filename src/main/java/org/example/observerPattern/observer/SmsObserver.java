package org.example.observerPattern.observer;

import org.example.observerPattern.observable.ProductObservable;

public class SmsObserver implements Observer{
    String phone;
    ProductObservable productObservable;

    public SmsObserver(String phone, ProductObservable productObservable){
        this.phone= phone;
        this.productObservable=productObservable;
    }

    @Override
    public void update() {
        System.out.println("Got updated via SMS : "+phone);
    }
}
