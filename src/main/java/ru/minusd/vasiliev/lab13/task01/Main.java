package ru.minusd.vasiliev.lab13.task01;

public class Main {
    public static void main(String[] args) {
        StringMethod("I like Java!!!");
        StringMethod("Aeeaoeaeaoeo");
    }

    private static void StringMethod(String str) {
        System.out.printf("Последний символ строки: %c\n", str.charAt(str.length()-1));
        System.out.printf("Заканчивается на \"!!!\": %b\n", str.endsWith("!!!"));
        System.out.printf("Начинается на \"I like\": %b\n", str.startsWith("I like"));
        System.out.printf("Содержит подстроку \"Java\": %b\n", str.contains("Java"));
        if (str.contains("Java")) {
            System.out.printf("Индекс вхождения: %d\n", str.indexOf("Java"));
            System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
        }
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
