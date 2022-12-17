package ru.minusd.poplavskij.lab02.task03;

public class Tester {
    private static Circle[] arr = new Circle[5];
    private static int arr_size = 5;

    public static void main(String[] args) {
        for (int i = 0; i < arr_size; i++) {
            arr[i] = new Circle(i+1,i+1,i+1);
            System.out.println(arr[i].toString());
        }
    }
}
