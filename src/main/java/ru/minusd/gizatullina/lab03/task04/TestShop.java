package ru.minusd.gizatullina.lab03.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        var shop = new Shop();
        shop.add(new Computer("Test 1"));
        shop.add(new Computer("Test 2"));
        shop.add(new Computer("Test 3"));
        shop.add(new Computer("Test 4"));

        var tmp = new Computer("Test 5");
        shop.add(tmp);

        System.out.println(shop);
        System.out.println(shop.find("Test 5").toString());

        shop.del(tmp);
        System.out.println(shop.find("Test 5"));
    }
}

