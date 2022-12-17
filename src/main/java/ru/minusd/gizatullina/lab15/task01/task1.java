package ru.minusd.gizatullina.lab15.task01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class task1 extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("+");
    JButton button1 = new JButton("-");
    JButton button2 = new JButton("/");
    JButton button3 = new JButton("*");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    task1() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new task1();
    }
}