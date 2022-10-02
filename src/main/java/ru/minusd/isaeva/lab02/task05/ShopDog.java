package ru.minusd.isaeva.lab02.task05;

import java.util.Scanner;

public class ShopDog {
    int max = 10;
    int count = 0;
    Dog[] dogs = new Dog[max];

    public ShopDog(){}
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void addDod(String name, int age){
        Dog dog = new Dog(name,age);
        dogs[count] = dog;
        count++;
    }
    public static void main(String[] args) {
        ShopDog shop = new ShopDog();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество животных");
        int count = in.nextInt();
        String name;
        for (int i = 0; i < count; i++) {
            System.out.println("Введите кличку");
            name = in.next();
            System.out.println("Введите возраст");
            int age = in.nextInt();
            shop.addDod(name, age);
        }
        for (int i = 0; i < count; i++) {
            System.out.println(shop.getDogs()[i].getName() + " " + shop.getDogs()[i].getAge());
        }
        System.out.println(shop.getDogs()[0].humanAge());
    }
}
