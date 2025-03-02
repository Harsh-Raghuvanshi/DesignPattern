package org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver;

public class Speaker implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning On Speakers");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Off Speakers");
    }

    public void volumeUp(){
        System.out.println("Volume is up Now");
    }
}
