package ru.minusd.gizatullina.lab16.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame {
    JTextArea jta = new JTextArea("Alsu Gizatullina");
    JMenu menuFile = new JMenu("color");
    JMenu menuEdit = new JMenu("font");
    JMenuBar m1 = new JMenuBar();
    JMenuItem blue = new JMenuItem("blue");
    JMenuItem red = new JMenuItem("red");
    JMenuItem black = new JMenuItem("black");
    JMenuItem tnr = new JMenuItem("times new roman");
    JMenuItem sans = new JMenuItem("ms sans serif");
    JMenuItem courier = new JMenuItem("courier new");
    task2(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(200, 120);
        jta.setEditable(false);
        add(jta);
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLACK);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.RED);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLUE);
            }
        });
        tnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("Times New Roman", Font.BOLD, 12));
            }
        });
        sans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("MS Sans Serif", Font.BOLD, 12));
            }
        });
        courier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("Courier New", Font.BOLD, 12));
            }
        });
        menuFile.add(black);
        menuFile.add(blue);
        menuFile.add(red);
        menuEdit.add(sans);
        menuEdit.add(tnr);
        menuEdit.add(courier);
        m1.add(menuFile);
        m1.add(menuEdit);
        setJMenuBar(m1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new task2();
    }
}