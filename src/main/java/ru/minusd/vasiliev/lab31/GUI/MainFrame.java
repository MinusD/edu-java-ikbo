package ru.minusd.vasiliev.lab31.GUI;

import ru.minusd.vasiliev.lab31.classes.Address;
import ru.minusd.vasiliev.lab31.classes.Customer;
import ru.minusd.vasiliev.lab31.classes.managers.TableOrdersManager;
import ru.minusd.vasiliev.lab31.classes.orders.TableOrder;
import ru.minusd.vasiliev.lab31.interfaces.OrderListener;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainFrame extends JFrame implements OrderListener {
    private final JPanel mainPanel = new JPanel();
    private final JPanel ordersPanel = new JPanel();

    private final TableOrdersManager manager = new TableOrdersManager(10);

    public MainFrame() {
        super("Ресторан");
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        ordersPanel.setLayout(new BoxLayout(ordersPanel, BoxLayout.X_AXIS));

        JPanel buttonsPanel = new JPanel();
        JButton addOrderButton = new JButton("Добавить заказ");
        JButton loadOrdersButton = new JButton("Загрузить заказ из файла");
        buttonsPanel.add(addOrderButton);
        buttonsPanel.add(loadOrdersButton);
        mainPanel.add(buttonsPanel);
        mainPanel.add(ordersPanel);

        addOrderButton.addActionListener((e) -> {
            addNewOrder();
            setVisible(false);
            setVisible(true);
        });

        loadOrdersButton.addActionListener((e) -> {
            loadOrderFromFile();
            setVisible(false);
            setVisible(true);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(mainPanel);
        setVisible(true);
    }

    private void addNewOrder() {
        var age = JOptionPane.showInputDialog("Введите возраст клиента");
        if (age == null) {
            return;
        }
        Customer customer = new Customer(JOptionPane.showInputDialog("Введите имя клиента"),
                JOptionPane.showInputDialog("Введите фамилию клиента"),
                Integer.parseInt(JOptionPane.showInputDialog("Введите возраст клиента")),
                Address.EMPTY_ADDRESS);
        TableOrder order = new TableOrder(10, customer);
        var strTableNumber = JOptionPane.showInputDialog("Введите номер столика");
        if (strTableNumber == null) {
            return;
        }
        var tableNumber = Integer.parseInt(strTableNumber) - 1;
        if (tableNumber > 10) {
            JOptionPane.showMessageDialog(null, "Номер столика не может быть больше 10");
            return;
        }
        for (var number: manager.freeTableNumbers()) {
            if (number == tableNumber) {
                addOrder(order, tableNumber);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Столик уже занят!");
    }

    private void addOrder(TableOrder order, int tableNumber) {
        manager.add(order, tableNumber);
        var orderPanel = new OrderPanel(order, tableNumber);
        ordersPanel.add(orderPanel);
        orderPanel.addRemoveListener(this);
    }

    private void loadOrderFromFile() {
        var filePicker = new JFileChooser();
        filePicker.setCurrentDirectory(new java.io.File("."));
        filePicker.setDialogTitle("Выберите файл");
        filePicker.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (filePicker.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            var file = filePicker.getSelectedFile();
            var order = TableOrder.fromFile(file.toPath());
            var fileName = file.getName().split("\\.")[0];
            var orderNumber = Integer.parseInt(fileName.charAt(fileName.length() - 1) + "");
            addOrder(order, orderNumber);
        }
    }

    @Override
    public void onOrderRemoved(OrderPanel panel) {
        ordersPanel.remove(panel);
        manager.remove(panel.getOrder());
        setVisible(false);
        setVisible(true);
    }
}
