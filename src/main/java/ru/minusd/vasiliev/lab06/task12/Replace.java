package ru.minusd.vasiliev.lab06.task12;

public class Replace implements Command {
    private String backup;

    public StringBuilder replace(StringBuilder target, int start, int end, String str) {
        backup = target.toString();
        target.replace(start, end, str);
        return target;
    }

    @Override
    public void undo(StringBuilder target) {
        target.replace(0, target.length(), backup);
    }
}
