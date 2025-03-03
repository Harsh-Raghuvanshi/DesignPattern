package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class ErrorLogger extends AbstractLogger{
    ErrorLogger(int logLevel){
        this.logLevel=logLevel;
    }

    @Override
    public void write(String message) {
        System.out.println("ERROR : "+message);
    }
}
