package ru.minusd.gizatullina.lab12.task02;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No args");
            return;
        }
        Picture a = new Picture(args[0]);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        a.setVisible(true);
    }
}