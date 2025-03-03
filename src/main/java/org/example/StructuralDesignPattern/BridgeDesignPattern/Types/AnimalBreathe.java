package org.example.StructuralDesignPattern.BridgeDesignPattern.Types;

import org.example.StructuralDesignPattern.BridgeDesignPattern.Process.BreathProcess;

public class AnimalBreathe extends Breathe{
    public AnimalBreathe(BreathProcess breathProcess) {
        super(breathProcess);
    }

    @Override
    public void breathing() {
        breathProcess.processOfBreathing();
    }
}
