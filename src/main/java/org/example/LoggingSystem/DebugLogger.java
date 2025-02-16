package org.example.LoggingSystem;

public class DebugLogger extends AbstractLogger{
    DebugLogger(int logLevel){
        this.logLevel=logLevel;
    }

    @Override
    public void write(String message) {
        System.out.println("DEBUG : "+message);
    }
}
