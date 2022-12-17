package ru.minusd.gizatullina.lab16.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class task1 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (y < 100)
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в САО", "Alert", JOptionPane.INFORMATION_MESSAGE);
                else if (y < 200) {
                    if (x < 100)
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    else if (x < 200)
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "До свидания", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        };
        frame.addMouseListener(mouseListener);
        frame.setVisible(true);
    }
}