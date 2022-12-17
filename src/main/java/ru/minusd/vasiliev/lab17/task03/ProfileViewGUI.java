package ru.minusd.vasiliev.lab17.task03;

import javax.swing.*;
import java.awt.*;

public class ProfileViewGUI {
    private JLabel nameLabel = new JLabel("Имя: ");
    private JLabel surnameLabel = new JLabel("Фамилия: ");
    private JLabel emailLabel = new JLabel("Почта: ");
    private JLabel phoneLabel = new JLabel("Телефон: ");

    private JTextField nameField = new JTextField(10);
    private JTextField surnameField = new JTextField(10);
    private JTextField emailField = new JTextField(10);
    private JTextField phoneField = new JTextField(10);

    private JButton saveButton = new JButton("Сохранить");

    private JPanel mainPanel = new JPanel(new GridLayout(5, 2));

    public ProfileViewGUI() {
        JFrame frame = new JFrame("Профиль");
        frame.setContentPane(mainPanel);
        for (var c : new Component[] {nameLabel, nameField, surnameLabel, surnameField, emailLabel, emailField, phoneLabel, phoneField, saveButton}) {
            frame.add(c);
        }
        saveButton.addActionListener(e -> {
            ProfileController controller = new ProfileController(new ProfileModel(), this);
            controller.setProfileName(nameField.getText());
            controller.setProfileSurname(surnameField.getText());
            controller.setProfileEmail(emailField.getText());
            controller.setProfilePhone(phoneField.getText());
            controller.updateView();
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateView(String name, String surname, String email, String phone) {
        nameLabel.setText("Имя: " + name);
        surnameLabel.setText("Фамилия: " + surname);
        emailLabel.setText("Почта: " + email);
        phoneLabel.setText("Телефон: " + phone);
    }

}
