package org.example.UndoRedoPattern.Client;

import org.example.UndoRedoPattern.Commands.ChangeTemprature;
import org.example.UndoRedoPattern.Commands.TurnOffCommand;
import org.example.UndoRedoPattern.Commands.TurnOnCommand;
import org.example.UndoRedoPattern.Invokers.Remote;
import org.example.UndoRedoPattern.Receiver.AirConditioner;

public class Main {
    public static void main(String[] args){
        AirConditioner airConditioner=new AirConditioner();
        Remote remote=new Remote(new ChangeTemprature(airConditioner));
        remote.pressButton();
        remote.setCommand(new ChangeTemprature(airConditioner));
        remote.pressButton();
        remote.setCommand(new ChangeTemprature(airConditioner));
        remote.pressButton();
        remote.undo();
        remote.undo();
        remote.undo();
    }
}
