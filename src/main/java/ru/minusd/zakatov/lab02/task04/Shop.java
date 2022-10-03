package ru.minusd.zakatov.lab02.task04;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public Shop(List<Computer> computers) {
        this.computers = computers;
    }

    public void add(Computer computer) {
        computers.add(computer);
    }

    public Computer get(int id) {
        return computers.stream().filter(computer -> computer.getId() == id).findFirst().get();
    }

    public Computer get(String query) {
        return computers.stream().filter(computer -> computer.getName().contains(query)).findFirst().get();
    }

    public void remove(int id) {
        computers.removeIf(cp -> cp.getId() == id);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }
}
