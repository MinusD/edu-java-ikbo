package ru.minusd.vasiliev.lab02;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int count, initialNumIndex;
        var scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        count = scanner.nextInt();
        System.out.print("Введите номер первого числа: ");
        initialNumIndex = scanner.nextInt();

        fibo(count, initialNumIndex);
    }

    private static void fibo(int count, int initialNumIndex){
        int current = 1, previous = 0, index = 0, sum;
        while (count > 0){
            sum = current + previous;
            if (index >= initialNumIndex){
                System.out.println(previous);
                count--;
            }
            previous = current;
            current = sum;
            index++;
        }
    }
}
