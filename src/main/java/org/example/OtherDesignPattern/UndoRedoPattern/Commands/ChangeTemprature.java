package org.example.OtherDesignPattern.UndoRedoPattern.Commands;

import org.example.OtherDesignPattern.UndoRedoPattern.Receiver.AirConditioner;

import java.util.Random;

public class ChangeTemprature implements Command{
    AirConditioner airConditioner;
    int prevTemperature;
    int currentTemperature;
    private static final Random random=new Random();

    public ChangeTemprature(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;

    }

    @Override
    public void execute() {
        int temp=random.nextInt(16,32);
        prevTemperature =airConditioner.getTemperature();
        currentTemperature =temp;
        System.out.println("Setting temperature : "+temp);
        airConditioner.setTemperature(temp);
    }

    @Override
    public void undo() {
        System.out.println("Unsetting temperature to  : "+prevTemperature);
        currentTemperature = prevTemperature;
        airConditioner.setTemperature(prevTemperature);
        prevTemperature =0;
    }
}
