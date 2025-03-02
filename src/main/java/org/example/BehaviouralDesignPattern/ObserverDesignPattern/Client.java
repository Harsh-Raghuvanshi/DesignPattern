package org.example.BehaviouralDesignPattern.ObserverDesignPattern;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.observable.IphoneStockObservable;
import org.example.BehaviouralDesignPattern.ObserverDesignPattern.observer.EmailObserver;
import org.example.BehaviouralDesignPattern.ObserverDesignPattern.observer.Observer;
import org.example.BehaviouralDesignPattern.ObserverDesignPattern.observer.SmsObserver;

public class Client {
    public static void main(String[] args){
        IphoneStockObservable iphoneObservable=new IphoneStockObservable();

        Observer emailObserver=new EmailObserver("harsh@gmail.com");
        Observer smsObserver=new SmsObserver("8882247118");

        iphoneObservable.addObserver(emailObserver);
        iphoneObservable.addObserver(smsObserver);

        iphoneObservable.setData(24);
    }
}
