package org.example.observerPattern.observer;

import org.example.observerPattern.observable.ProductObservable;

public class EmailObserver implements Observer{
    String email;
    ProductObservable productObservable;

    public EmailObserver(String email, ProductObservable productObservable){
        this.email=email;
        this.productObservable=productObservable;
    }

    @Override
    public void update() {
        System.out.println("Got updated by EMAIL  : "+email);
    }
}
