package org.example.CreationalDesignPatterns.PrototypeDesignPattern;

public class Circle implements Shape{
    Integer radius;
    String color;

    public Circle(Integer radius, String color){
        this.radius=radius;
        this.color=color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius,this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius : "+radius+" and color : "+color);
    }
}
