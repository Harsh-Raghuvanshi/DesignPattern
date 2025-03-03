package org.example.StructuralDesignPattern.AdapterDesignPattern.Adapter;


import org.example.StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightAdapterImpl implements WeightAdapter {
    WeightMachine weightMachine;

    public WeightAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public Double convertWeightFromPoundsToKgs() {
        Double pounds = weightMachine.getWeightInPounds();
        return pounds * (0.45);
    }
}
