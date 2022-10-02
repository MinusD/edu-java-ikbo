package ru.minusd.denisov.lab02.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Computer> computers = new ArrayList<>();
        System.out.print("Количество компьютеров: ");
        int x = scanner.nextInt();
        System.out.println("Введите названия компьютеров: ");
        for (int i = 0; i < x; i++) {
            computers.add(new Computer(scanner.next()));
        }

        Shop shop = new Shop(computers);

        System.out.print("Добавьте еще один компьютер: ");
        shop.addComputer(new Computer(scanner.next()));

        System.out.print("Удалите один компьютер: ");
        if (shop.deleteComputer(scanner.next())) {
            System.out.println("Компьютер был успешно удален.");
        } else {
            System.out.println("Такого компьютера не было.");
        }

        System.out.print("Найти компьютер: ");
        Computer requiredComputer = shop.findComputer(scanner.next());
        if (requiredComputer != null) {
            System.out.println(computers);
        } else {
            System.out.println("Компьютер не найден");
        }
    }
}
