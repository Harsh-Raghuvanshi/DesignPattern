package org.example.AdaptiveDesignPattern;

import org.example.AdaptiveDesignPattern.Adaptee.WeightMachine;
import org.example.AdaptiveDesignPattern.Adaptee.WeightMachineEngland;
import org.example.AdaptiveDesignPattern.Adapter.WeightAdapter;
import org.example.AdaptiveDesignPattern.Adapter.WeightAdapterImpl;

public class Main {
    public static void main(String[] args){
        WeightMachine weightMachine=new WeightMachineEngland();
        WeightAdapter weightAdapter=new WeightAdapterImpl(weightMachine);
        Double kgs=weightAdapter.convertWeightFromPoundsToKgs();
        System.out.println("Weight in kgs is : "+kgs);
    }
}
