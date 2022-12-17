package ru.minusd.vasiliev.lab15.task02;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        var frame = new JFrame("Страны");
        var combo = new JComboBox<>(new String[] {"Россия", "США", "Китай", "Япония"});
        var name = new JLabel("Страна: -");
        var desc = new JLabel("Описание: -");
        var panel = new JPanel();
        var layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        panel.add(combo);
        panel.add(name);
        panel.add(desc);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setVisible(true);

        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var item = (String) combo.getSelectedItem();
                name.setText("Страна: " + item);
                switch (item) {
                    case "Россия":
                        desc.setText("Описание: Россия - страна в Европе и Азии.");
                        break;
                    case "США":
                        desc.setText("Описание: США - страна в Северной Америке.");
                        break;
                    case "Китай":
                        desc.setText("Описание: Китай - страна в Восточной Азии.");
                        break;
                    case "Япония":
                        desc.setText("Описание: Япония - страна в Восточной Азии.");
                        break;
                }
            }
        });

        combo.setSelectedIndex(0);
    }
}
