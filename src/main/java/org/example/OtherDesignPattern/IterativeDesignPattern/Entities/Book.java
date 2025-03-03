package org.example.OtherDesignPattern.IterativeDesignPattern.Entities;

public class Book {
    String bookName;
    int price;

    public Book(String bookName,int price){
        this.bookName=bookName;
        this.price=price;
    }

    String getBookName(){
        return bookName;
    }
    int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
