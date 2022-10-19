package ru.minusd.vasiliev.lab06.task12;

public class Test {
    public static void main(String[] args) {
        var builder = new StringBuilderUndo("Sample");
        builder.append("AAAAA");
        System.out.println(builder);
        builder.undo();
        System.out.println(builder);
        builder.replace(2, 4, "aboba");
        System.out.println(builder);
        builder.insert(1, "bbebebebe");
        System.out.println(builder);
        builder.undo();
        builder.undo();
        System.out.println(builder);
    }
}
