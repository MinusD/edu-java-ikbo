package ru.minusd.vasiliev.lab22.task1task2;

public class Test {
    public static void main(String[] args) {
        var calc = new CalcStack();
        System.out.println(calc.calculate("2 3 +"));
        System.out.println(calc.calculate("2 3 * 4 5 * +"));
        System.out.println(calc.calculate("2 3 4 5 6 * + - /"));

        var calcGUI = new CalculatorGUI();
    }
}
