package ru.minusd.gizatullina.lab03.task07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bookshelf {
    private List<Book> arr = new ArrayList<>();
    private int count;

    @Override
    public String toString() {
        StringBuilder temp=new StringBuilder();
        for (var book: arr){
            temp.append(book.toString()).append("\n");
        }
        return "Bookshelf{" +
                "arr=\n" + temp +
                ", count=" + arr.size() +
                '}';
    }

    public void add(Book book) {
        arr.add(book);
    }

    public Book Last() {
        int maxage = 0;
        Book lastBook=null;
        for (var book : arr) {
            if (book.getAge() > maxage) {
                maxage = book.getAge();
                lastBook=book;
            }
        }
        return lastBook;
    }

    public Book First() {
        int maxage = 10000;
        Book firstBook=null;
        for (var book : arr) {
            if (book.getAge() < maxage) {
                maxage = book.getAge();
                firstBook=book;
            }
        }
        return firstBook;
    }

    public void Sort(){
        arr = arr.stream().sorted(Comparator.comparingInt(Book::getAge)).collect(Collectors.toList());
    }
}
