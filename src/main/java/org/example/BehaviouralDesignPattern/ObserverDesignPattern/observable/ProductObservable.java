package org.example.BehaviouralDesignPattern.ObserverDesignPattern.observable;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.observer.Observer;

public interface ProductObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setData(Integer addedQuantity);
    Integer getData();
}
