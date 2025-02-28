package org.example.MomentoDesignPattern.Originator;

import org.example.MomentoDesignPattern.Memento.Memento;

public class Person {
    String name;
    Integer age;
    String gender;

    public Person(String name,Integer age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public Memento createMemento(){
        return new Memento(name,age,gender);
    }

    public void resetToMemento(Memento memento){
        this.name=memento.getName();
        this.gender=memento.getGender();
        this.age=memento.getAge();
    }
}
