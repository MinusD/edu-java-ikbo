package ru.minusd.zakatov.lab21.task2;

public class Test {
    public static void main(String[] args) {
        CustomArray arr = new CustomArray();
        arr.add(3);
        arr.add("Hello, world!");
        arr.add(5.12);
        arr.add((Runnable) () -> {
            System.out.println("Hello world!");
        });

        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%s : %s\n", arr.get(i).getClass().getName(), arr.get(i));
        }
    }
}
