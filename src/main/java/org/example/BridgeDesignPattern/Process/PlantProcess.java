package org.example.BridgeDesignPattern.Process;

import org.example.BridgeDesignPattern.Types.Breathe;

public class PlantProcess implements BreathProcess{
    @Override
    public void processOfBreathing() {
        System.out.println("Inhale Carbon Dioxide");
        System.out.println("Exhale Oxygen");
    }
}
