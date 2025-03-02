package org.example.BehaviouralDesignPattern.ObserverDesignPattern.observer;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.observable.ProductObservable;

public class EmailObserver implements Observer{
    String email;

    public EmailObserver(String email){
        this.email=email;
    }

    @Override
    public void update() {
        System.out.println("Got updated by EMAIL  : "+email);
    }
}
