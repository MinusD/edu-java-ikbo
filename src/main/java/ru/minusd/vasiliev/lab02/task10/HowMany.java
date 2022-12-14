package ru.minusd.vasiliev.lab02.task10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        System.out.println(str.split(" ").length - 1);
    }
}
