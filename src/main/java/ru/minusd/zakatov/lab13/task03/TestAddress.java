package ru.minusd.zakatov.lab13.task03;

public class TestAddress {
    public static void main(String[] args) {
        Address a1 = new Address("Россия, Москва, Москва, проспект Вернадского, дом 78, 1, 1");
        Address a2 = new Address("США, округ Колумбия, Вашингтон, Пенсильвания-авеню, 1600, 1, 1");
        Address a3 = new Address("Россия; Москва; Москва; Краснопресненская наб.; 2; 0; 0", ";");

        System.out.println("1st: " + a1);
        System.out.println("2nd: " + a2);
        System.out.println("3rd: " + a3);
    }
}
