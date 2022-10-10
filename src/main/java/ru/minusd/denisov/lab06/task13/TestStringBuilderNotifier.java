package ru.minusd.denisov.lab06.task13;

public class TestStringBuilderNotifier {
    public static void main(String[] args) {
        StringBuilderNotifier sbn = new StringBuilderNotifier("Hello");

        sbn.actionManager.addActionListener(StringBuilderAction.APPEND,
                () -> System.out.println("Вызван метод append()"));
        sbn.actionManager.addActionListener(StringBuilderAction.APPENDCODEPOINT,
                () -> System.out.println("Вызван метод appendCodePoint()"));
        sbn.actionManager.addActionListener(StringBuilderAction.DELETE,
                () -> System.out.println("Вызван метод delete()"));
        sbn.actionManager.addActionListener(StringBuilderAction.DELETECHARAT,
                () -> System.out.println("Вызван метод deleteCharAt()"));
        sbn.actionManager.addActionListener(StringBuilderAction.REPLACE,
                () -> System.out.println("Вызван метод replace()"));
        sbn.actionManager.addActionListener(StringBuilderAction.INSERT,
                () -> System.out.println("Вызван метод insert()"));
        sbn.actionManager.addActionListener(StringBuilderAction.REVERSE,
                () -> System.out.println("Вызван метод reverse()"));

        sbn.append(" world!")  // Вызван метод append()
                .append(" How are you?")  // Вызван метод append()
                .append(" I'm fine, thank you!")  // Вызван метод append()
                .delete(34, 46)  // Вызван метод delete()
                .reverse()  // Вызван метод reverse()
                .replace(0, 5, "Hello, world!");  // Вызван метод replace()

    }
}
