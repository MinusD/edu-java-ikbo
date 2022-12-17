package ru.minusd.zakatov.lab06.task12.commands;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;

public class ReverseCommand extends Command {
    public ReverseCommand(MyStringBuilder editor) {
        super(editor);
        this.type = CommandType.REVERSE;
    }

    @Override
    public void execute() {
        editor.getText().reverse();
    }
}
