package ru.minusd.zakatov.lab15.task02;

import javax.swing.*;
import java.awt.*;

public class Options extends JFrame {
    String[] countries = new String[] {
            "Australia",
            "Russia",
            "China",
            "England",
            "USA"
    };
    String[] countriesPopulation = new String[] {
            "25m",
            "143m",
            "1400m",
            "69m",
            "330m",
    };
    JComboBox<String> comboBox = new JComboBox<>(countries);
    JLabel label = new JLabel("Population: " + countriesPopulation[0]);

    public Options() {
        super("Options");
        setLayout(new FlowLayout());
        setSize(200, 200);

        comboBox.setSelectedIndex(0);
        comboBox.addActionListener(e -> {
            String population = countriesPopulation[comboBox.getSelectedIndex()];
            label.setText("Population: " + population);
        });

        add(comboBox);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Options();
    }
}
