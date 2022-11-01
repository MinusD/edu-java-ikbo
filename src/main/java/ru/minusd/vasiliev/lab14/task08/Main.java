package ru.minusd.vasiliev.lab14.task08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var array = new Object[] {
                "Hello",
                1,
                2,
                3,
                "World",
                4,
                5,
                6,
                "!",
                7,
                8,
                9
        };
        filter(array, o -> {
            if (o instanceof String) {
                System.out.println(o);
            }
        });
    }

    private static void filter(Object[] input, Filter filter) {
        for (Object s : input) {
            filter.apply(s);
        }
    }
}
