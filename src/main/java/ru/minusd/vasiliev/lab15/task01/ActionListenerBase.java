package ru.minusd.vasiliev.lab15.task01;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class ActionListenerBase implements ActionListener {
    private final JTextField field1;
    private final JTextField field2;

    protected double num1;
    protected double num2;
    protected boolean numbersAreValid;

    public ActionListenerBase(JTextField field1, JTextField field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    protected void updateNumbers() {
        try {
            num1 = Double.parseDouble(field1.getText().trim());
            num2 = Double.parseDouble(field2.getText().trim());
            numbersAreValid = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Неверный формат числа",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            numbersAreValid = false;
        }
    }

    public abstract void actionPerformed(java.awt.event.ActionEvent e);
}
