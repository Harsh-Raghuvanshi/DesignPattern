package org.example.MomentoDesignPattern;

import org.example.MomentoDesignPattern.Caretaker.Caretaker;
import org.example.MomentoDesignPattern.Memento.Memento;
import org.example.MomentoDesignPattern.Originator.Person;

public class Client {
    public static void main(String[] args){
        //Generally this pattern is used when we want to implement a undo redo like operations
        Caretaker caretaker=new Caretaker();
        Person person=new Person("Harsh",21,"male");
        caretaker.addMemento(person.createMemento());
        Person person1=new Person("Ria",21,"female");
        caretaker.addMemento(person1.createMemento());
        Person person2=new Person("Alice",22,"male");
        caretaker.addMemento((person2.createMemento()));

        caretaker.popAndReturnMemento();
        Memento secondOne=caretaker.popAndReturnMemento();
        System.out.println(secondOne);
        Memento thirdOne=caretaker.popAndReturnMemento();
        System.out.println(thirdOne);

    }
}
