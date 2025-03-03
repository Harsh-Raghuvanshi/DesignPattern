package org.example.OtherDesignPattern.UndoRedoPattern.Receiver;

public class AirConditioner {
    boolean isOn;
    Integer temperature;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 0;
    }

    public void turnOnAc(){
        isOn=true;
        System.out.println("AC is ON ...");
    }

    public void turnOffAc(){
        isOn=false;
        System.out.println("AC is OFF ...");
    }

    public void setTemperature(int temperature){
        System.out.println("New Ac temperature is : "+temperature);
        this.temperature=temperature;
    }

    public int getTemperature(){
        return temperature;
    }

}
