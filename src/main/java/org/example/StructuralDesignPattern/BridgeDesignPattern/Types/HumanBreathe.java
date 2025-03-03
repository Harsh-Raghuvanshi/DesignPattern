package org.example.StructuralDesignPattern.BridgeDesignPattern.Types;

import org.example.StructuralDesignPattern.BridgeDesignPattern.Process.BreathProcess;

public class HumanBreathe extends Breathe {
    public HumanBreathe(BreathProcess breathProcess) {
        super(breathProcess);
    }

    @Override
    public void breathing() {
        breathProcess.processOfBreathing();
    }
}
