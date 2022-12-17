package ru.minusd.gizatullina.lab16.task03;

import javax.swing.*;
import java.awt.*;

public class task3 extends JFrame {
    JLabel label1 = new JLabel("service");
    JLabel label2 = new JLabel("user name");
    JLabel label3 = new JLabel("password");
    JTextField field1 = new JTextField();
    JTextField field2 = new JTextField();
    JTextField field3 = new JTextField();

    task3(){
        super("Task 3");
        setLayout(null);
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1.setBounds(10, 10, 100, 20);
        label2.setBounds(10, 40, 100, 20);
        label3.setBounds(10, 70, 100, 20);
        field1.setBounds(120, 10, 100, 20);
        field2.setBounds(120, 40, 100, 20);
        field3.setBounds(120, 70, 100, 20);
        add(label1);
        add(label2);
        add(label3);
        add(field1);
        add(field2);
        add(field3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new task3();
    }
}