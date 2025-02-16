package org.example.factoryPattern.Factories;

import org.example.factoryPattern.Classes.Circle;
import org.example.factoryPattern.Classes.Rectangle;
import org.example.factoryPattern.Classes.Shape;
import org.example.factoryPattern.Classes.TwoDShape;

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
