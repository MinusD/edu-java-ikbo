package ru.minusd.gizatullina.lab06.task04;

public class Main {
    public static void main(String[] args) {
        Priceable a = new Cake(555);
        Priceable b = new Dress(1000);
        System.out.printf("Cake cost: %s", a.getPrice());
        System.out.printf("\nDress cost: %s", b.getPrice());
    }
}
