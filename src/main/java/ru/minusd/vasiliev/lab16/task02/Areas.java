package ru.minusd.vasiliev.lab16.task02;

import javax.swing.*;
import javax.swing.border.StrokeBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Areas extends JFrame {
    public Areas() {
        super("Автономные округа");
        setLayout(new BorderLayout());
        var northPanel = new JPanel();
        var southPanel = new JPanel();
        var eastPanel = new JPanel();
        var westPanel = new JPanel();
        var centerPanel = new JPanel();
        northPanel.add(new JLabel("САО"));
        southPanel.add(new JLabel("ЮАО"));
        eastPanel.add(new JLabel("ВАО"));
        westPanel.add(new JLabel("ЗАО"));
        centerPanel.add(new JLabel("ЦАО"));
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
        for (var panel : new JPanel[]{northPanel, southPanel, eastPanel, westPanel, centerPanel}) {
            panel.setBorder(new StrokeBorder(new BasicStroke(2)));
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    showDialog(((JLabel)((JPanel) e.getSource()).getComponent(0)).getText());
                }
            });
        }
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
    }

    void showDialog(String district) {
        JOptionPane.showMessageDialog(null,
                "Добро пожаловать в " + district,
                "Выбор округа",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
