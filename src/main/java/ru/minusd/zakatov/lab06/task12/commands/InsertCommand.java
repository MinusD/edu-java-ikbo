package ru.minusd.zakatov.lab06.task12.commands;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;

public class InsertCommand extends Command {
    private int offset;
    private String str;

    public InsertCommand(MyStringBuilder editor, int offset, String str) {
        super(editor);
        this.offset = offset;
        this.str = str;
        this.type = CommandType.INSERT;
    }

    @Override
    public void execute() {
        editor.getText().insert(offset, str);
    }
}
