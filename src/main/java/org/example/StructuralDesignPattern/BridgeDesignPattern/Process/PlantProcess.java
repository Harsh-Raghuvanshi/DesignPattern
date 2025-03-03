package org.example.StructuralDesignPattern.BridgeDesignPattern.Process;

public class PlantProcess implements BreathProcess{
    @Override
    public void processOfBreathing() {
        System.out.println("Inhale Carbon Dioxide");
        System.out.println("Exhale Oxygen");
    }
}
