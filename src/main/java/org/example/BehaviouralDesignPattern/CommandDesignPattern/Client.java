package org.example.BehaviouralDesignPattern.CommandDesignPattern;

import org.example.BehaviouralDesignPattern.CommandDesignPattern.Commands.*;
import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.Speaker;
import org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver.Tv;

public class Client {
    public static void main(String[] args){
        Tv tv=new Tv();
        Speaker speaker=new Speaker();
        Command turnOnCommand=new TurnOnDeviceCommand(tv);
        Command turnOnCommand1=new TurnOnDeviceCommand(speaker);
        Command volumeUp=new VolumeUpCommand(speaker);
        Command changeChannel=new ChangeChannelCommand(tv);
        RemoteControl remoteControl=new RemoteControl(turnOnCommand);
        remoteControl.pressButton();
        remoteControl=new RemoteControl(changeChannel);
        remoteControl.pressButton();
        remoteControl=new RemoteControl(turnOnCommand1);
        remoteControl.pressButton();
        remoteControl=new RemoteControl(volumeUp);
        remoteControl.pressButton();
    }
}
