package ru.minusd.vasiliev.lab07.task4;

public class Test {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        MathFunc mf = new MathFunc();
        System.out.println(mc.getPI());
        System.out.println(mc.pow(2, 4));
        System.out.println(mc.complexAbs(3, 4));
        // System.out.println(mc.circleLength(3)); не сработает, т.к. mc объявлен как интерфейс MathCalculable, у которого нет метода circleLength
        System.out.println(mf.circleLength(5));
    }
}
