package org.example.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;


public class LoggerChain {
    public static AbstractLogger getLoggerChain(){
        AbstractLogger infoLogger=new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger=new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextAbstractLogger(debugLogger);
        debugLogger.setNextAbstractLogger(errorLogger);

        System.out.println(infoLogger.logLevel+" "+ infoLogger.nextAbstractLogger.logLevel);
        System.out.println(debugLogger.logLevel+" "+debugLogger.nextAbstractLogger.logLevel);
        System.out.println(errorLogger.logLevel+" "+errorLogger.nextAbstractLogger);

        return infoLogger;
    }

}
