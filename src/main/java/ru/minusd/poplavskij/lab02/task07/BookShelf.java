package ru.minusd.poplavskij.lab02.task07;

import java.util.ArrayList;
import java.util.Comparator;

public class BookShelf {
    ArrayList<Book> books = new ArrayList<Book>(0);
    public void sort(){
        books.sort(Comparator.comparingInt(Book::getYear));
    }
    public ArrayList<Book> getFirstAndLast (){
        this.sort();
        ArrayList<Book> a = new ArrayList<Book>();
        a.add(this.books.get(0));
        a.add(this.books.get(this.books.size()-1));
        return a;
    }
}
