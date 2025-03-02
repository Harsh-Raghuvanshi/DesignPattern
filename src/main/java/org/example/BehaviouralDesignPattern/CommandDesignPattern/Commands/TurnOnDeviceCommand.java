package org.example.BehaviouralDesignPattern.CommandDesignPattern.Commands;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.Device;

public class TurnOnDeviceCommand implements Command {
    Device device;

    public TurnOnDeviceCommand(Device device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
