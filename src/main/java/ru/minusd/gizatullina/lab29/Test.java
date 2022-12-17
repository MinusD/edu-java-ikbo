package ru.minusd.gizatullina.lab29;

public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        Order order = new InternetOrder();
        order.add(new Drink("Coffee", "Coffee", 100));
        Order order2 = new InternetOrder();
        order2.add(new Drink("Wine", "Wine", 200));
        Order order3 = new InternetOrder();
        order3.add(new Dish("Pasta", "Pasta", 500));
        orderManager.add("Nanilo", order);
        orderManager.add("Lenta", order2);
        orderManager.add("Belini", order3);
        System.out.println("Number of dish of pasta:");
        System.out.println(orderManager.sameDishQuantity("Pasta"));
        order2.add(new Dish("Pasta", "Pasta", -100));
        orderManager.add("Lenta", order2);
    }
}
