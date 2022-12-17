package ru.minusd.bulgakova.lab03.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NurseryDogs {
    public List <Dog> dogs;

    public NurseryDogs(){
        dogs = new ArrayList<Dog>();
    }
    public void addGogs(int cnt) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < cnt; i++) {
            System.out.print("Input name "+(i+1)+" dog: ");
            String name = console.nextLine();
            System.out.print("Input age "+(i+1)+" dog: ");
            int age = console.nextInt();
            dogs.add(new Dog(name, age));
            name = console.nextLine();
        }

    }
}
