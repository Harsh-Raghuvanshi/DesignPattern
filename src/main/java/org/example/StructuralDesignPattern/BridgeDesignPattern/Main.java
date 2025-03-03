package org.example.StructuralDesignPattern.BridgeDesignPattern;

import org.example.StructuralDesignPattern.BridgeDesignPattern.Process.AnimalProcess;
import org.example.StructuralDesignPattern.BridgeDesignPattern.Process.HumanProcess;
import org.example.StructuralDesignPattern.BridgeDesignPattern.Process.PlantProcess;
import org.example.StructuralDesignPattern.BridgeDesignPattern.Types.AnimalBreathe;
import org.example.StructuralDesignPattern.BridgeDesignPattern.Types.Breathe;
import org.example.StructuralDesignPattern.BridgeDesignPattern.Types.HumanBreathe;
import org.example.StructuralDesignPattern.BridgeDesignPattern.Types.PlantsBreathe;

public class Main {
    public static void main(String[] args){
        // See now we can independently define some more breathing methods as abstraction is now not coupled with its implementations
        Breathe breathe=new AnimalBreathe(new AnimalProcess());
        breathe.breathing();
        Breathe breathe1=new HumanBreathe(new HumanProcess());
        breathe1.breathing();;
        Breathe breathe2=new PlantsBreathe(new PlantProcess());
        breathe2.breathing();

    }
}
