package ru.minusd.zakatov.lab06.task03;

import java.util.ArrayList;
import java.util.List;

public class TestNameable {
    public static void main(String[] args) {
        List<Nameable> ns = new ArrayList<>();
        ns.add(new Planet("Earth", 6500));
        ns.add(new Planet("Mars", 3300));
        ns.add(new Animal("Dog", 13));
        ns.add(new Animal("Cat", 15));
        ns.add(new Planet("Saturn",58000));

        for (var n : ns) {
            System.out.println(n.getName());
        }
    }
}
