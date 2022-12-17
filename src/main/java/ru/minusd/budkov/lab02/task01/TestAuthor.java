package ru.minusd.budkov.lab02.task01;

import ru.minusd.budkov.lab02.task01.Author;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Ivanov", "ivanov@mail.ru", 'm');
        System.out.println(author.toString());
    }
}