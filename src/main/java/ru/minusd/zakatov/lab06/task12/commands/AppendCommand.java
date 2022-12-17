package ru.minusd.zakatov.lab06.task12.commands;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;

public class AppendCommand extends Command {
    private String str;

    public AppendCommand(MyStringBuilder editor, String str) {
        super(editor);
        this.str = str;
        this.type = CommandType.APPEND;
    }

    @Override
    public void execute() {
        editor.getText().append(str);
    }
}
