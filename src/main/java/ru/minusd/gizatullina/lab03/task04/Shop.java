package ru.minusd.gizatullina.lab03.task04;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Computer> computers = new ArrayList<>();

    public void add(Computer computer) {
        computers.add(computer);
    }

    public void del(Computer computer) {
        computers.remove(computer);
    }

    public Computer find(String name) {
        for (var computer : computers) {
            // name == computer.getName()
            if (name.equals(computer.getName())) {
                return computer;
            }
        }
        return null;
    }

    @Override
    public String toString() {

        StringBuilder tmp = new StringBuilder();
        for (var computer : computers)
            tmp.append(computer.toString()).append("\n");

        return "Shop{" +
                "computers=\n" + tmp +
                '}';
    }
}
