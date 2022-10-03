package ru.minusd.zakatov.lab02.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer(1, "ASUS"));

        Shop shop = new Shop(computers);

        System.out.println("Начальное состояние: ");
        System.out.println(shop);

        System.out.print("\nВведите name: ");
        String name = in.nextLine();
        shop.add(new Computer(4, name));
        System.out.println("Магазин: " + shop);

        System.out.print("\nВведите id: ");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Компьютер: " + shop.get(id));

        System.out.print("\nВведите name: ");
        name = in.nextLine();
        System.out.println("Компьютер: " + shop.get(name));


        System.out.print("\nВведите id: ");
        id = in.nextInt();
        System.out.println("Удаляем");
        shop.remove(id);
        System.out.println("Магазин: " + shop);
    }
}
