package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args){
        AbstractLogger logger=LoggerChain.getLoggerChain();



        logger.printOrPassLog(AbstractLogger.ERROR,"This is a Error message ");
        System.out.println();
        logger.printOrPassLog(AbstractLogger.INFO,"This is Info message ");
        System.out.println();
        logger.printOrPassLog(AbstractLogger.DEBUG,"This is Debug message ");
    }
}
