package org.example.UndoRedoPattern.Commands;

import org.example.UndoRedoPattern.Receiver.AirConditioner;

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
