package ru.minusd.vasiliev.lab29;

import ru.minusd.vasiliev.lab29.task2.Dish;
import ru.minusd.vasiliev.lab29.task2.Item;
import ru.minusd.vasiliev.lab29.task6.InternetOrder;
import ru.minusd.vasiliev.lab29.task6.OrderAlreadyAddedException;
import ru.minusd.vasiliev.lab29.task6.OrderManager;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        var orderManager = new OrderManager();
        orderManager.add("100", new InternetOrder(new Item[]{
                new Dish("Burger", "mm borgar", 100),
                new Dish("Burger", "mm borgar", 100),
        }));
        System.out.println(Arrays.toString(Arrays.stream(orderManager.getOrders()).toArray()));
    }
}
