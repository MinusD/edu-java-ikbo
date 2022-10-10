package ru.minusd.bulgakova.lab03.task04;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Shop shop=new Shop();
        System.out.print("Input count computers: ");
        int cntComp = console.nextInt();
        String name = console.nextLine();
        for (int i = 1; i < cntComp+1; i++) {
            System.out.print("Input name "+i+" computer: ");
            name = console.nextLine();
            shop.addComputer(name);
        }
        System.out.print("What name computer do you want find? ");
        name = console.nextLine();
        shop.findComputer(name);
        System.out.print("What name computer do you want find? ");
        name = console.nextLine();
        shop.findComputer(name);
    }


}
