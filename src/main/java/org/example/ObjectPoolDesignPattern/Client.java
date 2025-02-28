package org.example.ObjectPoolDesignPattern;

public class Client {
    public static void main(String[] args){
        ConnectionPool connectionPool=new ConnectionPool();
        ConnectionThread t1=connectionPool.getConnectionThread();
        ConnectionThread t2=connectionPool.getConnectionThread();
        ConnectionThread t3=connectionPool.getConnectionThread();
        ConnectionThread t4=connectionPool.getConnectionThread();
        ConnectionThread t5=connectionPool.getConnectionThread();
        connectionPool.freeConnectionThread(t2);
        ConnectionThread t6=connectionPool.getConnectionThread();
    }
}
