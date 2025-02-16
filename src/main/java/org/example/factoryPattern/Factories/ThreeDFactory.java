package org.example.factoryPattern.Factories;

import org.example.factoryPattern.Classes.Cube;
import org.example.factoryPattern.Classes.Shape;
import org.example.factoryPattern.Classes.Sphere;
import org.example.factoryPattern.Classes.ThreeDShape;

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
