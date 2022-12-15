package ru.minusd.budkov.lab02.task07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shelf {
    public ArrayList<Book> books = new ArrayList<>();

    public Shelf(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getFirst(){
        ArrayList<Integer> years = new ArrayList<>();
        int first = Collections.min(years);
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getYear() == first){
                return books.get(i);
            }
        }
        return null;
    }
    public Book getLast(){
        ArrayList<Integer> years = new ArrayList<>();
        int last = Collections.max(years);
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getYear() == last){
                return books.get(i);
            }
        }
        return null;
    }
    public void sortShelf(){
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYear() - o2.getYear();
            }
        });
    }
}