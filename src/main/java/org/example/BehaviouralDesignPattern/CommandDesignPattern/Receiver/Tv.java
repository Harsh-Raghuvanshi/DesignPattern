package org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver;

public class Tv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning On TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Off TV");
    }

    public void changeChannel(){
        System.out.println("Channel Changed Successfully");
    }
}
