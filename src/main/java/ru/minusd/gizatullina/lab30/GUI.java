package ru.minusd.gizatullina.lab30;

import javax.swing.*;
import java.util.Arrays;

public class GUI extends JFrame {
    private JButton addOrderButton;
    private JButton addMenuItemButton;
    private JButton removeMenuItemButton;
    private JButton removeOrderButton;
    private JLabel[] orderLabels = new JLabel[]{new JLabel("Order 1"), new JLabel("Order 2"), new JLabel("Order 3"), new JLabel("Order 4"), new JLabel("Order 5"), new JLabel("Order 6"), new JLabel("Order 7"), new JLabel("Order 8"), new JLabel("Order 9"), new JLabel("Order 10")};
    private TableOrdersManager tableOrdersManager = new TableOrdersManager();
    public GUI(){
        addOrderButton = new JButton("Add order");
        addMenuItemButton = new JButton("Add menu item");
        removeMenuItemButton = new JButton("Remove menu item");
        removeOrderButton = new JButton("Remove order");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(addOrderButton);
        add(addMenuItemButton);
        add(removeMenuItemButton);
        add(removeOrderButton);
        add(orderLabels[0]);
        add(orderLabels[1]);
        add(orderLabels[2]);
        add(orderLabels[3]);
        add(orderLabels[4]);
        add(orderLabels[5]);
        add(orderLabels[6]);
        add(orderLabels[7]);
        add(orderLabels[8]);
        add(orderLabels[9]);
        addOrderButton.addActionListener(e -> {
            // Add order
            TableOrder order = new TableOrder();
            int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter table number"));
            tableOrdersManager.add(order, tableNumber);
            orderLabels[tableNumber].setText("Table " + tableNumber + ": " + order.itemsQuantity() + " items");
        });
        addMenuItemButton.addActionListener(e -> {
            // Add menu item
            int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter table number"));
            String itemName = JOptionPane.showInputDialog("Enter item name");
            String description = JOptionPane.showInputDialog("Enter item description");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Enter item price"));
            tableOrdersManager.getOrder(tableNumber).add(new MenuItem(itemName, description, price));
            orderLabels[tableNumber].setText("Table " + tableNumber + ": " + tableOrdersManager.getOrder(tableNumber).itemsQuantity() + " items: " + Arrays.toString(tableOrdersManager.getOrder(tableNumber).itemsNames()) + " | cost: " + tableOrdersManager.getOrder(tableNumber).costTotal());
        });
        removeMenuItemButton.addActionListener(e -> {
            // Remove menu item
            int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter table number"));
            String itemName = JOptionPane.showInputDialog("Enter item name");
            tableOrdersManager.getOrder(tableNumber).remove(itemName);
            orderLabels[tableNumber].setText("Table " + tableNumber + ": " + tableOrdersManager.getOrder(tableNumber).itemsQuantity() + " items: " + Arrays.toString(tableOrdersManager.getOrder(tableNumber).itemsNames()) + " | cost: " + tableOrdersManager.getOrder(tableNumber).costTotal());
        });
        removeOrderButton.addActionListener(e -> {
            // Remove order
            int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter table number"));
            tableOrdersManager.remove(tableNumber);
            orderLabels[tableNumber].setText("Table " + tableNumber + ": empty");
        });
        setSize(700, 300);
        pack();
    }
    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.init();
    }
}