package ru.minusd.bulgakova.lab03.task05;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        NurseryDogs nurseryDogs=new NurseryDogs();
        System.out.print("Input count dogs: ");
        int cntDogs = console.nextInt();
        nurseryDogs.addGogs(cntDogs);
        for (Dog dog :nurseryDogs.dogs )
            System.out.println(dog.toString());

    }
}

