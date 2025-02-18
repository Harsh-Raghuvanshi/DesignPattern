package org.example.BridgeDesignPattern.Types;

import org.example.BridgeDesignPattern.Process.BreathProcess;

public abstract class  Breathe {
    BreathProcess breathProcess;

    Breathe(BreathProcess breathProcess){
        this.breathProcess=breathProcess;
    }

    public abstract void breathing();
}
