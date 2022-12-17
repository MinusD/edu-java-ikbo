package ru.minusd.gizatullina.lab06.task11;

public class Main {
    public static void main(String[] args) {
        var temp = new Translation(-40);
        System.out.print("Covert to Kelvin: ");
        System.out.println(temp.convertToKelvin());
        System.out.print("Covert to Fahrenheit: ");
        System.out.println(temp.convertTotFahrenheit());
    }
}
