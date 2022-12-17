package ru.minusd.vasiliev.lab02.task4;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> pcList = new ArrayList<>();

    public Computer find(String name) {
        for (Computer computer : pcList) {
            if (computer.getName().equals(name)) {
                return computer;
            }
        }
        throw new IllegalArgumentException("PC not found");
    }

    public void addComputer(Computer computer){
        pcList.add(computer);
    }

    public void removeComputer(String name){
        pcList.remove(find(name));
    }

    @Override
    public String toString() {
        return "Shop{" +
                "pcList=" + pcList +
                '}';
    }
}
