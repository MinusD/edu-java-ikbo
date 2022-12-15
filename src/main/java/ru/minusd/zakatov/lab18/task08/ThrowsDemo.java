package ru.minusd.zakatov.lab18.task08;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = myScanner.next();

        while (true) {
            try {
                printDetails(key);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Enter key: ");
                key = myScanner.next();
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("1")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey();
    }
}

