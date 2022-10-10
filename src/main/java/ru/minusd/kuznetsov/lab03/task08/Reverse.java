package ru.minusd.kuznetsov.lab03.task08;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) {
        strings.add("ABC");
        strings.add("DFG");
        strings.add("HIJ");
        Collections.reverse(strings);
        for (String s :
                strings) {
            System.out.println(s);
        }
    }
}
