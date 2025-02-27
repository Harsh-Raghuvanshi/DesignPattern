package org.example.IterativeDesignPattern;

import org.example.IterativeDesignPattern.Aggregators.Library;
import org.example.IterativeDesignPattern.Entities.Book;
import org.example.IterativeDesignPattern.Iterators.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        // Multiple concrete classes can be added in below the aggregator all of them posses function
        // iterator which can create iterator for the respective class and using this we can iterate over it
        List<Book> list=new ArrayList<>();
        list.add(new Book("GK",120));
        list.add(new Book("Maths",240));
        list.add(new Book("Physics",100));
        list.add(new Book("Chemistry",200));
        Library library=new Library(list);

        Iterator<Book> iterator=library.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
