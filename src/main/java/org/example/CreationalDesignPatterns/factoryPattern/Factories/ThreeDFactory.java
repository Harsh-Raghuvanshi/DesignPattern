package org.example.CreationalDesignPatterns.factoryPattern.Factories;

import org.example.CreationalDesignPatterns.factoryPattern.Classes.Cube;
import org.example.CreationalDesignPatterns.factoryPattern.Classes.Shape;
import org.example.CreationalDesignPatterns.factoryPattern.Classes.Sphere;

public class ThreeDFactory implements ShapeFactory{

    @Override
    public Shape getShapes(String shape){
        return switch (shape){
            case "sphere" -> new Sphere();
            case "cube" -> new Cube();
            default -> null;
        };
    }


}
