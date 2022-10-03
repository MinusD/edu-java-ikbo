package ru.minusd.zakatov.lab02.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод: ");
        String[] strs = in.nextLine().split(" ");
        System.out.println("Вы ввели " + strs.length + " строк");
    }
}
