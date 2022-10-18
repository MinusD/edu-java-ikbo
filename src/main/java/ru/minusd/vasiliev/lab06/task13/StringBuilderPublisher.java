package ru.minusd.vasiliev.lab06.task13;

public class StringBuilderPublisher {
    public EventManager events;
    private StringBuilder builder;

    public StringBuilderPublisher() {
        events = new EventManager("insert", "append", "replace");
        builder = new StringBuilder();
    }

    public StringBuilderPublisher(String initial) {
        events = new EventManager("insert", "append", "replace");
        builder = new StringBuilder(initial);
    }

    public StringBuilder append(Object obj) {
        builder.append(obj);
        events.notify("append", builder);
        return builder;
    }

    public StringBuilder insert(int offset, Object obj) {
        builder.insert(offset, obj);
        events.notify("insert", builder);
        return builder;
    }

    public StringBuilder replace(int start, int end, String str) {
        builder.replace(start, end, str);
        events.notify("replace", builder);
        return builder;
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
