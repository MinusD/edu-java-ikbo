package ru.minusd.poplavskij.lab02.task04;

import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> comps = new ArrayList<Computer>(0);

    public void add(String name) {

        this.comps.add(new Computer(name));
    }

    public int find(String name) {
        for (int i = 0; i < comps.size(); i++) {
            if (comps.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(String name) {
        comps.removeIf(comp -> (comp.getName().equals(name)));
    }

}
