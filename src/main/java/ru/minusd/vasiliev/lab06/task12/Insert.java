package ru.minusd.vasiliev.lab06.task12;

public class Insert implements Command{
    private String backup;

    public StringBuilder insert(StringBuilder target, int offset, Object obj) {
        backup = target.toString();
        target.insert(offset, obj);
        return target;
    }

    @Override
    public void undo(StringBuilder target) {
        target.replace(0, target.length(), backup);
    }
}
