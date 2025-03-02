package org.example.CreationalDesignPatterns.PrototypeDesignPattern;

public class ShapeClient {
    Shape shapePrototype;
    public ShapeClient(Shape shapePrototype){
        this.shapePrototype=shapePrototype;
    }
    public Shape createShape(){
        return shapePrototype.clone();
    }
}
