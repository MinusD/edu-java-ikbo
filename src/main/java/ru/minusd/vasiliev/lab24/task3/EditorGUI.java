package ru.minusd.vasiliev.lab24.task3;

import ru.minusd.vasiliev.lab24.task3.createDocument.CreateTextDocument;
import ru.minusd.vasiliev.lab24.task3.createDocument.ICreateDocument;
import ru.minusd.vasiliev.lab24.task3.documents.IDocument;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class EditorGUI {
    private static final JFileChooser fileChooser = new JFileChooser();
    private static final JMenuBar menuBar = new JMenuBar();
    private static final JMenu fileMenu = new JMenu("File");
    private static final JMenuItem newMenuItem = new JMenuItem("New");
    private static final JMenuItem openMenuItem = new JMenuItem("Open");
    private static final JMenuItem saveMenuItem = new JMenuItem("Save");
    private static final JMenuItem exitMenuItem = new JMenuItem("Exit");
    private static final JTextArea textArea = new JTextArea();
    private static final JFrame frame = new JFrame("Текстовый редактор");

    private static File file;
    private static IDocument document;
    private static ICreateDocument createDocument;

    public static void main(String[] args) {
        createDocument = new CreateTextDocument();
        frame.add(textArea);

        frame.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        exitMenuItem.addActionListener(e -> System.exit(0));

        newMenuItem.addActionListener(e -> {
            handleDocument(true);
        });

        openMenuItem.addActionListener(e -> {
            if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                handleDocument(false);
            }
        });

        saveMenuItem.addActionListener(e -> {
            if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                try {
                    Files.write(file.toPath(), getData().getBytes());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Ошибка сохранения файла");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static String getData() {
        return textArea.getText();
    }

    private static void handleDocument(boolean isNew) {
        if (isNew) {
            document = createDocument.createNew();
            textArea.setText("");
            frame.setTitle(document.getDocumentName());
        } else {
            try {
                document = createDocument.createOpen(file.getAbsolutePath());
                textArea.setText((String) document.getDocumentData());
                frame.setTitle(document.getDocumentName());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ошибка открытия файла");
            }
        }
    }
}
