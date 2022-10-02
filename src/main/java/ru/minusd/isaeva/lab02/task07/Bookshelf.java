package ru.minusd.isaeva.lab02.task07;
import java.util.Comparator;
import java.util.Arrays;

public class Bookshelf {
    int max = 10;
    int count = 0;
    Book[] bookshelf = new Book[max];
    public void print() {
        for(int i = 0; i < count; i++ ){
            System.out.println(bookshelf[i].getTitle() + " "
                    + bookshelf[i].getAuthor() + " "
                    + bookshelf[i].getYear());
        }
    }
    public void addBook(String title, String author, int year){
        Book book = new Book(title,author,year);
        bookshelf[count] = book;
        count++;
    }
    public Book min(){
        Book min = new Book("", "", 3000);
        for (int i=0; i<count; i++){
            if (bookshelf[i].getYear() < min.getYear()){
                min=bookshelf[i];
            }
        }
        return min;
    }
    public Book max(){
        Book max = new Book("", "", 0);
        for (int i=0; i<count; i++){
            if (bookshelf[i].getYear() > max.getYear()){
                max=bookshelf[i];
            }
        }
        return max;
    }

    public void sort(){
        for (int i = count-1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (bookshelf[j].getYear() > bookshelf[j+1].getYear()){
                    Book temp = bookshelf[j];
                    bookshelf[j] = bookshelf[j+1];
                    bookshelf[j+1] = temp;
                }
    }
}
