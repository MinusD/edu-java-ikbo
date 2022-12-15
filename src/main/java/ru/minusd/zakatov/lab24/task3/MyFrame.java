package ru.minusd.zakatov.lab24.task3;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private IDocument document;
    private ICreateDocument createDocument;
    private JLabel label;

    public MyFrame() throws HeadlessException {
        super("Redactor");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(300, 200));

        createDocument = new CreateTextDocument();
        label = new JLabel("Редактор");
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        newItem.addActionListener(e -> {
            document = createDocument.createNew();
            label.setText(String.format("File: %s, size: %d", document.getContent(), document.getSize()));
        });

        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(e -> {
            document = createDocument.createOpen("opened");
            label.setText(String.format("File: %s, size: %d", document.getContent(), document.getSize()));
        });

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(e -> {
            int status = document.save();

            if (document == null) return;
            JOptionPane.showMessageDialog(
                    null,
                    "File saved! Status: " + status,
                    "Saved!",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        JMenuItem exitExit = new JMenuItem("Exit");
        exitExit.addActionListener(e -> {
            System.exit(0);
        });

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitExit);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
