package ru.minusd.vasiliev.lab15.task01;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MulActionListener extends ActionListenerBase {
    public MulActionListener(JTextField field1, JTextField field2) {
        super(field1, field2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateNumbers();
        if (!numbersAreValid) {
            return;
        }
        JOptionPane.showMessageDialog(null,
                "Результат: " + (num1 * num2),
                "Результат",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
