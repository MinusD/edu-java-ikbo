package ru.minusd.vasiliev.lab06.task10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<Computer>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    
    public void removeComputer(String computerName) {
        computers.removeIf(computer -> computer.getName().equals(computerName));
    }

    public Computer getComputer(String computerName) {
        for (Computer computer: computers) {
            if (computer.getName().equals(computerName)) {
                return computer;
            }
        }
        return null;
    }
}
