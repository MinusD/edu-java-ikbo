package ru.minusd.vasiliev.lab15.task01;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DivActionListener extends ActionListenerBase {
    public DivActionListener(JTextField field1, JTextField field2) {
        super(field1, field2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateNumbers();
        if (!numbersAreValid) {
            return;
        }
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Деление на ноль невозможно",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null,
                "Результат: " + (num1 / num2),
                "Результат",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
