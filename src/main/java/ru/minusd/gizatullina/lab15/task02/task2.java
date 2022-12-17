package ru.minusd.gizatullina.lab15.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame {
    String[] items = {
            "Australia",
            "China",
            "England",
            "Russia"
    };
    task2() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String) box.getSelectedItem();
                switch (item) {
                    case "Australia":
                        JOptionPane.showMessageDialog(null, "Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "China":
                        JOptionPane.showMessageDialog(null, "China, officially the People's Republic of China (PRC), is a country in East Asia. It is the world's most populous country with a population exceeding 1.4 ", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "England":
                        JOptionPane.showMessageDialog(null, "England is a country that is part of the United Kingdom. ... It shares land borders with Wales to its west and Scotland to its north.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Russia":
                        JOptionPane.showMessageDialog(null, "Rossiya, pronounced, or the Russian Federation, is a transcontinental country spanning Eastern Europe and Northern Asia. It is the largest country", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(actionListener);
        add(comboBox);
        setVisible(true);
    }

    public static void main(String[] args) {
        new task2();
    }
}