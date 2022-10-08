package ru.minusd.zakatov.lab06.task12;

public class TestMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder stringBuilder = new MyStringBuilder("Hello, world!");
        stringBuilder.append("My name is Igor!").insert(0, "How are you?");

        System.out.println(stringBuilder);
        stringBuilder.undo().undo().reverse();
        System.out.println(stringBuilder);
        stringBuilder.undo().replace(7, "Igor");
        System.out.println(stringBuilder);
    }
}
