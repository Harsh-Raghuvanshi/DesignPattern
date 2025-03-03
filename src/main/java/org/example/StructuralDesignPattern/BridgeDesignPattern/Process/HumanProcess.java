package org.example.StructuralDesignPattern.BridgeDesignPattern.Process;

public class HumanProcess implements BreathProcess{
    @Override
    public void processOfBreathing() {
        System.out.println("Inhale Oxygen");
        System.out.println("Exhale Carbon Dioxide");
    }
}
