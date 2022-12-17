package ru.minusd.gizatullina.lab21;

import java.util.List;

public class task234<N> {
    private final N[] array;

    public task234(N[] array) {
        this.array = array;
    }
    public N get(int index) {
        return array[index];
    }
    public void printArray() {
        for (N n : array) {
            System.out.print(n +" ");
        }
        System.out.println();
    }

    @SafeVarargs
    public final <T> void print5(T... objs) {
        List<Object> list = List.of(objs);
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        task234<Integer> intObj = new task234<>(intArray);
        task234<Double> doubleObj = new task234<>(doubleArray);
        task234<Character> charObj = new task234<>(charArray);

        intObj.printArray();
        doubleObj.printArray();
        charObj.printArray();

        System.out.println(intObj.get(3));
        System.out.println(doubleObj.get(2));
        System.out.println(charObj.get(1));

        intObj.print5(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intObj.print5('H', 'E', 'L', 'L', 'O');
    }
}