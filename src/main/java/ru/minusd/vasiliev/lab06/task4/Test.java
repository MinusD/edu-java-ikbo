package ru.minusd.vasiliev.lab06.task4;

public class Test {
    public static void main(String[] args) {
        Priceable game = new Videogame(249);
        Priceable food = new Food(279);
        System.out.println(game.getPrice());
        System.out.println(food.getPrice());
    }
}
