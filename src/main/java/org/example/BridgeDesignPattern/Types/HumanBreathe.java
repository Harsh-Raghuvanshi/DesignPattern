package org.example.BridgeDesignPattern.Types;

import org.example.BridgeDesignPattern.Process.BreathProcess;

public class HumanBreathe extends Breathe {
    public HumanBreathe(BreathProcess breathProcess) {
        super(breathProcess);
    }

    @Override
    public void breathing() {
        breathProcess.processOfBreathing();
    }
}
