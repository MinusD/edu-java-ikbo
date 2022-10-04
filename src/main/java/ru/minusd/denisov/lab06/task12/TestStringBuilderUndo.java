package ru.minusd.denisov.lab06.task12;

public class TestStringBuilderUndo {
    public static void main(String[] args) {
        StringBuilderUndo sbu = new StringBuilderUndo("Hello");

        sbu.append(" world!")  // Hello world!
                .append(" How are you?")  // Hello world! How are you?
                .append(" I'm fine, thank you!")  // Hello world! How are you? I'm fine, thank you!
                .delete(34, 46);  // Hello world! How are you? I'm fine
        System.out.println(sbu);

        sbu.undo();  // Hello world! How are you? I'm fine, thank you!
        System.out.println(sbu);

        sbu.undo();  // Hello world! How are you?
        System.out.println(sbu);

        sbu.undo();  // Hello world!
        System.out.println(sbu);

        sbu.reverse();  // !dlrow olleH
        System.out.println(sbu);

        sbu.undo();  // Hello world!
        System.out.println(sbu);
    }
}
