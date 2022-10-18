package ru.minusd.vasiliev.lab06.task13;

public class Test {
    public static void main(String[] args) {
        var builder = new StringBuilderPublisher("TestStr");
        var listener = new BuilderListener();
        builder.events.subscribe("append", listener);
        builder.events.subscribe("insert", listener);
        builder.events.subscribe("replace", listener);
        builder.append("393939");
        builder.insert(2, "aeoaoeoa");
        builder.replace(2, 5, "abeba");
        System.out.println(builder);
    }
}
