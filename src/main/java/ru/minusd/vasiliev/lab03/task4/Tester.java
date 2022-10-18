package ru.minusd.vasiliev.lab03.task4;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите кол-во компьютеров: ");
        int count = scanner.nextInt();
        var shop = new Shop();
        for (int i = 0; i < count; i++){
            System.out.print("Введите название " + (i+1) + "-го компьютера: ");
            String name = scanner.next();
            shop.addComputer(new Computer(name));
        }
        System.out.println(shop);
        System.out.print("Введите название удаляемого компьютера: ");
        String name = scanner.next();
        shop.removeComputer(name);
        System.out.println(shop);
    }
}
