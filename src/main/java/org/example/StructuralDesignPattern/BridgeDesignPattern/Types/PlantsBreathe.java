package org.example.StructuralDesignPattern.BridgeDesignPattern.Types;

import org.example.StructuralDesignPattern.BridgeDesignPattern.Process.BreathProcess;

public class PlantsBreathe extends Breathe {
    public PlantsBreathe(BreathProcess breathProcess) {
        super(breathProcess);
    }

    @Override
    public void breathing() {
        breathProcess.processOfBreathing();
    }
}
