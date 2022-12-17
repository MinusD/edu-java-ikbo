package ru.minusd.bulgakova.lab03.task01;

import java.util.Scanner;

public class Cl_2 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.print("Input name: ");
        String name = console.nextLine();
        System.out.print("Input email: ");
        String email = console.nextLine();
        System.out.print("Input gender: ");
        String _gender = console.nextLine();
        char gender= _gender.charAt(0);
        Cl_1 author=new Cl_1(name,email,gender);
        System.out.println("name: "+author.getName());
        System.out.println("email: "+author.getEmail());
        System.out.println("gender: "+author.getGender());
        System.out.print("Change email: ");
        email = console.nextLine();
        author.setEmail(email);
        System.out.println("email: "+author.getEmail());
        System.out.println(author.toString());
    }
}

