package ru.minusd.marov.lab03.task01;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("input name");
        String name = source.nextLine();
        System.out.println("input email");
        String email = source.nextLine();
        System.out.println("input gender");
        char gender = source.next().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println("toString test");
        System.out.println(author.toString());
        author.setEmail("setEmail@gmail.com");
        author.setName("setName");
        System.out.println("getName test: " + author.getName());
        System.out.println("getEmail test: " + author.getEmail());
        System.out.println("getGender test: " + author.getGender());
    }
}
