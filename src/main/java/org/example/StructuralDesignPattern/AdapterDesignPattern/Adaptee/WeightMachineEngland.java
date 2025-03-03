package org.example.StructuralDesignPattern.AdapterDesignPattern.Adaptee;

public class WeightMachineEngland implements WeightMachine{
    @Override
    public Double getWeightInPounds() {
        return 28.0;
    }
}
