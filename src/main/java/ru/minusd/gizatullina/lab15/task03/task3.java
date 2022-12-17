package ru.minusd.gizatullina.lab15.task03;

import javax.swing.*;
import java.awt.*;

public class task3 extends JFrame {
    JButton btn1 = new JButton("button 1");
    JButton btn2 = new JButton("button 2");
    JTextField jta = new JTextField("this is area you can write text");
    JMenu menuFile = new JMenu("File");
    JMenu menuEdit = new JMenu("Edit");
    JMenu menuHelp = new JMenu("Help");
    JMenuBar m1 = new JMenuBar();
    JMenuItem save = new JMenuItem("save");
    JMenuItem exit = new JMenuItem("exit");
    JMenuBar m2 = new JMenuBar();
    JMenuItem copy = new JMenuItem("copy");
    JMenuItem cut = new JMenuItem("cut");
    JMenuItem paste = new JMenuItem("paste");
    JMenuBar m3 = new JMenuBar();
    task3(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(200, 120);
        add(btn1);
        add(btn2);
        add(jta);
        menuFile.add(save);
        menuFile.add(exit);
        menuEdit.add(copy);
        menuEdit.add(cut);
        menuEdit.add(paste);
        m1.add(menuFile);
        m1.add(menuEdit);
        m1.add(menuHelp);
        setJMenuBar(m1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new task3();
    }
}
