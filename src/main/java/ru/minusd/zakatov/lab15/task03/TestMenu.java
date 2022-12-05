package ru.minusd.zakatov.lab15.task03;

import javax.swing.*;
import java.awt.*;

public class TestMenu extends JFrame {
    public TestMenu() {
        super("System Menu");
        setLayout(new FlowLayout());
        setSize(400, 200);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(new JMenu("Help"));

        setJMenuBar(menuBar);
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));

        setVisible(true);
    }

    private JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Edit");

        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem put = new JMenuItem("Put");

        editMenu.add(copy);
        editMenu.add(cut);
        editMenu.add(put);

        copy.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "The file has copied!",
                    "Copied",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        cut.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "The file has cut!",
                    "Cut",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        put.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "The file has put!",
                    "Put",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        return editMenu;
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");

        JMenuItem save = new JMenuItem("Save");
        JMenuItem close = new JMenuItem("Close");

        fileMenu.add(save);
        fileMenu.add(close);

        close.addActionListener(e -> System.exit(0));
        save.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "The file has saved!",
                    "Saved",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        return fileMenu;
    }

    public static void main(String[] args) {
        new TestMenu();
    }
}
