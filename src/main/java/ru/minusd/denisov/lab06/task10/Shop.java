package ru.minusd.denisov.lab06.task10;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public boolean deleteComputer(String name) {
        return computers.removeIf(new Predicate<Computer>() {
            @Override
            public boolean test(Computer computer) {
                return computer.getName().equals(name);
            }
        });
    }

    public Computer findComputer(String name) {
        for (Computer computer : computers) {
            if (computer.getName().equals(name)) {
                return computer;
            }
        }
        return null;
    }
}
