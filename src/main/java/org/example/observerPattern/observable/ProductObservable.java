package org.example.observerPattern.observable;

import org.example.observerPattern.observer.Observer;

public interface ProductObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setData(Integer addedQuantity);
    Integer getData();
}
