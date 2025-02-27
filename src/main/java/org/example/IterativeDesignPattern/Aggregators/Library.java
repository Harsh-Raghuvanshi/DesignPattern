package org.example.IterativeDesignPattern.Aggregators;

import org.example.IterativeDesignPattern.Entities.Book;
import org.example.IterativeDesignPattern.Iterators.BookIterator;
import org.example.IterativeDesignPattern.Iterators.Iterator;

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
