package org.example.OtherDesignPattern.IterativeDesignPattern.Iterators;

import java.util.List;

public class BookIterator<T> implements Iterator<T>{
    List<T> bookList;
    int cursor;

    public BookIterator(List<T> bookList){
        this.bookList=bookList;
        cursor=0;
    }

    @Override
    public boolean hasNext() {
        return cursor<bookList.size();
    }

    @Override
    public T next() {
        if(hasNext()) {
            return bookList.get(cursor++);
        }
        return null;
    }
}
