package ru.minusd.vasiliev.lab21.task4;

public class ArrayTest {
    public static void main(String[] args) {
        var arr = new UniversalArray(new Object[]{1, "aaa", 3.44f, 'c', 5, "babba", 7.0, 'd'});
        System.out.println("Первый элемент: " + arr.get(0));
        System.out.println("Первые пять элементов массива:");
        arr.printFirstFive();
    }
}
