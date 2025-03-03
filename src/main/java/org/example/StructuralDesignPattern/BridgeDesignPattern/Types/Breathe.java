package org.example.StructuralDesignPattern.BridgeDesignPattern.Types;

import org.example.StructuralDesignPattern.BridgeDesignPattern.Process.BreathProcess;

public abstract class  Breathe {
    BreathProcess breathProcess;

    Breathe(BreathProcess breathProcess){
        this.breathProcess=breathProcess;
    }

    public abstract void breathing();
}
