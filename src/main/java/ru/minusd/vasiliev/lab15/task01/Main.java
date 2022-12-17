package ru.minusd.vasiliev.lab15.task01;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CalcFrame calc = new CalcFrame();
        calc.pack();
        calc.setVisible(true);
        calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
