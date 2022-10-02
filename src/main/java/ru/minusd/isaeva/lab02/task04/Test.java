package ru.minusd.isaeva.lab02.task04;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество разлизных ПК");
        int count = in.nextInt();
        String company, model;
        for (int i = 0; i < count; i++) {
            System.out.println("Введите производителя");
            company = in.next();
            System.out.println("Введите модель");
            model = in.next();
            shop.addPC(company, model);
        }
        shop.print();
        System.out.println("Введите производителя ПК для удаления");
        company = in.next();
        System.out.println("Введите модель ПК для удаления");
        model = in.next();
        if (shop.findPC(company, model) < 0){
            System.out.println("Не найден");
        }
        else{
            shop.deletePC(shop.findPC(company, model));
            System.out.println("Удален");
        }


        shop.print();
    }
}
