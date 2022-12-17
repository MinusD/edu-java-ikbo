package ru.minusd.zakatov.lab06.task13;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;
import ru.minusd.zakatov.lab06.task12.commands.CommandType;

public interface Observer {
    void update(CommandType commandType, MyStringBuilder stringBuilder);
}
