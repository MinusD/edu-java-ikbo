package ru.minusd.vasiliev.lab03.task8;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var count = scanner.nextInt();
        var strArray = new String[count];
        for (int i = 0; i < count; i++) {
            strArray[i] = scanner.next();
        }
        System.out.println(Arrays.toString(strArray));
        for (int i = 0; i < count / 2; i++) {
            var temp = strArray[i];
            strArray[i] = strArray[strArray.length - i - 1];
            strArray[strArray.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(strArray));
    }
}
