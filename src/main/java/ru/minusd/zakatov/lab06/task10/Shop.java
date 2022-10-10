package ru.minusd.zakatov.lab06.task10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(int idx) {
        computers.remove(idx);
    }

    public void print() {
        for (int i = 0; i < computers.size(); i++) {
            System.out.println((i + 1)  + ": " + computers.get(i));
        }
    }

    public Computer search(String query) {
        return computers.stream().filter(c -> c.getBrand().toString().toLowerCase().contains(query)).findFirst().get();
    }
}
