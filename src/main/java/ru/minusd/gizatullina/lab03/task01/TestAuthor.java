package ru.minusd.gizatullina.lab03.task01;

import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Alsu","alsuhgizatullina@yandex.ru",'ж');
        System.out.println("Информация о пользователе: ");
        System.out.println(author.toString());
        System.out.print("Введите новую почту: ");
        Scanner scan = new Scanner(System.in);
        String n= scan.nextLine();
        author.setEmail(n);
        System.out.println("Новая информация о пользователе: ");
        System.out.println(author.toString());
    }
}
