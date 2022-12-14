package ru.minusd.vasiliev.lab31.classes.utility;

import ru.minusd.vasiliev.lab31.classes.orders.InternetOrder;
import ru.minusd.vasiliev.lab31.classes.orders.TableOrder;
import ru.minusd.vasiliev.lab31.interfaces.Order;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class QueueNode {
    private QueueNode next;
    private QueueNode prev;
    private Order value;

    public QueueNode(Order value) {
        this.value = value;
    }

    public QueueNode(Order value, QueueNode next, QueueNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public QueueNode getPrev() {
        return prev;
    }

    public void setPrev(QueueNode prev) {
        this.prev = prev;
    }

    public Order getValue() {
        return value;
    }

    public void setValue(Order value) {
        this.value = value;
    }

    public static QueueNode fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return QueueNode.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static QueueNode fromString(String state) {
        if (state.equals("null")) {
            return null;
        }
        var value = state.split("value=")[1].split("}")[0];
        return new QueueNode(value.startsWith("InternetOrder") ? InternetOrder.fromString(value) : TableOrder.fromString(value),
                QueueNode.fromString(state.split("next=")[1].split(", prev=")[0]),
                QueueNode.fromString(state.split("prev=")[1].split(", value=")[0])
        );
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "next=" + next.toString() +
                ", prev=" + prev.toString() +
                ", value=" + value.toString() +
                '}';
    }
}
