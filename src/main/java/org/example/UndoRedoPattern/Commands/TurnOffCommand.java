package org.example.UndoRedoPattern.Commands;

import org.example.UndoRedoPattern.Receiver.AirConditioner;

public class TurnOffCommand implements Command{
    AirConditioner airConditioner;

    public TurnOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }

}
