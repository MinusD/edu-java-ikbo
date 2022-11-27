package ru.minusd.vasiliev.lab21.task4;

import java.util.Arrays;

public class UniversalArray {
    private Object[] array;

    public UniversalArray(Object[] array) {
        this.array = array;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public Object get(int index) {
        return array[index];
    }

    public void printFirstFive() {
        var list = Arrays.asList(array);
        list.stream().limit(5).forEach(System.out::println);
    }
}
