package ru.minusd.bulgakova.lab03.task07;

import java.util.Collections;
import java.util.Scanner;

public class Bookshelf {
    public Book[] books;
    public int cntBook;
    public Bookshelf(int cnt){
        Scanner console = new Scanner(System.in);
        this.cntBook = cnt;
        books = new Book[cnt];
        for (int i = 0; i < cnt; i++) {
            System.out.println((i+1)+" book:");
            System.out.print("author: ");
            String author = console.nextLine();
            System.out.print("name: ");
            String name = console.nextLine();
            System.out.print("age: ");
            int age = console.nextInt();
            books[i] = new Book(author,name,age);
            author = console.nextLine();
        }
    }
    public void printBooks(){
        for (int i = 0; i < cntBook; i++) {
            System.out.println("Book "+ (i+1) +": "+ books[i].author+" "+books[i].name+" "+books[i].age);
        }
    }
    public Book maxAgeBook(){
        Book max = books[0];
        for (int i = 0; i < cntBook; i++) {
            max = (max.age<books[i].age) ? books[i] : max;
        }
        return max;
    }
    public Book minAgeBook(){
        Book min = books[0];
        for (int i = 0; i < cntBook; i++) {
            min = (min.age>books[i].age) ? books[i] : min;
        }
        return min;
    }
    public void sortBooks(){
        for (int i = 0; i < cntBook; i++) {
            for (int j = 0; j < cntBook-1-i; j++) {
                if (books[j].age>books[j+1].age){
                    Book temp = books[j+1];
                    books[j+1] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
}

