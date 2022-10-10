package ru.minusd.zakatov.lab06.task12.commands;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;

public abstract class Command {
    protected CommandType type;
    protected MyStringBuilder editor;
    protected String backup;

    public Command(MyStringBuilder editor) {
        this.editor = editor;
        this.backup = editor.getText().toString();
    }

    public void undo() {
        editor.setText(backup);
    }

    public CommandType getType() {
        return type;
    }

    abstract public void execute();
}
