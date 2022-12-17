package ru.minusd.zakatov.lab06.task12.commands;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;

public class ReplaceCommand extends Command {
    private int start;
    private int end;
    private String str;

    public ReplaceCommand(MyStringBuilder editor, int start, int end, String str) {
        super(editor);
        this.start = start;
        this.end = end;
        this.str = str;
        this.type = CommandType.REPLACE;
    }

    @Override
    public void execute() {
        editor.getText().replace(start, end, str);
    }
}
