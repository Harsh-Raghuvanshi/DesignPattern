package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class InfoLogger extends AbstractLogger{
    InfoLogger(int logLevel){
        this.logLevel=logLevel;
    }

    @Override
    public void write(String message) {
        System.out.println("INFO : "+message);
    }
}
