package ru.minusd.vasiliev.lab20.task02;

public class Test {
    public static void main(String[] args) {
        GenericClass<Integer, String, Double> genericClass = new GenericClass<>(1, "2", 3.0);
        System.out.println("Значение T: " + genericClass.getT());
        System.out.println("Значение V: " + genericClass.getV());
        System.out.println("Значение K: " + genericClass.getK());
        genericClass.printClasses();
    }
}
