package ru.minusd.gizatullina.lab30;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.*;

public class practice32 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MenuItem dish1 = new Dish("potato", "1 sht", 100);
        MenuItem dish2 = new Dish("pasta", "2 sht", 200);
        MenuItem dish3 = new Dish("cake", "3 sht", 300);
        MenuItem dish4 = new Dish("chicken", "4 sht", 400);
        MenuItem dish5 = new Dish("vegetables", "5 sht", 500);
        MenuItem drink1 = new Drink("coffee", "caramel", 143, DrinkTypeEnum.COFFEE, 0);
        MenuItem drink2 = new Drink("wine", "red", 123, DrinkTypeEnum.WINE, 12);
        MenuItem drink3 = new Drink("cola", "zero", 100, DrinkTypeEnum.COLA, 0);
        TableOrdersManager tm = new TableOrdersManager();
        TableOrder order1 = new TableOrder();
        TableOrder order2 = new TableOrder();
        order1.add(dish1);
        order1.add(dish2);
        order1.add(dish3);
        order1.add(dish4);
        order1.add(dish5);
        order2.add(drink1);
        order2.add(drink2);
        order2.add(drink3);
        tm.add(order1, 3);
        tm.add(order2, 5);

        InternetOrdersManager im = new InternetOrdersManager();
        Customer customer;
        String firstName = "Alsu";
        String lastName = "Gizatullina";
        int age = 19;
        String city = "Bakaly";
        String street = "Kirillovoy";
        int building = 5;
        int apartment = 7;
        int zipCode = 927465;
        char letter = 'V';
        Address address = new Address(city, street, building, apartment, zipCode, letter);
        customer = new Customer(firstName, lastName, address, age);
        InternetOrder io = new InternetOrder(customer);
        io.add(drink3);
        io.add(dish1);
        im.add(io);


        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(im);
        objectOutputStream.writeObject(tm);


        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        InternetOrdersManager internet = (InternetOrdersManager) objectInputStream.readObject();
        TableOrdersManager table = (TableOrdersManager) objectInputStream.readObject();
        System.out.println("table orders");
        table.getOrder(5).print();
        System.out.println();
        table.getOrder(3).print();
    }
}