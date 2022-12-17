package ru.minusd.vasiliev.lab16.task04;

import javax.swing.*;
import java.awt.*;

public class PasswordCheck extends JFrame {
    public PasswordCheck() {
        super("Проверка пароля");
        setLayout(new GridBagLayout());
        var c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        add(new JLabel("Сервис: "), c);
        var serviceField = new JTextField();
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(serviceField, c);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        add(new JLabel("Логин: "), c);
        var loginField = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 3;
        c.weightx = 1;
        add(loginField, c);
        c.fill = GridBagConstraints.NONE;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0;
        add(new JLabel("Пароль: "), c);
        var passwordField = new JTextField();
        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridwidth = 3;
        add(passwordField, c);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 4;
        var checkButton = new JButton("Вход");
        add(checkButton, c);
        checkButton.addActionListener(e -> {
            if (serviceField.getText().equals("mirea") && loginField.getText().equals("root") && passwordField.getText().equals("root")) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать!",
                        "Успешный вход",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Неверный логин или пароль",
                        "Ошибка",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 150);
        setResizable(false);
        setVisible(true);
    }
}
