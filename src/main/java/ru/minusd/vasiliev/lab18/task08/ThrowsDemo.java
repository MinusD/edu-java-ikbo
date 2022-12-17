package ru.minusd.vasiliev.lab18.task08;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            String key = myScanner.nextLine();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Неверный ключ");
            }
            if (i != 1) {
                System.out.println("Попробуйте еще раз");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Передана пустая строка");
        }
        return "data for " + key;
    }
}
