package ru.minusd.budkov.lab02.task04;

import java.util.Scanner;

public class Tester4 {
    public static void main(String[] args){
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String name;
        for(int i = 0; i < n; i++) {
            name = scanner.nextLine();
            shop.addComputer(new Computer(name));
        }
        shop.deleteComputer("mac");
        shop.findComputer("asus");
    }
}
