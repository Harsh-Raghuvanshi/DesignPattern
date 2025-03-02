package org.example.CreationalDesignPatterns.factoryPattern.Factories;

import org.example.CreationalDesignPatterns.factoryPattern.Classes.Shape;

public interface ShapeFactory {
    Shape getShapes(String shape);
}
