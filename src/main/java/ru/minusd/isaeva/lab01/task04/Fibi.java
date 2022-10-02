package ru.minusd.isaeva.lab01.task04;

import java.util.Scanner;
public class Fibi {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество необходимых элементов: ");
        int countOfFib = Integer.parseInt(in.nextLine());
        System.out.println("Введите порядковый номер первого: ");
        int numberOfFib = Integer.parseInt(in.nextLine());
        int[] fib = new int[numberOfFib+countOfFib];
        for (int i = 0; i < numberOfFib+countOfFib; i++){
            if (i < 2)
                fib[i] = i;
            else
                fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = numberOfFib-1; i < numberOfFib+countOfFib; i++){
            System.out.println(fib[i]+" ");
        }
    }
}
