package ru.minusd.vasiliev.lab16.task03;

import javax.swing.*;
import java.awt.*;

public class TextAppearanceEditor extends JFrame {
    private class NamedColor {
        private final String name;
        private final Color color;

        public NamedColor(String name, Color color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return name;
        }

        public Color getColor() {
            return color;
        }
    }

    public TextAppearanceEditor() {
        super("Редактор внешнего вида текста");
        var colorCombo = new JComboBox<NamedColor>(new NamedColor[] {
                new NamedColor("Чёрный", Color.BLACK),
                new NamedColor("Красный", Color.RED),
                new NamedColor("Синий", Color.BLUE),
        });
        var fontCombo = new JComboBox<String>(new String[] {"Times New Roman", "MS Sans Serif", "Courier New"});
        var textArea = new JTextArea();
        var colorLabel = new JLabel("Цвет");
        var fontLabel = new JLabel("Шрифт");
        var panel = new JPanel();
        panel.add(colorLabel);
        panel.add(colorCombo);
        panel.add(fontLabel);
        panel.add(fontCombo);
        colorCombo.setSelectedIndex(0);
        fontCombo.setSelectedIndex(0);
        add(panel, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        colorCombo.addActionListener(e -> {
            textArea.setForeground(((NamedColor)colorCombo.getSelectedItem()).getColor());
        });
        fontCombo.addActionListener(e -> {
            textArea.setFont(new Font((String) fontCombo.getSelectedItem(), Font.PLAIN, 12));
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
    }
}
