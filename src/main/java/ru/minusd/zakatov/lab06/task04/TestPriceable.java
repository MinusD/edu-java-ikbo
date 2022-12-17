package ru.minusd.zakatov.lab06.task04;

import java.util.ArrayList;
import java.util.List;

public class TestPriceable {
    public static void main(String[] args) {
        List<Priceable> prices = new ArrayList<>();

        prices.add(new Car(12000, "BMW"));
        prices.add(new Product(500, "TV", 20));
        prices.add(new Car(20000, "Mercedes Benz"));
        prices.add(new Product(1200, "Iphone 14", 200));

        for (var p : prices) {
            System.out.println(p + " price=" + p.getPrice());
        }
    }
}
