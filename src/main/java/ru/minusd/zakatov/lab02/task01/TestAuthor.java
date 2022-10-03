package ru.minusd.zakatov.lab02.task01;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Igor";
        String email = "igor@mail.com";
        char gender = 'm';

        Author author = new Author(name, email, gender);

        System.out.println(author);
        System.out.print("New email: ");
        author.setEmail(in.nextLine());
        System.out.println(author);
        System.out.println("Get name: " + author.getName() + ", get gender: " + author.getGender());
    }
}
