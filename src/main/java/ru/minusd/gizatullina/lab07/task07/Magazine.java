package ru.minusd.gizatullina.lab07.task07;

public class Magazine implements Printable {
    private int cost;
    private String magazine;

    public Magazine() {
    }

    public Magazine( String magazine, int cost) {
        this.magazine = magazine;
        this.cost=cost;
    }

    @Override
    public void print() {
        System.out.println("Magazine : " + magazine);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable element : printable) {
            if(element instanceof Magazine)
                element.print();
        }
    }
}
