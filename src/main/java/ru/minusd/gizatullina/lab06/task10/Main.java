package ru.minusd.gizatullina.lab06.task10;

public class Main {
    public static void main(String[] args) {
        var cpu1 = new Processor(3400, 4);
        var cpu2 = new Processor(5600, 8);
        var cpu3 = new Processor(7000, 16);

        var memory1 = new Memory(4096, 4100);
        var memory2 = new Memory(1024, 3400);
        var memory3 = new Memory(2048, 2800);

        var monitor1 = new Monitor(27, 60);
        var monitor2 = new Monitor(18, 120);
        var monitor3 = new Monitor(40, 360);

        var comp1 = new Computer(memory1, monitor2, cpu1, Mark.MARK2, "Killer 4000");
        var comp2 = new Computer(memory2, monitor3, cpu1, Mark.MARK3, "Killer 6000");
        var comp3 = new Computer(memory3, monitor1, cpu2, Mark.MARK4, "Burn X");

        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp3);
        System.out.println("===========");
        var shop = new Shop();
        shop.addComputer(comp1);
        shop.addComputer(comp2);
        shop.addComputer(comp3);
        System.out.println(shop.findByName("Burn X"));
        shop.deleteByName("Burn X");
        System.out.println(shop.findByName("Burn X"));
    }
}
