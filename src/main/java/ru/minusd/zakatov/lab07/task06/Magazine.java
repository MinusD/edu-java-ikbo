package ru.minusd.zakatov.lab07.task06;

import java.util.List;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + name);
    }

    static void printMagazines(List<Printable> printables) {
        for (var p : printables) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
}
