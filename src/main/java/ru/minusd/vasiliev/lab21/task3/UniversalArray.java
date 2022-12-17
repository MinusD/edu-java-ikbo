package ru.minusd.vasiliev.lab21.task3;

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
}
