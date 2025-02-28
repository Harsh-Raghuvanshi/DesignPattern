package org.example.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectionPool {
    List<ConnectionThread> freeConnectionThreads;
    List<ConnectionThread> busyConnectionThreads;
    int INITIAL_POOL_SIZE=2;
    int MAX_POOL_SIZE=4;

    public ConnectionPool(){
        freeConnectionThreads=new ArrayList<>();
        busyConnectionThreads=new ArrayList<>();
        for(int i=0;i<INITIAL_POOL_SIZE;i++){
            freeConnectionThreads.add(new ConnectionThread(new DbConnection("users","12@122","read")));
        }
    }

    public ConnectionThread getConnectionThread(){
        if(freeConnectionThreads.isEmpty() && busyConnectionThreads.size()<MAX_POOL_SIZE){
            System.out.println("Created NEW Connection thread !!!");
            freeConnectionThreads.add(new ConnectionThread(new DbConnection("users","12@122","read")));
        }else if(freeConnectionThreads.isEmpty() && busyConnectionThreads.size()==MAX_POOL_SIZE){
            System.out.println("All threads are in use you have to WAIT ... ");
            return null;
        }
        System.out.println("Thread Allocated Successfully !!!");
        ConnectionThread connectionThread=freeConnectionThreads.get(0);
        freeConnectionThreads.remove(0);
        busyConnectionThreads.add(connectionThread);
        return connectionThread;
    }

    public void freeConnectionThread(ConnectionThread connectionThread){
        busyConnectionThreads=busyConnectionThreads.stream().filter((thread)->thread==connectionThread).collect(Collectors.toList());
        freeConnectionThreads.add(connectionThread);
        System.out.println("Connection Thread Freed Successfully !!!");
    }
}
