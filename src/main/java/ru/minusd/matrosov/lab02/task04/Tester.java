package lab02.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void print(ArrayList<Computer> list) {
        for (Computer comp : list) {
            System.out.print(comp.getName() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество компьютеров в магазине: ");
        int l = scanner.nextInt();
        ArrayList<Computer> list = new ArrayList<>(l);
        System.out.println("Создан массив компьютеров");
        Shop shop = new Shop(l, list);
        System.out.println("Создан новый магазин с введенным количеством компьтеров");

        for (Integer i = 1; i < l+1; i++) {
            list.add(new Computer(i.toString()));
        }
        System.out.println("Массив компьютеров заполнен новыми компами");
        print(list);

        System.out.print("Введите имя компьютера, который вы ходите добавить: ");
        String nameCompForAddition = scanner.next();
        shop.addPC(list, new Computer(nameCompForAddition));
        print(list);

        System.out.print("Введите имя компьютера, который вы ходите удалить: ");
        String nameCompForDel = scanner.next();
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(nameCompForDel)) {
                shop.delPC(list, list.get(i));
                System.out.println("Удаление выполенено");
                flag = false;
                print(list);
                break;
            }
        }
        if (flag) {
            System.out.println("Не найден элемент с заданным именем");
        }
        flag = true;
        System.out.print("Введите имя компьютера, который вы ходите найти: ");
        String nameCompForFind = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(nameCompForFind)) {
                System.out.println("Компьютер найден (его позиция в масииве - " + i + ")");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Компьютер не найден( ");
        }


    }


}
