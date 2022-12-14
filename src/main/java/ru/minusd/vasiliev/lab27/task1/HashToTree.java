package ru.minusd.vasiliev.lab27.task1;

import java.util.HashSet;
import java.util.TreeSet;

public class HashToTree {
    public static void main(String[] args) {
        var hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        var treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
