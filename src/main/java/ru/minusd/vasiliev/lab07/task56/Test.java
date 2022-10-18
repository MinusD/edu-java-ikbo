package ru.minusd.vasiliev.lab07.task56;

public class Test {
    public static void main(String[] args) {
        StringManip process = new ProcessStrings("TestingStringExample");
        System.out.println(process.count());
        System.out.println(process.oddString());
        System.out.println(process.revert());
    }
}
