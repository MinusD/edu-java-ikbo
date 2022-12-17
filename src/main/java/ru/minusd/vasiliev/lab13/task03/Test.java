package ru.minusd.vasiliev.lab13.task03;

public class Test {
    public static void main(String[] args) {
        var address = new Address();
        address.setAddressOnlyComma("Россия, Московская область, Москва, проспект Вернадского, 1, 2, 3");
        System.out.println(address);
        address.setAddress("Российская федерация. Оренбургская область. Оренбург. улица Ленина. 1, 2, 3");
        System.out.println(address);
        address.setAddressOnlyComma("США, Какой-то штат, Какой-то город, Какая-то улица, 5, 2, 1");
        System.out.println(address);
        address.setAddress("Китай; Регион 12919; Пекин. улица 1941249. 555. 1515, 2414141");
        System.out.println(address);
    }
}