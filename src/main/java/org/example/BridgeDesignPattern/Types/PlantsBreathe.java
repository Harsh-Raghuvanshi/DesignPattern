package org.example.BridgeDesignPattern.Types;

import org.example.BridgeDesignPattern.Process.BreathProcess;

public class PlantsBreathe extends Breathe {
    public PlantsBreathe(BreathProcess breathProcess) {
        super(breathProcess);
    }

    @Override
    public void breathing() {
        breathProcess.processOfBreathing();
    }
}
