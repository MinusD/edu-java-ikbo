package ru.minusd.vasiliev.lab06.task12;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderUndo {
    private final List<Command> commands = new ArrayList<Command>();
    private final StringBuilder builder;

    public StringBuilderUndo() { builder = new StringBuilder(); }

    public StringBuilderUndo(String str) {
        builder = new StringBuilder(str);
    }

    public StringBuilder append(Object obj) {
        var comm = new Append();
        comm.append(builder, obj);
        commands.add(comm);
        return builder;
    }

    public StringBuilder insert(int offset, Object obj) {
        var comm = new Insert();
        comm.insert(builder, offset, obj);
        commands.add(comm);
        return builder;
    }

    public StringBuilder replace(int start, int end, String str) {
        var comm = new Replace();
        comm.replace(builder, start, end, str);
        commands.add(comm);
        return builder;
    }

    public void undo() {
        var comm = commands.get(commands.size()-1);
        commands.remove(comm);
        comm.undo(builder);
    }

    public String toString() {
        return builder.toString();
    }
}
