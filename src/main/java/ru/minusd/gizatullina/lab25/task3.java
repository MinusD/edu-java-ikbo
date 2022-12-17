package ru.minusd.gizatullina.lab25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        Pattern ip = Pattern.compile("^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9][0-9]|[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9][0-9]|[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9][0-9]|[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9][0-9]|[0-9])");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите IP адрес: ");
        String ipaddress = scanner.nextLine();
        if (ip.matcher(ipaddress).matches()) {
            System.out.println("IP адресс правильный");
        } else {
            System.out.println("IP адресс неправильный");
        }
    }
}
