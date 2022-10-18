package ru.minusd.vasiliev.lab02;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int count, num;
        System.out.print("Введите кол-во элементов: ");
        count = scanner.nextInt();

        var arr = generateArray(count);
        printArray(arr);

        System.out.print("Введите удаляемое число: ");
        num = scanner.nextInt();
        arr = eraseNumber(arr, num);
        printArray(arr);

        System.out.print("Введите последнюю цифру удаляемых чисел: ");
        num = scanner.nextInt();
        arr = eraseByLastDigit(arr, num);
        printArray(arr);
    }

    private static int[] eraseByLastDigit(int[] arr, int digit){
        var removable = new HashSet<Integer>();
        for (int num : arr) {
            if (num%10 == digit){
                removable.add(num);
            }
        }
        for (int number : removable){
            arr = eraseNumber(arr, number);
        }
        return arr;
    }

    private static int[] eraseNumber(int[] arr, int numberToRemove){
        var list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != numberToRemove){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    private static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

    private static int[] generateArray(int count){
        var rand = new Random();
        var arr = new int[count];
        for (int i = 0; i < count; i++){
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}