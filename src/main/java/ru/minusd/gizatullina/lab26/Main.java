package ru.minusd.gizatullina.lab26;

public class Main {
    public static void main(String[] args) {
        var hash = new Hash();
        hash.add("Алсу");
        hash.add("Саша");
        hash.add("Маша");
        System.out.println("Нахождение Алсу в хеше: ");
        System.out.println(hash.find("Алсу"));
        System.out.println("Нахождение Евгения в хеше: ");
        System.out.println(hash.find("Евгений"));
        hash.delete("Алсу");
        System.out.println("Нахождение Алсу в хеше после удаления: ");
        System.out.println(hash.find("Алсу"));
    }
}