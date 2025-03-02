package org.example.CreationalDesignPatterns.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args){
        Shape circlePrototype=new Circle(24,"red");
        circlePrototype.draw();
        ShapeClient shapeClient=new ShapeClient(circlePrototype);
        Shape circlePrototype2=shapeClient.createShape();
        circlePrototype2.draw();
    }
}
