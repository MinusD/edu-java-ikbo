package ru.minusd.vasiliev.lab16.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private int attempts = 3;
    private int number = (int) (Math.random() * 20);
    private JTextField textField = new JTextField();
    private JLabel label = new JLabel("Угадайте число от 0 до 20. У вас осталось " + attempts + " попытки");
    private JButton button = new JButton("Проверить");

    public Game() {
        super("Game");
        var panel = new JPanel(new GridLayout(3, 1));
        textField.setPreferredSize(new Dimension(100, 20));
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(textField.getText());
                if (input == number) {
                    JOptionPane.showMessageDialog(null,
                            "Вы угадали!",
                            "Победа",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else if (input > number) {
                    label.setText("Загаданное число меньше. У вас осталось " + --attempts + " попытки");
                } else {
                    label.setText("Загаданное число больше. У вас осталось " + --attempts + " попытки");
                }
                if (attempts == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Вы проиграли. Загаданное число: " + number,
                            "Игра окончена",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        });
        add(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 150);
        setResizable(false);
        setVisible(true);
    }
}
