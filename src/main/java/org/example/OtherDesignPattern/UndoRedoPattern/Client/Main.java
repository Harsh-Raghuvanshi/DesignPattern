package org.example.OtherDesignPattern.UndoRedoPattern.Client;

import org.example.OtherDesignPattern.UndoRedoPattern.Commands.ChangeTemprature;
import org.example.OtherDesignPattern.UndoRedoPattern.Receiver.AirConditioner;
import org.example.OtherDesignPattern.UndoRedoPattern.Invokers.Remote;

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
