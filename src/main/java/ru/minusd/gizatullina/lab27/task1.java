package ru.minusd.gizatullina.lab27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class task1 {
    public static <T> Set<T> getInstance(Set<T> hashSet)
    {
        Set<T> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);
        return treeSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Алсу");
        hashSet.add("Лена");
        hashSet.add("Саша");

        Set<String> treeSet = getInstance(hashSet);
        System.out.println("Преобразование hashset в treeset: ");
        System.out.println(treeSet);
    }
}