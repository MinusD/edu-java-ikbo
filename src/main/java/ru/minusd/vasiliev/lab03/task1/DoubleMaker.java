package ru.minusd.vasiliev.lab03.task1;

public class DoubleMaker {
    public static void main(String[] args) {
        var d1 = Double.valueOf("2.33");
        var d2 = Double.valueOf(2.33);
        var d3 = Double.parseDouble("2.33");
        var intd = d1.intValue();
        var longd = d1.longValue();
        var floatd = d1.floatValue();
        var strd = d1.toString();
        var byted = d1.byteValue();
        var shortd = d1.shortValue();
        var boold = d1.isNaN();
        var chard = (char)intd;
        System.out.println("Double to int: " + intd);
        System.out.println("Double to long: " + longd);
        System.out.println("Double to float: " + floatd);
        System.out.println("Double to string: " + strd);
        System.out.println("Double to byte: " + byted);
        System.out.println("Double to short: " + shortd);
        System.out.println("Double to boolean: " + boold);
        System.out.println("Double to char: " + chard);
        System.out.println(d1);
        String d = Double.toString(d1);
        System.out.println(d);
    }
}
