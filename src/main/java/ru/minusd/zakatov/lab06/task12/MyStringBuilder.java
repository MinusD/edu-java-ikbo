package ru.minusd.zakatov.lab06.task12;

import ru.minusd.zakatov.lab06.task12.commands.*;
import ru.minusd.zakatov.lab06.task13.Observer;

import java.util.ArrayList;
import java.util.List;

public class MyStringBuilder {
    private StringBuilder text;
    private List<Command> commands = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public MyStringBuilder() {
        this.text = new StringBuilder();
    }

    public MyStringBuilder(String text) {
        this.text = new StringBuilder(text);
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(String text) {
        this.text = new StringBuilder(text);
    }

    public String toString() {
        return text.toString();
    }

    public MyStringBuilder undo() {
        if (commands.isEmpty()) {
            return this;
        }

        commands.get(commands.size() - 1).undo();
        notifySubscribers(CommandType.UNDO);
        commands.remove(commands.size() - 1);
        return this;
    }

    public void executeCommand(Command command) {
        command.execute();
        notifySubscribers(command.getType());
        commands.add(command);
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifySubscribers(CommandType commandType) {
        for (var observer : observers) {
            observer.update(commandType,this);
        }
    }

    // Commands
    public MyStringBuilder append(String s) {
        executeCommand(new AppendCommand(this, s));
        return this;
    }

    public MyStringBuilder insert(int offset, String str) {
        executeCommand(new InsertCommand(this, offset, str));
        return this;
    }

    public MyStringBuilder replace(int start, int end, String str) {
        executeCommand(new ReplaceCommand(this, start, end, str));
        return this;
    }

    public MyStringBuilder replace(int start, String str) {
        executeCommand(new ReplaceCommand(this, start, text.length(), str));
        return this;
    }

    public MyStringBuilder reverse() {
        executeCommand(new ReverseCommand(this));
        return this;
    }

    public MyStringBuilder slice(int start, int end) {
        executeCommand(new SliceCommand(this, start, end));
        return this;
    }

    public MyStringBuilder slice(int start) {
        executeCommand(new SliceCommand(this, start));
        return this;
    }
}
