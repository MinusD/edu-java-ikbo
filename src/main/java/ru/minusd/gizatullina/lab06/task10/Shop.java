package ru.minusd.gizatullina.lab06.task10;

import ru.minusd.gizatullina.lab02.task02.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Shop {


    private ArrayList<Computer> arr;
    public Shop() {
        this.arr = new ArrayList<>();
    }
    void addComputer(Computer computer)
    {
        this.arr.add(computer);
    }

    void deleteByName(String name) {
        arr.removeIf(computer -> Objects.equals(computer.getName(), name));
    }

    Computer findByName(String name) {
        for (var computer : arr) {
            if (Objects.equals(computer.getName(), name)) {
                return computer;
            }
        }
        return null;
    }


}
