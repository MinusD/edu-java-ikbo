package ru.minusd.budkov.lab02.task05;

import java.util.ArrayList;

public class DogKennel {
    ArrayList<Dog> dogs = new ArrayList<>();

    public void addDog(String name, int age){
        Dog dog = new Dog();
        dog.setAge(age);
        dog.setName(name);
        dogs.add(dog);
    }

    public static void main(String[] args){
        DogKennel dogKennel = new DogKennel();
        dogKennel.addDog("Шарик",4);
        dogKennel.addDog("Бобик",5);
        dogKennel.addDog("Арчи",6);
        dogKennel.addDog("Алтай",7);
        dogKennel.addDog("Шарик",8);
        dogKennel.addDog("Шарик",9);
        System.out.println(dogKennel.dogs.get(3).toString());
    }
}