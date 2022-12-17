package ru.minusd.denisov.lab06.task04;

public class TestPriceableObjects {
    public static void main(String[] args) {
        Priceable[] priceables = new Priceable[3];
        priceables[0] = new Computer("Supercomputer", 1000000);
        priceables[1] = new Tablet("iPad", 10);
        priceables[2] = new House("Vernadskogo av, 78", 5000000);

        for (Priceable priceable : priceables) {
            System.out.println(priceable.toString() + " Price: " + priceable.getPrice());
        }
    }
}
