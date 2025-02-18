package org.example.BridgeDesignPattern.Process;

public class AnimalProcess implements BreathProcess{

    @Override
    public void processOfBreathing() {
        System.out.println("Some inhale Oxygen but by nostrils or skin");
        System.out.println("Exhale CO2 by skin or nostrils");
    }
}
