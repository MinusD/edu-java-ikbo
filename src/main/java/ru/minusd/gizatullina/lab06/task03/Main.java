package ru.minusd.gizatullina.lab06.task03;

public class Main {
    public static void main(String[] args) {
        Nameable a = new Animal("Rocky");
        Nameable b = new Planet("Saturn");
        System.out.printf("Animal name: %s", a.getName());
        System.out.printf("\nPlanet name: %s", b.getName());
    }
}