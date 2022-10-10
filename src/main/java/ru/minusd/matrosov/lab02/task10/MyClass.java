package lab02.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Подсчет количества слов в одной строке: ");
        System.out.println("Введите строку ");

        String s = scanner.nextLine();
        int count = 1;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }

}
