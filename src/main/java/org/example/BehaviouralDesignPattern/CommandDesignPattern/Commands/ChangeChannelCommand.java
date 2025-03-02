package org.example.BehaviouralDesignPattern.CommandDesignPattern.Commands;


import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.Tv;

public class ChangeChannelCommand implements Command {
    Tv tv;
    public ChangeChannelCommand(Tv tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
