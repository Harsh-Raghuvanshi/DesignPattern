package org.example.OtherDesignPattern.UndoRedoPattern.Invokers;

import org.example.OtherDesignPattern.UndoRedoPattern.Commands.Command;

import java.util.Stack;

public class Remote {
    Command command;
    Stack<Command> actions;

    public Remote(Command command) {
        this.command = command;
        actions=new Stack<>();
    }

    public void pressButton(){
        command.execute();
        actions.push(command);
    }

    public void undo(){
        if(actions.empty()){
            System.out.println("No command history !!1");
            return;
        }
        Command command1= actions.pop();
        command1.undo();
    }

    public void setCommand(Command command){
        this.command=command;
    }
}
