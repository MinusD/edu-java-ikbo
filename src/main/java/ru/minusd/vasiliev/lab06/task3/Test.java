package ru.minusd.vasiliev.lab06.task3;


public class Test {
    public static void main(String[] args) {
        Nameable planet = new Planet("Mars");
        Nameable cat = new Cat("KittyCat");
        System.out.println(planet.getName());
        System.out.println(cat.getName());
    }
}
