package ru.minusd.denisov.lab06.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop computerShop = new Shop(new ArrayList<>());

        // Тестовый компьютер
        computerShop.addComputer(
                new Computer(
                        ComputerBrand.ASUS,
                        "ROG_Test",
                        new Processor("i9-12900K", 16, 5.2, 10000),
                        new Memory("Kingston", 8, 5000),
                        new Monitor("Samsung", 14, 1000)));

        System.out.println("Возможные бренды компьютера: " + Arrays.toString(ComputerBrand.values()));
        int cmd = 1;
        while (cmd != 0) {
            System.out.println("\n1. Добавить компьютер\t2. Удалить компьютер\t3. Найти компьютер\t0. Выход");
            System.out.print("Введите команду: ");
            cmd = scanner.nextInt();
            switch (cmd) {
                case 1:
                    System.out.print("Введите бренд компьютера и его название: ");
                    ComputerBrand brand = ComputerBrand.valueOf(scanner.next());
                    String name = scanner.next();

                    System.out.print("Введите название процессора, количество ядер, частоту и цену: ");
                    Processor processor = new Processor(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

                    System.out.print("Введите название монитора, диагональ и цену: ");
                    Monitor monitor = new Monitor(scanner.next(), scanner.nextInt(), scanner.nextInt());

                    System.out.print("Введите название ОЗУ, объем и цену: ");
                    Memory memory = new Memory(scanner.next(), scanner.nextInt(), scanner.nextInt());

                    computerShop.addComputer(new Computer(brand, name, processor, memory, monitor));
                    System.out.println("Компьютер добавлен");
                    break;
                case 2:
                    System.out.print("Введите название компьютера: ");
                    name = scanner.next();
                    if (computerShop.deleteComputer(name)) {
                        System.out.println("Компьютер был успешно удален.");
                    } else {
                        System.out.println("Такого компьютера не было.");
                    }
                    break;
                case 3:
                    System.out.print("Введите название компьютера (без бренда): ");
                    name = scanner.next();
                    Computer requiredComputer = computerShop.findComputer(name);
                    if (requiredComputer != null) {
                        requiredComputer.print();
                    } else {
                        System.out.println("Компьютер не найден");
                    }
                    break;
            }
        }
    }
}