package org.example.BehaviouralDesignPattern.MomentoDesignPattern.Caretaker;

import org.example.BehaviouralDesignPattern.MomentoDesignPattern.Memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> mementoList;
    public Caretaker(){
        mementoList=new ArrayList<>();
    }
    public void addMemento(Memento memento){
        mementoList.add(memento);
    }
    public Memento popAndReturnMemento(){
        int siz= mementoList.size();
        if(siz==0)return null;
        Memento memento=mementoList.get(siz-1);
        mementoList.remove(siz-1);
        return memento;
    }
}
