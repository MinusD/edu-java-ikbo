package ru.minusd.zakatov.lab06.task13;

import ru.minusd.zakatov.lab06.task12.MyStringBuilder;

public class TestObservers {
    public static void main(String[] args) {
        MyStringBuilder stringBuilder = new MyStringBuilder();

        Observer whatHappened = (commandType, sb) -> {
            System.out.println("Command: " + commandType);
        };

        stringBuilder.subscribe(whatHappened);

        stringBuilder.append("Hello, world!");
        stringBuilder.replace(7, "Igor");
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);

        stringBuilder.unsubscribe(whatHappened);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
