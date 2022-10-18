package ru.minusd.vasiliev.lab01;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = inputArray();

        System.out.printf("Сумма через for: %d\n", forSum(array));
        System.out.printf("Сумма через while: %d\n", whileSum(array));
        System.out.printf("Сумма через do-while: %d\n", doWhileSum(array));
    }

    private static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            System.out.printf("Введите %d-е число: ", i + 1);
            int newNumber = scanner.nextInt();
            array[i] = newNumber;
        }
        return array;
    }

    private static int forSum(int[] array){
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    private static int whileSum(int[] array){
        int sum = 0, index = 0;
        while (index < array.length){
            sum += array[index];
            index++;
        }
        return sum;
    }

    private static int doWhileSum(int[] array){
        int sum = 0, index = 0;
        if (array.length == 0) return 0;
        do {
            sum += array[index];
            index++;
        } while(index < array.length);
        return sum;
    }
}
