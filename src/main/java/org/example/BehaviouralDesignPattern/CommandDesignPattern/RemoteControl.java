package org.example.BehaviouralDesignPattern.CommandDesignPattern;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Commands.Command;

public class RemoteControl {
    Command command;

    public RemoteControl(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}
