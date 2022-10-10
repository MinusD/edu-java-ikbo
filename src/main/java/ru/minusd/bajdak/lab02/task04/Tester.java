package ru.minusd.bajdak.lab02.task04;

public class Tester {
    public static void main(String[] args) {
        var shop = new Shop();
        shop.append(new Computer("Test 1"));
        shop.append(new Computer("Test 2"));
        shop.append(new Computer("Test 3"));
        shop.append(new Computer("Test 4"));
        shop.append(new Computer("Test 5"));

        for (var computer : shop.getData()){
            System.out.println(computer.toString());
        }
    }
}
