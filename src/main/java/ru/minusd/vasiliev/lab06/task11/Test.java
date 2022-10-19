package ru.minusd.vasiliev.lab06.task11;

public class Test {
    public static void main(String[] args) {
        var temp = new Temperature(-40);
        System.out.println(temp.getTemperature());
        temp.convert();
        System.out.println(temp.getTemperature());
        temp.convert();
        System.out.println(temp.getTemperature());
    }
}
