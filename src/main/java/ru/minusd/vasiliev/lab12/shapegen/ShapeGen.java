package ru.minusd.vasiliev.lab12.shapegen;

import javax.swing.*;

public class ShapeGen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Generator");
        frame.setSize(720, 360);
        var drawPanel = new DrawPanel();
        frame.add(drawPanel);
        frame.setVisible(true);
    }
}
