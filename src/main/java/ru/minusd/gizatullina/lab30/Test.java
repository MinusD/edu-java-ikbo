package ru.minusd.gizatullina.lab30;

public class Test {
    public static void main(String[] args) {
        TableOrdersManager orderManager = new TableOrdersManager();
        InternetOrdersManager orderManager2 = new InternetOrdersManager();

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
        Order order = new InternetOrder(customer);
        Order order1 = new TableOrder();
        Order order2 = new TableOrder();
        Order order3 = new InternetOrder(customer);
        order.add(new Drink("coffee", "0.2", 299, DrinkTypeEnum.COFFEE, 0));
        order1.add(new Drink("coffee", "0.2", 299, DrinkTypeEnum.COFFEE, 0));
        order2.add(new Drink("water", "0.5", 199, DrinkTypeEnum.WATER, 0));
        order3.add(new Drink("juice", "0.2", 299, DrinkTypeEnum.JUICE, 0));
        orderManager.add(order, 1);
        orderManager.add(order1, 2);
        orderManager2.add(order2);
        orderManager2.add(order3);
        System.out.println(orderManager.itemsQuantity("coffee"));
        System.out.println(orderManager2.itemsQuantity("water"));
        System.out.println(orderManager.ordersQuantity());
        System.out.println(orderManager2.ordersQuantity());
        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager2.ordersCostSummary());
        System.out.println(orderManager.remove(1));
        System.out.println(orderManager.ordersQuantity());
        System.out.println(orderManager2.ordersQuantity());
    }
}
