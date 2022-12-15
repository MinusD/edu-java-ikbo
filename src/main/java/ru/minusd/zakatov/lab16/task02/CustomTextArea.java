package ru.minusd.zakatov.lab16.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CustomTextArea extends JFrame implements ActionListener {
    private String[] fonts = new String[]{
            "Times New Roman",
            "MS Sans Serif",
            "Courier New"
    };
    private String[] colors = new String[]{
            "Чёрный",
            "Красный",
            "Синий"
    };
    private int fontSize = 16;

    private JComboBox<String> colorComboBox;
    private JComboBox<String> fontComboBox;
    private JTextArea textArea;

    public CustomTextArea() throws HeadlessException {
        super("Text area");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel optionsPane = new JPanel();
        optionsPane.setLayout(new BoxLayout(optionsPane, BoxLayout.X_AXIS));
        optionsPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        colorComboBox = new JComboBox<>(colors);
        colorComboBox.addActionListener(this);
        fontComboBox = new JComboBox<>(fonts);
        fontComboBox.addActionListener(this);

        optionsPane.add(colorComboBox);
        optionsPane.add(fontComboBox);

        JPanel textAreaPane = new JPanel();
        textAreaPane.setLayout(new BoxLayout(textAreaPane, BoxLayout.Y_AXIS));
        textAreaPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(300, 100));
        textArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textArea.setFont(new Font(fonts[0], Font.PLAIN, fontSize));

        textAreaPane.add(textArea);

        add(optionsPane, BorderLayout.CENTER);
        add(textAreaPane, BorderLayout.PAGE_END);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomTextArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorComboBox) {
            Color color = switch ((String) Objects.requireNonNull(colorComboBox.getSelectedItem())) {
                case "Красный" -> Color.RED;
                case "Синий" -> Color.BLUE;
                default -> Color.BLACK;
            };
            textArea.setForeground(color);
        } else if (e.getSource() == fontComboBox) {
            textArea.setFont(new Font(
                    (String) fontComboBox.getSelectedItem(),
                    Font.PLAIN,
                    fontSize
            ));
        }
    }
}
