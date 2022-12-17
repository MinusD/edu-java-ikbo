package ru.minusd.vasiliev.lab30.GUI;

import ru.minusd.vasiliev.lab30.classes.Address;
import ru.minusd.vasiliev.lab30.classes.Customer;
import ru.minusd.vasiliev.lab30.classes.managers.TableOrdersManager;
import ru.minusd.vasiliev.lab30.classes.orders.TableOrder;
import ru.minusd.vasiliev.lab30.interfaces.OrderListener;

import javax.swing.*;

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
        buttonsPanel.add(addOrderButton);
        mainPanel.add(buttonsPanel);
        mainPanel.add(ordersPanel);

        addOrderButton.addActionListener((e) -> {
            addNewOrder();
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
        Customer customer = new Customer(JOptionPane.showInputDialog("Введите имя клиента"),
                JOptionPane.showInputDialog("Введите фамилию клиента"),
                Integer.parseInt(JOptionPane.showInputDialog("Введите возраст клиента")),
                Address.EMPTY_ADDRESS);
        TableOrder order = new TableOrder(10, customer);
        var tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Введите номер столика"));
        if (tableNumber > 10) {
            JOptionPane.showMessageDialog(null, "Номер столика не может быть больше 10");
            return;
        }
        for (var number: manager.freeTableNumbers()) {
            if (number == tableNumber) {
                manager.add(order, tableNumber);
                var orderPanel = new OrderPanel(order, number);
                ordersPanel.add(orderPanel);
                orderPanel.addRemoveListener(this);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Столик уже занят!");
    }

    @Override
    public void onOrderRemoved(OrderPanel panel) {
        ordersPanel.remove(panel);
        manager.remove(panel.getOrder());
        setVisible(false);
        setVisible(true);
    }
}
