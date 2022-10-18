package ru.minusd.vasiliev.lab07.task78;

public class Magazine implements Printable{
    private final String content;

    public Magazine(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Содержимое журнала: " + content);
    }

    public static void printMagazines(Printable[] printables) {
        for (var printable: printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
