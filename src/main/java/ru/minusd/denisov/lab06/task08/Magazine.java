package ru.minusd.denisov.lab06.task08;

import ru.minusd.denisov.lab06.task06.Printable;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал " + name);
    }
}
