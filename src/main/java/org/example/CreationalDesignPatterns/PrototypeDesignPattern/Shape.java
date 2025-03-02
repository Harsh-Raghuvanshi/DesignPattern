package org.example.CreationalDesignPatterns.PrototypeDesignPattern;

public interface Shape {
    // In prototype design pattern every concrete implementation must have two function one for its functionality and another for cloning
    Shape clone();
    void draw();
}
