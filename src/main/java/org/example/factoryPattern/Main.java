package org.example.factoryPattern;


import org.example.factoryPattern.Factories.AbstractFactory;

public class Main {
    public static void main(String[] args){
        AbstractFactory abstractFactory=new AbstractFactory();
        abstractFactory.getFactories("2d").getShapes("circle").printShape();
        abstractFactory.getFactories("2d").getShapes("rectangle").printShape();
        abstractFactory.getFactories("3d").getShapes("sphere").printShape();
        abstractFactory.getFactories("3d").getShapes("cube").printShape();
    }
}
