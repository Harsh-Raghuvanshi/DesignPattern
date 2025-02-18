package org.example.BridgeDesignPattern.Types;

import org.example.BridgeDesignPattern.Process.BreathProcess;

public class AnimalBreathe extends Breathe{
    public AnimalBreathe(BreathProcess breathProcess) {
        super(breathProcess);
    }

    @Override
    public void breathing() {
        breathProcess.processOfBreathing();
    }
}
