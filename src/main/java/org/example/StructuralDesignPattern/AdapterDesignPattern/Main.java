package org.example.StructuralDesignPattern.AdapterDesignPattern;

import org.example.StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachine;
import org.example.StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachineEngland;
import org.example.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightAdapter;
import org.example.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightAdapterImpl;

public class Main {
    public static void main(String[] args){
        WeightMachine weightMachine=new WeightMachineEngland();
        WeightAdapter weightAdapter=new WeightAdapterImpl(weightMachine);
        Double kgs=weightAdapter.convertWeightFromPoundsToKgs();
        System.out.println("Weight in kgs is : "+kgs);
    }
}
