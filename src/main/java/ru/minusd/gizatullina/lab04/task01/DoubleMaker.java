package ru.minusd.gizatullina.lab04.task01;

public class DoubleMaker {
    public static void main(String[] args) {
        var d1 = Double.valueOf("5.67");
        var d2 = Double.valueOf(5.67);
        var d3 = Double.parseDouble("5.67");
        var intd = d1.intValue();
        var longd = d1.longValue();
        var floatd = d1.floatValue();
        var strd = d1.toString();
        var byted = d1.byteValue();
        var shortd = d1.shortValue();
        var boold = d1.isNaN();
        var chard = (char)intd;
        System.out.println("To int: " + intd);
        System.out.println("To long: " + longd);
        System.out.println("To float: " + floatd);
        System.out.println("To string: " + strd);
        System.out.println("To byte: " + byted);
        System.out.println("To short: " + shortd);
        System.out.println("To boolean: " + boold);
        System.out.println("To char: " + chard);
        System.out.println(d1);
        String d = Double.toString(d1);
        System.out.println(d);
    }
}
