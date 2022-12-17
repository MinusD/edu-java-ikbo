package ru.minusd.vasiliev.lab31.classes.utility;

import ru.minusd.vasiliev.lab31.classes.items.MenuItem;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListNode {
    private ListNode next;
    private MenuItem value;

    public ListNode(MenuItem value) {
        this.value = value;
    }

    public ListNode(MenuItem value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public MenuItem getValue() {
        return value;
    }

    public void setValue(MenuItem value) {
        this.value = value;
    }

    public static ListNode fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return ListNode.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ListNode fromString(String state) {
        if (state.equals("null")) {
            return null;
        }
        var value = state.split("value=")[1].split("}")[0];
        return new ListNode(MenuItem.fromString(value), fromString(state.split("next=")[1].split(",")[0]));
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }
}
