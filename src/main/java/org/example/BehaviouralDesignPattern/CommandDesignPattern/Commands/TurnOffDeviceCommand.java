package org.example.BehaviouralDesignPattern.CommandDesignPattern.Commands;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.Device;

public class TurnOffDeviceCommand  implements Command {
    Device device;

    public TurnOffDeviceCommand(Device device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
