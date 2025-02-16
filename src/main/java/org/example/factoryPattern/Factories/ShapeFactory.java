package org.example.factoryPattern.Factories;

import org.example.factoryPattern.Classes.Shape;

public interface ShapeFactory {
    Shape getShapes(String shape);
}
