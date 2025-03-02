package org.example.CreationalDesignPatterns.factoryPattern.Factories;

import org.example.CreationalDesignPatterns.factoryPattern.Classes.Shape;
import org.example.CreationalDesignPatterns.factoryPattern.Classes.Circle;
import org.example.CreationalDesignPatterns.factoryPattern.Classes.Rectangle;

public class TwoDFactory implements ShapeFactory{

    @Override
    public Shape getShapes(String shape){
        return switch (shape) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }

}
