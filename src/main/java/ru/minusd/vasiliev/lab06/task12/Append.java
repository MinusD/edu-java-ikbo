package ru.minusd.vasiliev.lab06.task12;

public class Append implements Command {
    private String backup;

    public StringBuilder append(StringBuilder target, Object obj) {
        backup = target.toString();
        target.append(obj);
        return target;
    }

    @Override
    public void undo(StringBuilder target) {
        target.replace(0, target.length(), backup);
    }
}
