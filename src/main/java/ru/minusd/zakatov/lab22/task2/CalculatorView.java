package ru.minusd.zakatov.lab22.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class CalculatorView extends JFrame {
    private JTextField inputField;
    private List<JButton> numButtons = new ArrayList<>();
    private List<JButton> operationButtons = new ArrayList<>();
    private JButton equalButton;
    private JButton dotButton;
    private CalculatorController controller;

    public CalculatorView() throws HeadlessException {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        inputField = new JTextField();
        inputField.setBorder(BorderFactory.createLineBorder(Color.black));
        inputField.setFont(new Font("Verdana", Font.PLAIN, 16));
        inputField.setPreferredSize(new Dimension(250, 50));

        initButtons();

        JPanel inputPane = new JPanel();
        inputPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inputPane.setLayout(new BoxLayout(inputPane, BoxLayout.Y_AXIS));
        inputPane.add(inputField);

        JPanel gridPane = new JPanel();
        gridPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gridPane.setLayout(new GridLayout(4, 4));

        gridPane.add(numButtons.get(7));
        gridPane.add(numButtons.get(8));
        gridPane.add(numButtons.get(9));
        gridPane.add(operationButtons.get(0));
        gridPane.add(numButtons.get(4));
        gridPane.add(numButtons.get(5));
        gridPane.add(numButtons.get(6));
        gridPane.add(operationButtons.get(1));
        gridPane.add(numButtons.get(1));
        gridPane.add(numButtons.get(2));
        gridPane.add(numButtons.get(3));
        gridPane.add(operationButtons.get(2));
        gridPane.add(numButtons.get(0));
        gridPane.add(dotButton);
        gridPane.add(equalButton);
        gridPane.add(operationButtons.get(3));

        add(inputPane, BorderLayout.PAGE_START);
        add(gridPane, BorderLayout.PAGE_END);

        pack();
        setVisible(true);
    }

    private void initButtons() {
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(this::onBtnClick);
            numButtons.add(btn);
        }

        operationButtons.add(new JButton("/"));
        operationButtons.add(new JButton("*"));
        operationButtons.add(new JButton("-"));
        operationButtons.add(new JButton("+"));

        for (var btn : operationButtons) {
            btn.addActionListener(this::onBtnClick);
        }

        dotButton = new JButton(".");
        equalButton = new JButton("=");

        dotButton.addActionListener(this::onBtnClick);
        equalButton.addActionListener(this::onBtnClick);
    }

    private void onBtnClick(ActionEvent actionEvent) {
        JButton btn = (JButton) actionEvent.getSource();

        if (btn == equalButton) {
            controller.calculate();
        } else if (operationButtons.contains(btn)) {
            controller.updateModel(" " + btn.getText() + " ");
        } else {
            controller.updateModel(btn.getText());
        }
    }

    public void updateView(String text) {
        inputField.setText(text);
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;
    }
}
