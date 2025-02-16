package org.example.LoggingSystem;

public abstract class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    protected int logLevel;
    protected AbstractLogger nextAbstractLogger;

    public void setNextAbstractLogger(AbstractLogger logger){
        this.nextAbstractLogger=logger;
    }

    public void printOrPassLog(int level,String message){
        if(this.logLevel<=level){
            write(message);
        }
        if(nextAbstractLogger!=null){
            nextAbstractLogger.printOrPassLog(level,message);
        }
    }

    public abstract void write(String message);


}
