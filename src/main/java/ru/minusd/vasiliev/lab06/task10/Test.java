package ru.minusd.vasiliev.lab06.task10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");
        var count = scanner.nextInt();
        var shop = new Shop();
        for (int i = 0; i < count; i++) {
            System.out.printf("%d-й компьютер\n", i+1);
            addComputerFromKeyboard(scanner, shop);
        }
        while (true) {
            System.out.println("Введите номер команды:\n1.Добавить компьютер\n2.Удалить компьютер\n3.Найти компьютер по названию\n0.Выйти\n");
            var choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    addComputerFromKeyboard(scanner, shop);
                    break;
                case 2:
                    System.out.print("Введите название удаляемого компьютера: ");
                    shop.removeComputer(scanner.next());
                    break;
                case 3:
                    System.out.print("Введите название компьютера: ");
                    System.out.println(shop.getComputer(scanner.next()));
            }
        }
    }

    private static void addComputerFromKeyboard(Scanner scanner, Shop shop) {
        System.out.print("Введите цену, название и частоту оперативной памяти: ");
        var memory = new Memory(scanner.nextInt(), scanner.next(), scanner.nextInt());
        System.out.print("Введите цену, название и частоту процессора: ");
        var processor = new Processor(scanner.nextInt(), scanner.next(), scanner.nextInt());
        System.out.print("Введите цену, название, ширину и высоту монитора: ");
        var monitor = new Monitor(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt());
        System.out.print("Введите марку компьютера (MSI, Lenovo, Acer, Asus, Huawei): ");
        var manufacturer = Manufacturer.valueOf(scanner.next());
        System.out.println("Введите название компьютера: ");
        shop.addComputer(new Computer(
                manufacturer,
                memory,
                monitor,
                processor,
                scanner.next()
        ));
    }
}
