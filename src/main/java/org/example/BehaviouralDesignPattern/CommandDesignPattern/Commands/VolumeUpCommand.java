package org.example.BehaviouralDesignPattern.CommandDesignPattern.Commands;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.Speaker;

public class VolumeUpCommand implements Command {
    Speaker speaker;

    public VolumeUpCommand(Speaker speaker){
        this.speaker=speaker;
    }

    @Override
    public void execute() {
        speaker.volumeUp();
    }
}
