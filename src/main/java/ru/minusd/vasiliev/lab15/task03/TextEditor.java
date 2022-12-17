package ru.minusd.vasiliev.lab15.task03;

import javax.swing.*;
import java.awt.*;

public class TextEditor {
    public static void main(String[] args) {
        var frame = new JFrame("Текстовый редактор");
        frame.setLayout(new GridLayout(2, 1));
        var menuBar = new JMenuBar();
        var fileMenu = new JMenu("Файл");
        var editMenu = new JMenu("Правка");
        var helpMenu = new JMenu("Справка");
        var newMenuItem = new JMenuItem("Новый");
        var openMenuItem = new JMenuItem("Открыть");
        var saveMenuItem = new JMenuItem("Сохранить");
        var exitMenuItem = new JMenuItem("Выход");
        var copyMenuItem = new JMenuItem("Копировать");
        var pasteMenuItem = new JMenuItem("Вставить");
        var aboutMenuItem = new JMenuItem("О программе");
        var textArea = new JTextArea();
        var panel = new JPanel();

        var button1 = new JButton("Кнопка 1");
        var button2 = new JButton("Кнопка 2");
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.add(textArea);

        for (var item: new JMenu[] {fileMenu, editMenu, helpMenu}) {
            menuBar.add(item);
        }
        for (var item: new JMenuItem[] {newMenuItem, openMenuItem, saveMenuItem, exitMenuItem}) {
            fileMenu.add(item);
        }
        for (var item: new JMenuItem[] {copyMenuItem, pasteMenuItem}) {
            editMenu.add(item);
        }
        helpMenu.add(aboutMenuItem);
        frame.setJMenuBar(menuBar);

        frame.setSize(700, 200);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
