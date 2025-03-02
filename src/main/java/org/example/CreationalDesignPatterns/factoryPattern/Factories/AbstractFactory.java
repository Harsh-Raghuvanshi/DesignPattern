package org.example.CreationalDesignPatterns.factoryPattern.Factories;

public class AbstractFactory {

    public ShapeFactory getFactories(String shape){
        return switch (shape){
            case "2d" -> new TwoDFactory();
            case "3d" -> new ThreeDFactory();
            default -> null;
        };
    }

}
