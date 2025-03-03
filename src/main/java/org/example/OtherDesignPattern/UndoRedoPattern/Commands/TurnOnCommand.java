package org.example.OtherDesignPattern.UndoRedoPattern.Commands;

import org.example.OtherDesignPattern.UndoRedoPattern.Receiver.AirConditioner;

public class TurnOnCommand implements Command{
    AirConditioner airConditioner;

    public TurnOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAc();
    }
}
