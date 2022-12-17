package ru.minusd.zakatov.lab06.task12.commands;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;

public class SliceCommand extends Command {
    private int start;
    private int end;

    public SliceCommand(MyStringBuilder editor, int start, int end) {
        super(editor);
        this.start = start;
        this.end = end;
        this.type = CommandType.SLICE;
    }

    public SliceCommand(MyStringBuilder editor, int start) {
        super(editor);
        this.start = start;
        this.end = -1;
    }

    @Override
    public void execute() {
        if (end == -1) {
            editor.setText(editor.getText().substring(start));
            return;
        }
        editor.setText(editor.getText().substring(start, end));
    }
}
