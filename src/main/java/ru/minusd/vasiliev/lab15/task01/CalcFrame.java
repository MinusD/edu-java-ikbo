package ru.minusd.vasiliev.lab15.task01;

import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {
    private JTextField num1 = new JTextField(10);
    private JTextField num2 = new JTextField(10);
    private JButton sum = new JButton("+");
    private JButton sub = new JButton("-");
    private JButton mul = new JButton("*");
    private JButton div = new JButton("/");

    public CalcFrame() {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(300, 700);
        add(new JLabel("Первое число:"));
        add(num1);
        add(new JLabel("Второе число:"));
        add(num2);
        for (var button: new JButton[] {sum, sub, mul, div}) {
            add(button);
        }
        sum.addActionListener(new SumActionListener(num1, num2));
        div.addActionListener(new DivActionListener(num1, num2));
        mul.addActionListener(new MulActionListener(num1, num2));
        sub.addActionListener(new SubActionListener(num1, num2));
    }
}
