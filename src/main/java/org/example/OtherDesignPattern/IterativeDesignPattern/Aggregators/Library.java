package org.example.OtherDesignPattern.IterativeDesignPattern.Aggregators;

import org.example.OtherDesignPattern.IterativeDesignPattern.Entities.Book;
import org.example.OtherDesignPattern.IterativeDesignPattern.Iterators.BookIterator;
import org.example.OtherDesignPattern.IterativeDesignPattern.Iterators.Iterator;

import java.util.List;

public class Library implements Aggregator<Book>{
    List<Book> bookList;
    public Library(List<Book> bookList){
        this.bookList=bookList;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator<>(bookList);
    }
}
